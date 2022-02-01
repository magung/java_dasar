public class RecursiveMethod {
    public static void main(String[] args) {
        
        System.out.println(factorial(5));
        System.out.println(1 * 2 * 3 * 4 * 5);
        System.out.println(factorialRecursive(5));
        loop(10000);
    }

    static int factorial(int value) {
        var result = 1;
        for(int counter = 1; counter <= value; counter++) {
            result *= counter;
        }
        return result;
    }

    static int factorialRecursive(int value) {
        if(value == 1) {
            return 1;
        } else {
            return value * factorialRecursive(value - 1);
        }
    }

    // StackOverflow error
    static void loop(int value) {
        if(value == 0) {
            System.out.println("Selesai");
        } else {
            System.out.println("Loop "+ value);
            loop(value - 1);
        }
    }
}
