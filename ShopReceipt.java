import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.List;

class Product {
    // (unchanged)

    public void displayOnTextArea(JTextArea textArea) {
        textArea.append(String.format("%-15s %-15s %-15d %-15.2f %15.4f%n", productId, productName, quantity, price, getTotalPrice()));
    }

    // (unchanged)
}

public class ShopReceipt extends JFrame {

    private static int receiptNumberCounter = 1000; // Starting receipt number

    private JTextArea textArea;

    public ShopReceipt() {
        initUI();
    }

    private void initUI() {
        setTitle("Shop Receipt");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);

        // Rest of your code here

        // Display the JFrame
        setVisible(true);
    }

    private void generateReceipt() {
        // Rest of your code here
        // Replace System.out.println with textArea.append

        textArea.append("\t\t\t\t-------------------- Shop Receipt -----------------\n");
        textArea.append("\t\t\t\t\t "+"  "+"     Gar Mart Grocery Shop\n");
        textArea.append("\t\t\t\t\t         6/9 Para sa Streets \n");
        textArea.append("\t\t\t\t\t\t"  +"    " +" Baliuag City\n");
        textArea.append("\n");
        textArea.append("BIR Permit#03AWBPP8756K592"+"\t\t\t\t\t\t\t\tContact: (+63) 9988776655\n");

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        String[] days = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        textArea.append("Date: " + formatter.format(date) + "  " + days[calendar.get(Calendar.DAY_OF_WEEK) - 1] + "\n");

        textArea.append("Enter Customer Name: ");
        String customerName = JOptionPane.showInputDialog("Enter Customer Name:");

        // New feature: Customer Membership
        String memberInput = JOptionPane.showInputDialog("Are you a member? (yes/no): ");
        boolean isMember = memberInput != null && memberInput.trim().equalsIgnoreCase("yes");

        List<Product> products = new ArrayList<>();

        do {
            // JOptionPane dialogs for input

            // Replace System.out.println with textArea.append

            String productId = JOptionPane.showInputDialog("Product ID: ");
            String productName = JOptionPane.showInputDialog("Product Name: ");

            int quantity = 0;
            try {
                String quantityStr = JOptionPane.showInputDialog("Quantity: ");
                quantity = Integer.parseInt(quantityStr);
                if (quantity <= 0) {
                    JOptionPane.showMessageDialog(null, "Invalid quantity. Please enter a positive value.");
                    continue;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input for quantity. Please enter a valid number.");
                continue;
            }

            double price = 0.0;
            try {
                String priceStr = JOptionPane.showInputDialog("Price (per unit): ");
                price = Double.parseDouble(priceStr);
                if (price <= 0) {
                    JOptionPane.showMessageDialog(null, "Invalid price. Please enter a positive value.");
                    continue;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input for price. Please enter a valid number.");
                continue;
            }

            Product product = new Product(productId, productName, quantity, price);
            products.add(product);

            // Overwrite System.out.print with textArea.append

            overAllPrice += product.getTotalPrice();

            String choiceStr = JOptionPane.showInputDialog("Want to add more items? (y or n): ");
            choice = choiceStr != null && !choiceStr.trim().isEmpty() ? choiceStr.charAt(0) : 'n';

        } while (choice == 'y' || choice == 'Y');

        // New feature: Itemized Receipt
        textArea.append("\n\t\t\t\t-------------------- Itemized Receipt -----------------\n");
        Product.displayFormat();
        int totalItemsSold = 0;
        for (Product p : products) {
            p.displayOnTextArea(textArea);
            totalItemsSold += p.getQuantity();
        }

        textArea.append("\n\t\t\t\t\t\t\t\t\tTotal Items Sold: " + totalItemsSold + "\n");
        textArea.append("\t\t\t\t\t\t\t\t\tTotal Amount: " + overAllPrice + "\n");

        // New feature: Membership Discount
        if (isMember) {
            discount = overAllPrice * 5 / 100; // 5% discount for members
            textArea.append("\t\t\t\t\t\t\t\t\tMembership Discount (Rs.): "  + discount + "\n");
        }

        subtotal = overAllPrice - discount;
        textArea.append("\t\t\t\t\t\t\t\t\tSubtotal: " + subtotal + "\n");

        tax = overAllPrice * 12 / 100;
        textArea.append("\t\t\t\t\t\t\t\t\tTAX (%): " + tax + "\n");

        textArea.append("\t\t\t\t\t\t\t\t\tInvoice Total: " + (subtotal + tax) + "\n");

        // Payment Method
        String paymentMethod = JOptionPane.showInputDialog("\t\t\t\t\t\t\t\t\tPay (Cash/Card/Other): ");
        textArea.append("\t\t\t\t\t\t\t\t\tPayment Method: " + paymentMethod + "\n");

        // Payment and Cash Change
        String paymentAmountStr = JOptionPane.showInputDialog("\t\t\t\t\t\t\t\t\tEnter payment amount: ");
        // Continue with the rest of the code...
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ShopReceipt().generateReceipt();
        });
    }
}
