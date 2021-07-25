package Java8.LambdaJava;

import java.util.function.Supplier;

public class SampleLambda {
    public static void main(String[] args) {
        sanP(() -> {
            System.out.println("this is sanath rayala");
            return null;
        });
    }

    static void sanP(Supplier s) {
        s.get();
    }
}