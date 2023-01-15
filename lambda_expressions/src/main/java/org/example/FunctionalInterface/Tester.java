package org.example.FunctionalInterface;

import java.util.function.Predicate;

public class Tester {
    public static void main(String[] args) {
        MyPredicate myPredicate = x -> x > 0;
        System.out.println(myPredicate.test(10));  //true

        Predicate<Integer> predicate = x -> x > 0;
        System.out.println(predicate.test(-10)); //false
    }
}