package org.example.lambda_express;

// терминальные лямбды, которые не возвращают никакого значения
public class LambdaApp_three {
    public static void main(String[] args) {
        Printable printable = s -> System.out.println(s);
        printable.print("Hello Java!");
    }
}
