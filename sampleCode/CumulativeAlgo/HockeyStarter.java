package sampleCode.CumulativeAlgo;

import java.util.*;

public class HockeyStarter {

    public static void main(String[] args) {
        
        int periodsPlayed = 3;
        System.out.println(TotalGoals(periodsPlayed));


    }

        public static String TotalGoals(int periods) {
            
            int sum = 0;
            double average = 0.0;

            return "In " + periods + " periods of play they have " + sum + " goals and an average of " + average + " goals per period.";
        
    } 
}
