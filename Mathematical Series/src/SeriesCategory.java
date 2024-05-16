enum SeriesCategory {
    ARITHMETIC, GEOMETRIC, FIBONACCI, FACTORIAL;

    public static void printMathSeries(){
        for(SeriesCategory item : SeriesCategory.values()){
            System.out.println(item);
        }
    }

    public static int arithmetic(int start, int difference, int numOfTerms){
        if(numOfTerms==0){
            return start;
        }
        return start + arithmetic(start + difference, difference, --numOfTerms);
    }

    public static int geometric(int start, int ratio, int numOfTerms){
        if(numOfTerms==0){
            return start;
        }
        return start + geometric(start * ratio, ratio, --numOfTerms);
    }
    public static int fibonacci(int n){
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static int factorial(int num){
        if (num >= 1)
            return num * factorial(num - 1);
        else
            return 1;
    }
}
