package Sept.ex_23092024;

public class Lab079 {
    public static void main(String[] args) {
        // Web Automation
        // I will ask user which browser you want me to run the code.
        // chrome -> execute chrome
        // firefox -> execute of firefox
        // edge -> edge cases.

        String browser = "edge";

        switch (browser) {
            case "chrome":
                System.out.println("Starting the chrome browser");
                // Further code to start the chrome
                // Webdriver driver = new chrome(); // Selenium code
                break;
            case "firefox":
                System.out.println("Starting the firefox browser");
                // Further code to start the firefox
                // Webdriver driver = new firefox(); // Selenium code
                break;
            case "edge":
                System.out.println("Execute the Edge Code");
                break;
            default:
                System.out.println("I have not idea which browser is this");
                break;
        }
    }
}
