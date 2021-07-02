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
    }

    public static void greet(Greeting greeting) {
        greeting.perform();
    }
}
