import java.util.Scanner;
import java.util.Random;

public class RockPaperScissorsWithDisplay {
    public static void main(String[] args) {

        Random random = new Random();

        int player1Sum = 0, player2Sum = 0, player3Sum = 0, player4Sum = 0;
        System.out.println("Lets begin with ROCK, PAPER, SCISSORS!!\n");

        for (int i = 1; i <= 5; i++) {

            //create random numbers for players
            int min = 1;
            int max = 3;
            int player1 = min + random.nextInt(max);
            int player2 = min + random.nextInt(max);
            int player3 = min + random.nextInt(max);
            int player4 = min + random.nextInt(max);

            if (player1 == 1)
                System.out.print("|\tPlayer 1\t|");
            else if (player1 == 2)
                System.out.print("|\tPlayer 1\t|");
            else if (player1 == 3)
                System.out.print("|\tPlayer 1\t|");

            if (player2 == 1)
                System.out.print("|\tPlayer 2\t|");
            else if (player2 == 2)
                System.out.print("|\tPlayer 2\t|");
            else if (player2 == 3)
                System.out.print("|\tPlayer 2\t|");

            if (player3 == 1)
                System.out.print("|\tPlayer 3\t|");
            else if (player3 == 2)
                System.out.print("|\tPlayer 3\t|");
            else if (player3 == 3)
                System.out.print("|\tPlayer 3\t|");

            if (player4 == 1)
                System.out.print("|\tPlayer 4\t|");
            else if (player4 == 2)
                System.out.print("|\tPlayer 4\t|");
            else if (player4 == 3)
                System.out.print("|\tPlayer 4\t|");

            System.out.println("");
            if (player1 == 1)
                System.out.print("|\tROCK\t\t|");
            else if (player1 == 2)
                System.out.print("|\tPAPER\t\t|");
            else if (player1 == 3)
                System.out.print("|\tSCISSORS\t|");

            if (player2 == 1)
                System.out.print("|\tROCK\t\t|");
            else if (player2 == 2)
                System.out.print("|\tPAPER\t\t|");
            else if (player2 == 3)
                System.out.print("|\tSCISSORS\t|");

            if (player3 == 1)
                System.out.print("|\tROCK\t\t|");
            else if (player3 == 2)
                System.out.print("|\tPAPER\t\t|");
            else if (player3 == 3)
                System.out.print("|\tSCISSORS\t|");

            if (player4 == 1)
                System.out.print("|\tROCK\t\t|");
            else if (player4 == 2)
                System.out.print("|\tPAPER\t\t|");
            else if (player4 == 3)
                System.out.print("|\tSCISSORS\t|");

            System.out.println("\n");
            if (player1 == 1) {
                if (player2 == 2)            //12RvP
                    player2Sum += 1;
                else if (player2 == 3)       //12RvS
                    player1Sum += 1;
            }
            if (player1 == 1) {
                if (player3 == 2)            //13RvP
                    player3Sum += 1;
                else if (player3 == 3)       //13RvS
                    player1Sum += 1;
            }
            if (player1 == 1) {
                if (player4 == 2)            //14RvP
                    player4Sum += 1;
                else if (player4 == 3)       //14RvS
                    player1Sum += 1;
            }
            if (player1 == 2) {
                if (player2 == 1)            //12PvR
                    player1Sum += 1;
                else if (player2 == 3)        //12PvS
                    player2Sum += 1;
            }
            if (player1 == 2) {
                if (player3 == 1)            //13PvR
                    player1Sum += 1;
                else if (player3 == 3)        //13PvS
                    player3Sum += 1;
            }
            if (player1 == 2) {
                if (player4 == 1)            //14PvR
                    player1Sum += 1;
                else if (player4 == 3)        //14PvS
                    player4Sum += 1;
            }
            if (player1 == 3) {
                if (player2 == 1)            //12SvR
                    player2Sum += 1;
                else if (player2 == 2)       //12SvP
                    player1Sum += 1;
            }
            if (player1 == 3) {
                if (player3 == 1)            //13SvR
                    player3Sum += 1;
                else if (player3 == 2)       //13SvP
                    player1Sum += 1;
            }
            if (player1 == 3) {
                if (player4 == 1)            //14SvR
                    player4Sum += 1;
                else if (player4 == 2)       //14SvP
                    player1Sum += 1;
            }

            if (player2 == 1) {
                if (player1 == 2)            //21RvP
                    player1Sum += 1;
                else if (player1 == 3)       //21RvS
                    player2Sum += 1;
            }
            if (player2 == 1) {
                if (player3 == 2)            //23RvP
                    player3Sum += 1;
                else if (player3 == 3)       //23RvS
                    player2Sum += 1;
            }
            if (player2 == 1) {
                if (player4 == 2)            //24RvP
                    player4Sum += 1;
                else if (player4 == 3)       //24RvS
                    player2Sum += 1;
            }
            if (player2 == 2) {
                if (player1 == 1)            //21PvR
                    player2Sum += 1;
                else if (player1 == 3)        //21PvS
                    player1Sum += 1;
            }
            if (player2 == 2) {
                if (player3 == 1)            //23PvR
                    player2Sum += 1;
                else if (player3 == 3)        //23PvS
                    player3Sum += 1;
            }
            if (player2 == 2) {
                if (player4 == 1)            //24PvR
                    player2Sum += 1;
                else if (player4 == 3)        //24PvS
                    player4Sum += 1;
            }
            if (player2 == 3) {
                if (player1 == 1)            //21SvR
                    player1Sum += 1;
                else if (player1 == 2)       //21SvP
                    player2Sum += 1;
            }
            if (player2 == 3) {
                if (player3 == 1)            //23SvR
                    player3Sum += 1;
                else if (player3 == 2)       //23SvP
                    player3Sum += 1;
            }
            if (player2 == 3) {
                if (player4 == 1)            //24SvR
                    player4Sum += 1;
                else if (player4 == 2)       //24SvP
                    player2Sum += 1;
            }

            if (player3 == 1) {
                if (player1 == 2)            //31RvP
                    player1Sum += 1;
                else if (player1 == 3)       //31RvS
                    player3Sum += 1;
            }
            if (player3 == 1) {
                if (player2 == 2)            //32RvP
                    player2Sum += 1;
                else if (player2 == 3)       //32RvS
                    player3Sum += 1;
            }
            if (player3 == 1) {
                if (player4 == 2)            //34RvP
                    player4Sum += 1;
                else if (player4 == 3)       //34RvS
                    player3Sum += 1;
            }
            if (player3 == 2) {
                if (player1 == 1)            //31PvR
                    player3Sum += 1;
                else if (player1 == 3)       //31PvS
                    player1Sum += 1;
            }
            if (player3 == 2) {
                if (player2 == 1)            //32PvR
                    player3Sum += 1;
                else if (player2 == 3)        //32PvS
                    player2Sum += 1;
            }
            if (player3 == 2) {
                if (player4 == 1)            //34PvR
                    player3Sum += 1;
                else if (player4 == 3)        //34PvS
                    player4Sum += 1;
            }
            if (player3 == 3) {
                if (player1 == 1)            //31SvR
                    player1Sum += 1;
                else if (player1 == 2)       //31SvP
                    player3Sum += 1;
            }
            if (player3 == 3) {
                if (player2 == 1)            //32SvR
                    player2Sum += 1;
                else if (player2 == 2)       //32SvP
                    player3Sum += 1;
            }
            if (player3 == 3) {
                if (player4 == 1)            //34SvR
                    player4Sum += 1;
                else if (player4 == 2)       //34SvP
                    player3Sum += 1;
            }

            if (player4 == 1) {
                if (player1 == 2)            //41RvP
                    player1Sum += 1;
                else if (player1 == 3)       //41RvS
                    player4Sum += 1;
            }
            if (player4 == 1) {
                if (player2 == 2)            //42RvP
                    player2Sum += 1;
                else if (player2 == 3)       //42RvS
                    player4Sum += 1;
            }
            if (player4 == 1) {
                if (player3 == 2)            //43RvP
                    player3Sum += 1;
                else if (player3 == 3)       //43RvS
                    player4Sum += 1;
            }
            if (player4 == 2) {
                if (player1 == 1)            //41PvR
                    player4Sum += 1;
                else if (player1 == 3)       //41PvS
                    player1Sum += 1;
            }
            if (player4 == 2) {
                if (player2 == 1)            //42PvR
                    player4Sum += 1;
                else if (player2 == 3)        //42PvS
                    player2Sum += 1;
            }
            if (player4 == 2) {
                if (player3 == 1)            //43PvR
                    player4Sum += 1;
                else if (player3 == 3)        //43PvS
                    player3Sum += 1;
            }
            if (player4 == 3) {
                if (player1 == 1)            //41SvR
                    player1Sum += 1;
                else if (player1 == 2)       //41SvP
                    player4Sum += 1;
            }
            if (player4 == 3) {
                if (player2 == 1)            //42SvR
                    player2Sum += 1;
                else if (player2 == 2)       //42SvP
                    player4Sum += 1;
            }
            if (player4 == 3) {
                if (player3 == 1)            //43SvR
                    player3Sum += 1;
                else if (player3 == 2)       //43SvP
                    player4Sum += 1;
            }
        }

        System.out.println();
        System.out.println("Total Score:");
        System.out.println("Player 1 = " + player1Sum / 2);
        System.out.println("Player 2 = " + player2Sum / 2);
        System.out.println("Player 3 = " + player3Sum / 2);
        System.out.println("Player 4 = " + player4Sum / 2);
        System.out.println();

        if (player1Sum > player2Sum && player1Sum > player3Sum && player1Sum > player4Sum)
            System.out.println("Player 1 WINS!!");
        else if (player2Sum > player1Sum && player2Sum > player3Sum && player2Sum > player4Sum)
            System.out.println("Player 2 WINS!!");
        else if (player3Sum > player2Sum && player3Sum > player1Sum && player3Sum > player4Sum)
            System.out.println("Player 3 WINS!!");
        else if (player4Sum > player2Sum && player4Sum > player3Sum && player4Sum > player1Sum)
            System.out.println("Player 4 WINS!!");
        else if (player1Sum == player2Sum || player1Sum == player3Sum || player1Sum == player4Sum)
            System.out.println("TIE");
        else if (player2Sum == player3Sum || player2Sum == player4Sum)
            System.out.println("TIE");
        else if (player3Sum == player4Sum)
            System.out.println("TIE");
    }
}