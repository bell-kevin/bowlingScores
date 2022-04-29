/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bowlingscores;
/**
 *
 * @author 4800590195
 */
import java.util.Scanner;
public class BowlingScores {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Bowling Scores by Kevin Bell \n");
        //variables
        Scanner computerKeyboardInput = new Scanner(System.in);
        int score;
        int totalScore = 0;
        int count = 0;
        double average;
        boolean more = true;
        while (more) {
            System.out.print("Enter score (-1 to quit): ");
            score = computerKeyboardInput.nextInt();
            if (score >= 0) {
                totalScore += score;
                count++;
            } else {    
                more = false;
            }
        }
        if (count >= 1){
            average = (double) totalScore / count;
            System.out.println("Average score is " + average);
        }
    }
}
