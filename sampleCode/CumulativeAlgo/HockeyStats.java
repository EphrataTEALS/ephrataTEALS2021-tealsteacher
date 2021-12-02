package sampleCode.CumulativeAlgo;

import java.util.*;

public class HockeyStats {

    public static void main(String[] args) {
        
        Scanner team = new Scanner(System.in);
        Scanner hstat = new Scanner(System.in);
        
        System.out.println("What Teams are playing? ");
        System.out.println("Home Team? ");
        String team1 = team.next();
        System.out.println("Away Team? ");
        String team2 = team.next();

        System.out.println("How many periods have been played so far? ");
        int periodsPlayed = hstat.nextInt();
        //System.out.println("Number of periods played: " + periodsPlayed);

        int sum = 0;
        double average = 0;
    }

        public static int TotalGoals(String teamName, int periods) {
            
        for (int i=1; i <= periods; i++) {
            System.out.println("What was the number of goals at the end of the " + i + " period? ");
            int value = hstat.nextInt();
            sum = sum + value;
            average = sum/(double)periodsPlayed;
        }

        System.out.println("The total number of goals is " + sum);
        System.out.println("The average number of goals is " + average);
        
    } 
}
