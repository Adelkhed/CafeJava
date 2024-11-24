public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly ";
        String readyMessage = ", your order is ready ";
        String displayTotalMessage = "Your total is $ ";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffeePrice = 1.2;
        double lattePrice = 2.5;
        double cappuccinoPrice =2.2;
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";


        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = false;
        boolean jimmyCommand =false;
        double jimmyDifferencePrice = lattePrice -dripCoffeePrice; 
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
        if (isReadyOrder1) {
            System.out.println(readyMessage + customer1);
           } else{
            System.out.println(pendingMessage + customer1);
           }
           if (isReadyOrder4) {
            System.out.println(readyMessage + customer4);
            System.out.println(displayTotalMessage + cappuccinoPrice);

           } else{
            System.out.println(pendingMessage + customer4);
           }
           if (isReadyOrder2) {
            System.out.println(readyMessage + customer2);
            System.out.println(displayTotalMessage + lattePrice * 2);

           } else{
            System.out.println(pendingMessage + customer2);
           }
        if (isReadyOrder3 && jimmyCommand){
            System.out.println(readyMessage + customer3);
            System.out.println(displayTotalMessage + dripCoffeePrice);

        } else{
            System.out.println(pendingMessage + customer3);
            System.out.println("Jimmy your  order the difference $  " + jimmyDifferencePrice);
        }

    }
}
