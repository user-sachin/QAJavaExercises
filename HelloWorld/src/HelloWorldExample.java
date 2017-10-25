public class HelloWorldExample {

    static String printLine(String inputString) {
        return inputString;
    }

    static int sumOfIntegers(boolean operator, int inputIntegerOne, int inputIntegerTwo) {
        int result;

        if(inputIntegerOne==0 || inputIntegerTwo==0){
            result = inputIntegerOne+inputIntegerTwo;
        }
        else{
            if(operator){
                result = inputIntegerOne+inputIntegerTwo;
            }
            else {
                result = inputIntegerOne*inputIntegerTwo;
            }
        }
        return result;
    }


    public static void main(String[] args) {

        String helloWorldString = "Hello World!";
        System.out.print("printLine("+helloWorldString+") -> ");
        System.out.println(printLine(helloWorldString));


        int firstInteger = 3;
        int secondInteger = 5;
        boolean operator = false;
        System.out.println("");
        System.out.print("sumOfIntegers("+firstInteger+", "+secondInteger+", "+operator+") -> ");
        System.out.println(sumOfIntegers(operator, firstInteger, secondInteger));


        System.out.println("");
        for(int i = 0; i < 10; i++){
            System.out.print("sumOfIntegers("+firstInteger+", "+i+", "+operator+") -> ");
            System.out.println(sumOfIntegers(operator, firstInteger, i));
        }



        System.out.println("");
        int[] arrayOfIntegers = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        for(int i : arrayOfIntegers){
            System.out.print("sumOfIntegers("+firstInteger+", "+i+", "+operator+") -> ");
            System.out.println(sumOfIntegers(operator, firstInteger, i));
        }

        System.out.println("");
        for(int i : arrayOfIntegers){
            System.out.println(i);
        }

        System.out.println("");
        for(int i = 0; i < arrayOfIntegers.length; i++){
            arrayOfIntegers[i]=i+5;
            if(i<arrayOfIntegers.length-1){
                System.out.print(arrayOfIntegers[i]+", ");
            }
            else{
                System.out.print(arrayOfIntegers[i]);
            }
        }


        System.out.println("");
        for(int i = 0; i < arrayOfIntegers.length; i++){
            arrayOfIntegers[i]=i+5;
            if(i<arrayOfIntegers.length-1){
                System.out.print(arrayOfIntegers[i]*10+", ");
            }
            else{
                System.out.print(arrayOfIntegers[i]*10);
            }
        }



    }
}