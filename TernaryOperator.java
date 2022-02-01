public class TernaryOperator {

    public static void main(String[] args) {
        
        var nilai = 75;
        String ucapan;

        // tanpa ternary operator
        if(nilai > 75 ) {
            ucapan = "Selamat anda lulus";
        } else {
            ucapan = "Silakan coba lagi";
        }

        System.out.println(ucapan);

        // dengan ternary operator
        String ucapan2 = nilai >= 75 ? "Selamat anda lulus" : "Silakan coba lagi";

        System.out.println(ucapan2);
    }
    
}
