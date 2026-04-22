import java.util.Scanner;

public class play {
    public static void main(String[] args) {
        
        boolean stillPlaying = true;

        // Takes input from the user.
        Scanner userInput = new Scanner(System.in);

        // Stores user's responses
        String userResponse = "";

        // Greets the user
        System.out.println("******************");
        System.out.println("Goodmorning Gregor Samsa. You have entered THE METAMORPHOSIS...");
        System.out.println("******************");
        System.out.println("You awake one morning from troubled dreams to discover that you have been transformed into a"
                            + " horrible vermin. You lift your head to peer down at your body to discover that you are no"
                            + " longer human at all, as your eyes lay upon your newly brown belly, slightly domed and divided"
                            + " by arches into stiff sections. Your many tiny legs wave around helplessly in the air as you bedding"
                            + "slips, hardly able to cover your body.");
        System.out.println("'What's happened to me?' ,you try to say. But all that leaves your mouth is a horrible hissing.");

        // Instructions to user
        System.out.println("Enter WIN to win, LOSE to lose, anything else to continue playing.");

        // The do...while structure means we execute the body of the loop once before checking the stopping condition
        do {
            // ************************************************
            // The stuff that happens in your game will go here
            //  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓
            System.out.println("You are still playing. Follow the instructions if you want to win/lose...");
            userResponse = userInput.nextLine().toUpperCase();

            // ***********************************************************************
            // And as the player interacts, you'll check to see if the game should end
            //  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓
            if (userResponse.equals("GIVE UP")) {
                stillPlaying = false;
            }
        } while (stillPlaying);

        // Tidy up
        userInput.close();

        // Once you exit the loop, you may need to deal with various possible stopping conditions
        if (userResponse.equals("WIN")) {
            System.out.println("Yay, you won!");
        } else { // userResponse.equals("LOSE")
            System.out.println("Better luck next time.");
        }

    }

}

