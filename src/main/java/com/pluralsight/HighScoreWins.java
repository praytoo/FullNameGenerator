package com.pluralsight;

import java.util.Scanner;
import java.util.regex.Pattern;

public class HighScoreWins {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Who was playing and what were their respective scores? Home: Visitors | 21: 9");
        String scores = scanner.nextLine();
        String[] parts = scores.split(Pattern.quote("|"));
        String teamPart = parts[0];
        String scorePart = parts[1];
        String[] teams = teamPart.split(Pattern.quote(":"));
        String home = teams[0].trim();
        String visitors = teams[1].trim();

        String[] scoreTokens = scorePart.split(Pattern.quote(":"));
        int homeScore = Integer.parseInt(scoreTokens[0].trim());
        int visitorsScore = Integer.parseInt(scoreTokens[1].trim());

        if (homeScore > visitorsScore){
            System.out.println("Winner: " + home);
        }else if (visitorsScore > homeScore){
            System.out.println("Winner: " + visitors);
        }else{
            System.out.println("Tie!");
        }

    }
}
