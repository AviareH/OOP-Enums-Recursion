import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        ArrayList<String> output = new ArrayList<String>();

        SeriesCategory.printMathSeries();
        boolean flag = true;

        while (flag) {
            try {
                System.out.print("Pick a Series: ");
                String seriesChoice = input.next().toUpperCase();
                SeriesCategory series = SeriesCategory.valueOf(seriesChoice);
                output.add(seriesChoice);
                flag = false;

                switch (series) {
                    case ARITHMETIC:
                        System.out.print("Starting Value: ");
                        int arthStart = input.nextInt();
                        output.add("Start: " + arthStart);
                        System.out.print("Difference: ");
                        int arthDiff = input.nextInt();
                        output.add("Difference: " + arthDiff);
                        System.out.print("Number Of Times: ");
                        int arthNumOfTimes = input.nextInt();
                        output.add("Number Of Times: " + arthNumOfTimes);
                        int arthSum = SeriesCategory.arithmetic(arthStart, arthDiff, arthNumOfTimes);
                        output.add("Sum: " + arthSum);
                        break;
                    case GEOMETRIC:
                        System.out.print("Starting Value: ");
                        int geoStart = input.nextInt();
                        output.add("Start: " + geoStart);
                        System.out.print("Difference: ");
                        int geoDiff = input.nextInt();
                        output.add("Difference: " + geoDiff);
                        System.out.print("Number Of Times: ");
                        int geoNumOfTimes = input.nextInt();
                        output.add("Number Of Times: " + geoNumOfTimes);
                        int geoSum = SeriesCategory.geometric(geoStart, geoDiff, geoNumOfTimes);
                        output.add("Sum: " + geoSum);
                        break;
                    case FIBONACCI:
                        System.out.print("Index Of Fibonacci: ");
                        int fibIndex = input.nextInt();
                        output.add("Index: " + fibIndex);
                        int fibResult = SeriesCategory.fibonacci(fibIndex);
                        output.add("Result: " + fibResult);
                        break;
                    case FACTORIAL:
                        System.out.print("Factorial Number: ");
                        int facNum = input.nextInt();
                        output.add("Number: " + facNum);
                        int facResult = SeriesCategory.factorial(facNum);
                        output.add("Result: " + facResult);
                        break;
                }
            } catch (IllegalArgumentException | InputMismatchException e) {
                System.out.println("Not a Proper Input");
                flag = true;
            }
        }
        FileWriter out = new FileWriter("output.txt");
        BufferedWriter buffWrite = new BufferedWriter(out);
        try{
            for (String item:output){
                buffWrite.write(item);
                buffWrite.newLine();
            }
            buffWrite.close();
        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
        }
        // This just has to be here in order for the file to read and write properly
        catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}