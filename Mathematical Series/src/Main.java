import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<String> output = new ArrayList<String>();

        SeriesCategory.printMathSeries();

        while(true){
            System.out.print("Pick a Series");
            String seriesChoice = input.next();
            SeriesCategory series = SeriesCategory.valueOf(seriesChoice);
            output.add(seriesChoice);

            switch(series){
                case ARITHMETIC:
                    break;
                case GEOMETRIC:
                    break;
                case FIBONACCI:
                    break;
                case FACTORIAL:
                    break;
            }
        }
    }
}
