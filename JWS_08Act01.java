

interface HasWings {
public int getNumberOfWings();
}
abstract class Insect implements HasWings {
    abstract int getNumberOfLegs();
}
public class Dragonfly extends Insect {
    int getNumberOfLegs() {
        return 6;
    }
}
public class JWS_08Act01 {
    public static void main(String[] args) {
    }
}
