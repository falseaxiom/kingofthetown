import java.util.Scanner;

public class quizzy {
    // individual tallies for each character
    private static int conrad;
    private static int jamie;
    private static int minoshka;
    private static int senator;

    public static void main(String[] args) {
        // start scanning for answers
        Scanner userInput = new Scanner(System.in);
        String curr;
        double d;
        StringBuilder extry = new StringBuilder();

        // introduction
        System.out.println();
        System.out.println("Hello! Welcome to KING OF THE TOWN: An Inaccurate Personality Test and a Living Comic Strip.");
        System.out.println("To start, we're going to be asking you a few questions. Please answer honestly--but try not to take us too seriously, either.");
        System.out.println();

        // QUIZ 1
        // question 1
        System.out.println("On a scale of 0-100, how are you feeling today?");
        System.out.println("(Please type an integer between 0-100 and press Enter.)");
        while (true) {
            try {
                curr = userInput.nextLine();
                d = Double.parseDouble(curr);
                break;
            } catch (NumberFormatException e) {
                System.out.println("try again!");
            };
        }
        while (d < 0 || d > 100) {
            System.out.println("try again!");
            curr = userInput.nextLine();
        }
        if (d < 25) jamie++;
        else if (d < 50) senator++;
        else if (d < 75) minoshka++;
        else conrad++;
        System.out.println();

        // question 2
        System.out.println("Would you rather be at home or out and about?");
        System.out.println("(Please type either 'Home' or 'Out' and press Enter.)");
        curr = userInput.nextLine().toLowerCase();
        while (!curr.equals("home") && !curr.equals("out")) {
            System.out.println("try again!");
            curr = userInput.nextLine();
        }
        if (curr.equals("home")) {jamie++; conrad++;}
        else {minoshka++; senator++;}
        System.out.println();

        // question 3
        System.out.println("When you think about the world today, are you generally optimistic or generally pessimistic?");
        System.out.println("(Please type either 'Optimistic' or 'Pessimistic' and press Enter.)");
        curr = userInput.nextLine().toLowerCase();
        while (!curr.equals("optimistic") && !curr.equals("pessimistic")) {
            System.out.println("try again!");
            curr = userInput.nextLine();
        }
        if (curr.equals("optimistic")) {conrad++; minoshka++;}
        else {jamie++; senator++;}
        System.out.println();

        System.out.println();
        System.out.println("Please watch Panel 1 at the following url before answering the next question: https://youtu.be/dQw4w9WgXcQ");
        System.out.println();

        // question 4
        System.out.println("Do you want to go to the Multiplatinum Metropolis, or do you want to stay in Stamtown?");
        System.out.println("(Please type either 'Go' or 'Stay' and press Enter.)");
        curr = userInput.nextLine().toLowerCase();
        while (!curr.equals("go") && !curr.equals("stay")) {
            System.out.println("try again!");
            curr = userInput.nextLine();
        }
        if (curr.equals("go")) {jamie++; minoshka++; extry.append("G");}
        else {conrad++; senator++; extry.append("S");}
        System.out.println();

        System.out.println("Congratulations! You have completed PART 1 of this adventure.");
        System.out.println("Please input the following code at the next machine:");
        System.out.println();
        System.out.println(Integer.toString(conrad) + Integer.toString(jamie) + Integer.toString(minoshka) + Integer.toString(senator) + extry.toString());
        System.out.println();

        userInput.close();
    }
}
