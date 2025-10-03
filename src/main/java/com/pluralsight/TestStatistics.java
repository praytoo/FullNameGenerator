package com.pluralsight;

import java.util.Arrays;

public class TestStatistics {
    public static void main(String[] args) {
        int[] testScores = {88, 99, 100, 85, 95, 87, 86, 96, 92, 98};
        int testSCoresSum;
        int sum = testScores[0] + testScores[1] + testScores[2] + testScores[3] + testScores[4] + testScores[5] + testScores[6] + testScores[7] + testScores[8] + testScores[9];
        int testScoreAverage = sum / 10;
        System.out.println("Test Score's Average: " + testScoreAverage);

        Arrays.sort(testScores);
        int highScore;
        highScore = testScores[9];
        System.out.println("High Score:" + highScore);
        int lowScore;
        lowScore = testScores[0];
        System.out.println("Low Score: " + lowScore);

        int premedianScore;
        premedianScore = testScores[4] + testScores[5];
        int medianScore = premedianScore/2;
        System.out.println("Median Score: " + medianScore);

        //Arrays.sort(testScores);
        //for(int median : testScores){
           // System.out.println(median);
        }
}
