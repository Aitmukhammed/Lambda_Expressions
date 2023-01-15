package org.example.lambda_express;

public class LambdaApp_four {
    static int x = 10;
    static int y = 20;
    public static void main(String[] args) {
        Operation op = () -> {
            x = 30;
            return x+y;
        };
        System.out.println(op.calculate_two()); //50
        System.out.println(x); //30
    }
}
