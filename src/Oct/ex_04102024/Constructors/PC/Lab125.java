package Oct.ex_04102024.Constructors.PC;

public class Lab125 {
    public static void main(String[] args) {
        AHuman amit = new AHuman();
        AHuman pramod = new AHuman("Pramod");
        AHuman vijay = new AHuman("Vijay");

       // amit.name = "Amit";
      //  pramod.name = "Pramod";

        System.out.println(amit.planet);
        System.out.println(pramod.planet);

        System.out.println(amit.name);
        System.out.println(pramod.name);
        System.out.println(vijay.name);
    }
}
