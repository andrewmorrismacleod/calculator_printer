public class Calculator {


    public Calculator(){

    }

    public int add(int num1, int num2){
        return num1 + num2;
    }

    public int subtract(int num1, int num2){
        return num1 - num2;
    }

    public int multiply(int num1, int num2){
        return num1 * num2;
    }

    public double divide(int num1, int num2){

        if(num2 != 0) {

            double num1d = (double) num1;
            double num2d = (double) num2;
            return num1d / num2d;
        } else {
            return 999999999.999;
        }

    }


}
