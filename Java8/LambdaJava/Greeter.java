package Java8.LambdaJava;

interface MyLambda {
    void sample1();
}

class Greeter {
    public static void main(String[] args) {
        Greeting hwg = new HelloWorldGreeting();
        greet(hwg);
        Greeting greeting = () -> System.out.println("this is hello world from lenovo laptop");
        greet(greeting);
        Greeting innerClassGreeting = new Greeting() {
            public void perform() {
                System.out.println("this is anonymous inner class");
            };
        };
        greet(innerClassGreeting);

    }

    public static void greet(Greeting greeting) {
        greeting.perform();
    }
}
