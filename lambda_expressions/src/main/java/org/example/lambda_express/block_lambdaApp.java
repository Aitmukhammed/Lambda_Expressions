package org.example.lambda_express;

public class block_lambdaApp {
    public static void main(String[] args) {
        Operationable operationable = (int x, int y) -> {
            if(y==0){
                return 0;
            }else {
                return x/y;
            }
        };
        System.out.println(operationable.calculate(20,0));
        System.out.println(operationable.calculate(20,10));
    }
}
