package Sept.ex_23092024;

public class Lab083 {
    public static void main(String[] args) {
        // JDK 13
        int itemcode = 003;
        switch (itemcode) {
            case 001,002,005:
                System.out.println("All of the them are Electronic Gadget");
            case 004,006,007:
                System.out.println("This is Mech");
                break;
            default:
                System.out.println("None");
                break;
        }
    }
}
