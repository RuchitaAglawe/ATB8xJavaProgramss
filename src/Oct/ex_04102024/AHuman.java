package Oct.ex_04102024;

public class AHuman {
    String eyes_color;
    String planet = "AHuman";
    String name;
    long aadhar_card_number;

    // Default constructor
    AHuman(){
        System.out.println("I will be called, Object is created");
        // Write a code here which will automatically called when Object is created
        // Read a File text
        // Read a CSV file, Excel file here. ....
    }
    // Parameterized constructors
    AHuman(String name){
        System.out.println("Hi, I am Param Constructors");
       this.name = name;
    }
    // Return - void, data-type
    void walk() {System.out.println("NRNR"); //No return type no argument
    }
    int talk(){
        System.out.println("RTNA"); // Return type with no argument
        return 10;
    }
    String sleep(String name) {
        System.out.println("Sleeping");
        System.out.println("RTWA"); // Return type with argument
        return "I am sleeping";
    }
    void eat(String name){
        System.out.println("NRWA"); // No return type with argument
        System.out.println("Eat");
    }
}

// NRNA- No return type no argument.
// NRNA- Return type with no argument.
// RTWA- Return type with argument.
// NRWA- No return type with argument.

