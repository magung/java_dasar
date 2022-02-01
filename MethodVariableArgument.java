public class MethodVariableArgument {

    public static void main(String[] args) {
        int[] values = { 80, 50, 80, 80, 75 };
        sayCongrats("Agung", values);

        sayCongrats2("Agung M", values);
        sayCongrats2("Agung M", 80, 80, 80, 80);

    }

    // tanpa Argument
    static void sayCongrats(String name, int[] values) {
        var total = 0;
        for (var value : values) {
            total += value;
        }
        var finalValue = total / values.length;

        if (finalValue >= 75) {
            System.out.println("Selamat " + name + ", Anda Lulus");
        } else {
            System.out.println("Maaf " + name + ", Anda Tidak Lulus");
        }
    }

    // dengan Argument
    static void sayCongrats2(String name, int... values) {
        var total = 0;
        for (var value : values) {
            total += value;
        }
        var finalValue = total / values.length;

        if (finalValue >= 75) {
            System.out.println("Selamat " + name + ", Anda Lulus");
        } else {
            System.out.println("Maaf " + name + ", Anda Tidak Lulus");
        }
    }

}
