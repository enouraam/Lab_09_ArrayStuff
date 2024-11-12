import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] dataPoints = new int[100];
        Random generator = new Random();

        for (int i = 0; i < dataPoints.length;i++){
            dataPoints[i] = generator.nextInt(100)+1;

        }

        for (int i = 0; i < dataPoints.length;i++){
            System.out.printf("%d|",dataPoints[i]);

        }
        System.out.println(" ");


        int averageDataPoints = 0;
        for (int i = 0; i < dataPoints.length;i++){
            averageDataPoints += dataPoints[i];

        }

        averageDataPoints = averageDataPoints / dataPoints.length;

        System.out.println("The average of the random array dataPoints is: "+averageDataPoints );




        Scanner in = new Scanner(System.in);
        int count = 0; //counts the amount of instances of matching value in array based on user input
        int num = SafeInput.getRangedInt(in,"Enter a number between 1 and 100: ",1,100);
        for (int i = 0; i < dataPoints.length;i++){

            if (num == dataPoints[i]) {
                count ++;
            }



        }
        if (count > 0) {
            System.out.println("The number "+num+ " was found "+count+ " times in the array");
        } else{
            System.out.println("No instances of "+num+" were found in the array");
        }


        num = SafeInput.getRangedInt(in,"Enter a number between 1 and 100: ",1,100);
        int position = 0;
        boolean found = false;

        for (int i = 0; i < dataPoints.length;i++){

            if (num == dataPoints[i]){
                found = true;
                position = i;
                break;
            }

        }
        if (found) {
            System.out.printf("The value %d was found at array index %d",num,position);
        } else{
            System.out.printf("The value %d was not found in the array",num);
        }



        int min = 100;
        int max = 0;
        for (int i = 0; i < dataPoints.length;i++){
            if (dataPoints[i] < min ){
                min = dataPoints[i];
            }

            if (dataPoints[i] > max ){
                max = dataPoints[i];
            }


        }
        System.out.println(" ");
        System.out.printf("In the the array min value is %d and the max value is %d",min,max);



        System.out.println("\n\n\n\nAverage of dataPoints is: " + getAverage(dataPoints));
    }

    public static double getAverage(int values[]){
        double total = 0;
        double average = 0;

        for (int i = 0; i < values.length;i++) {
            total += values[i];

        }
        average = total / values.length;
        return average;
        System.out.printLn("Average of dataPoints is: " + getAverage(dataPoints));
    }



}