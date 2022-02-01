public class OperasiMatematika {

    public static void main(String[] args) {
        /**
         * Operasi Matematika
            + : Penjumalahan
            - : Pengurangan
            * : Perkalian
            / : Pembagian
            % : Sisa Pembagian (Modulo)
         */

        int a = 100;
        int b = 10;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        // Augmented Assigments
        a += 10; // a = a + 10
        System.out.println(a);
        a -= 10; // a = a - 10
        System.out.println(a);
        a *= 10; // a = a * 10
        System.out.println(a);
        a /= 10; // a = a / 10
        System.out.println(a);
        a %= 10; // a = a % 10
        System.out.println(a);

        // Unary Operator
        a = 100;
        a++; // a = a + 1
        System.out.println(a);
        a--; // a = a - 1
        System.out.println(a);
        
        a = -a; // negative
        System.out.println(a);

        boolean salah = false;
        boolean benar = !salah; // Boolean Kebalikan
        System.out.println(benar);

         
    }
    
}
