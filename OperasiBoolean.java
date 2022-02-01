public class OperasiBoolean {

    public static void main(String[] args) {
        
        /* Operasi Boolean
         * && Dan 
         * || Atau
         * ! Kebalikan
        */

        // && nilainya akan true jika semua datanya true
        // || salah satu data true maka nilainya true

        
        int absen = 70;
        int nilaiAkhir = 80;

        boolean lulusAbsen = absen >= 75;
        boolean lulusNilaiAkhir = nilaiAkhir >= 75;

        boolean lulus = lulusAbsen && lulusNilaiAkhir;
        System.out.println(lulus);
    }
    
}
