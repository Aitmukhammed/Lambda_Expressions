package org.example.lambda_express;

public class LambdaApp_two {
    public static void main(String[] args) {
        Operationable operationable = new Operationable() {
            @Override
            public int calculate(int x, int y) {
                return x+y;
            }
        };
        int result = operationable.calculate(20,20);
        System.out.println(result);
    }
}
