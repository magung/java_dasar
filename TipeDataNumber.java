

public class TipeDataNumber {
    public static void main(String[] args) {

        //Number
        byte iniByte = 100; // -128 | 127 | 1 bytes
        short iniShort = 1000; // -32,768 | 32,767 | 2 bytes
        int iniInt = 1000000; // -2,147,483,648 | 2,147,483,647 | 4 bytes
        long iniLong = 1000000000; // -9,223,372,036,854,775,808 | 9,223,372,036,854,775,807 | 8 bytes
        long iniLong2 = 1000000000L;

        // Floating Point Number
        float iniFloat = 10.12F; // 3.4e-038 | 3.4e+038 | 4 bytes
        float iniFloat2 = 10.12f;
        double iniDouble = 12.2424; // 1.7e-308 | 1.7e+308 | 8 bytes

        // Kode Literals
        int decimlInt = 25;
        int hexDecimal = 0xFFFFFF;
        int binaryDecimal = 0b10101010;

        // Kode Underscore
        long balance = 1_000_000_000_000L;
        int sum = 60_000_000;

        //Widening Casting (otomatis) : byte->short->int->long->float->double
        //Narrowing Casting (manual) : double->float->long->int->short->byte
    }
}
