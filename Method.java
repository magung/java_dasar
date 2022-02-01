public class Method {

    public static void main(String[] args) {
        // Method atau Function
        sayHelloWorld(); // kebiasaan orang java untuk nama method dimulai huruf kecil, dan camel case
        sayHelloWorld();
        sayHelloWorld();

        sayHello("Agung", "Maulana");
        sayHello("Budi", "Nugraha");

        var a = 100;
        var b = 200;
        var c = sum(a, b);
        System.out.println(c);
        System.out.println(hitung(a, "+", b));
    }

    static void sayHelloWorld() {
        System.out.println("Hello World 1");
        System.out.println("Hello World 2");
        System.out.println("Hello World 3");
    }

    // Method Parameter
    static void sayHello(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }

    // Method Return value
    static int sum(int value1, int value2) {
        var total = value1 + value2;
        return total;
    }

    static int hitung(int value1, String operasi, int value2) {
        switch (operasi) {
            case "+":
                return value1 + value2;
            case "-":
                return value1 - value2;
            case "*":
                return value1 * value2;
            case "/":
                return value1 / value2;
            case "%":
                return value1 % value2;
            default:
                return 0;
        }
    }

}
