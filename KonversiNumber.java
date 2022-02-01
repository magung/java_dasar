

public class KonversiNumber {
    
    public static void main(String[] args) {
        //Widening Casting (otomatis) : byte->short->int->long->float->double
        //Narrowing Casting (manual) : double->float->long->int->short->byte
        
        // konversi otomatis
        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;

        // konversi manual
        byte iniByte2 = (byte) iniInt;

        int iniInt2 = 1000;
        byte iniByte3 = (byte) iniInt2; // hati-hati ini kena number overflow
    }
}
