public class Congratulations {

    public static void display() {
        String[] congratsArt = {
            "****************************************************",
            "* *",
            "* C O N G R A T U L A T I O N S ! ! !           *",
            "* *",
            "* You are a true Sports Master!            *",
            "* *",
            "****************************************************",
            "MADE BY: LAKSHAY TYAGI",
            "ALL RIGHTS RESERVED"
        };

        System.out.println("\n\nAmazing Performance!");
        try {
            for (String line : congratsArt) {
                System.out.println(line);
                
                Thread.sleep(150); 
            }
        } catch (InterruptedException e) {
        
            Thread.currentThread().interrupt(); 
            for (String line : congratsArt) {
                System.out.println(line);
            }
        }
        System.out.println();
    }
}
