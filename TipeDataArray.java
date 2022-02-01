public class TipeDataArray {

    public static void main(String[] args) {
        // type data yg sama, mulai dari index 0

        String[] arrayString;
        arrayString = new String[3];
        arrayString[0] = "DataPertama";
        arrayString[1] = "DataKedua";
        arrayString[2] = "DataKetiga";

        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);
        System.out.println(arrayString[2]);

        arrayString[0] = "UbahPertama";
        System.out.println(arrayString[0]);

        String[] stringArray = new String[3];

        // Kode Array Initializer
        int[] arrayInt = new int[] {
            10, 20, 40, 30, 44
        };

        long[] arrayLong = {
            100L, 2211L, 2221L, 3232L
        };

        String[] arrayName = {
            "Agung", "Maulana"
        };

        System.out.println(arrayName[0]);

        // Operasi di Array
        // array[index]
        // array[index] = value
        // array.length
        System.out.println(arrayName[1]);
        arrayName[0] = "Maulana";
        System.out.println(arrayName[0]);
        System.out.println(arrayName.length);

        /*
        Array Dalam Array
        */

        String[][] members = {
            {"Agung", "Maulana"},
            {"Akmal", "Hidayah"},
            {"Asrul"}
        };

        System.out.println(members[0][1]);
    }
    
}
