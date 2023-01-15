package org.example.lambda_express;

public class LambdaApp_five {
    public static void main(String[] args) {
        Generalized_operationable<Integer> operation1 = (x,y) -> x+y;
        Generalized_operationable<String> operation2 = (x,y) -> x+y;

        System.out.println(operation1.calculate_three(10,20));
        System.out.println(operation2.calculate_three("20", "20"));
     }
}
