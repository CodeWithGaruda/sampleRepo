package Java8.LambdaJava;

interface MyLambda {
    void sample1();
}

class Greeter {
    public static void main(String[] args) {
        Greeting hwg = new HelloWorldGreeting();
        greet(hwg);
        Greeting sample1 = () -> System.out.println("hello world");
        greet(sample1);
        Greeting sample2 = () -> System.out.println("this is hello world from sanath");
        greet(sample2);
    }

    public static void greet(Greeting greeting) {
        greeting.perform();
    }
}
