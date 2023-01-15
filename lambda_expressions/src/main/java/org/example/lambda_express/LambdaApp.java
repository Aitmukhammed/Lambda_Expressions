package org.example.lambda_express;

public class LambdaApp {
    public static void main(String[] args) {
        Operationable operationable;
        operationable = (x,y) -> x+y;

        int result = operationable.calculate(10, 20);
        System.out.println(result);
    }
}
