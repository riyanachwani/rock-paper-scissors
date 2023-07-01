import java.util.*;

class RPS {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any one of the following inputs:  ");
        System.out.println("ROCK");
        System.out.println("PAPER");
        System.out.println("SCISSORS");
        System.out.println();
        String in = sc.nextLine();
        System.out.println();

        Random random = new Random();
        String computermove;
        int input = random.nextInt(3) + 1;
        if (input == 1)
            computermove = "ROCK";
        else if (input == 2)
            computermove = "PAPER";
        else
            computermove = "SCISSORS";

        System.out.println("Computer move is: " + computermove);
        System.out.println();

        if (in.equals(computermove))
            System.out.println("Game is Tie.");
        else if (in.equals("ROCK"))
            System.out.println(computermove.equals("PAPER") ? "Computer Wins" : "Player wins");
        else if (in.equals("PAPER"))
            System.out.println(computermove.equals("SCISSORS") ? "Computer Wins" : "Player wins");
        else
            System.out.println(computermove.equals("ROCK") ? "Computer Wins" : "Player wins");
            sc.close();
    }
}