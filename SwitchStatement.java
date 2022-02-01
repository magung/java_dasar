public class SwitchStatement {

    public static void main(String[] args) {
        var nilai = "B";

        switch (nilai) {
            case "A":
                System.out.println("Anda lulus dengan baik");
                break;
            case "B":
            case "C":
                System.out.println("Anda lulus");
                break;
            case "D":
                System.out.println("Anda Tidak lulus");
                break;
            default:
                System.out.println("Mungkin anda salah jurusan");
        }

        // Switch Lamda
        switch (nilai) {
            case "A" -> System.out.println("Anda lulus dengan baik");
            case "B", "C" -> System.out.println("Anda lulus");
            case "D" -> {
                System.out.println("Anda Tidak lulus");
            }
            default -> {
                System.out.println("Mungkin anda salah jurusan");
            }
        };

        // kata kunci tanpa yield
        String ucapan;
        switch (nilai) {
            case "A" -> ucapan = "Wow anda lulus dengan baik";
            case "B", "C" ->  ucapan = "Anda lulus";
            case "D" ->  ucapan = "Anda Tidak lulus";
            default -> ucapan = "Mungkin anda salah jurusan";
        };
        System.out.println(ucapan);
        // kata kunci yield
        ucapan = switch (nilai) {
            case "A": 
                yield "Wow anda lulus dengan baik";
            case "B", "C": 
                yield "Anda lulus";
            case "D": 
                yield "Anda Tidak lulus";
            default : 
                yield "Mungkin anda salah jurusan";
        };
        System.out.println(ucapan);


    }
    
}
