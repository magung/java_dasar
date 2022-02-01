public class TipeDataBukanPrimitif {

    public static void main(String[] args) {
        // Tipe data primitif
        byte iniBytePrimitif;

        // Tipe data primitif default value null
        Byte iniByte;
        Short iniShort;
        Integer iniInteger;
        Long iniLong;
        Float iniFloat;
        Double iniDouble;
        Character iniCharacter;
        Boolean iniBoolean;

        // konversi secara otomatis
        int iniInteger2 = 10;
        Integer iniInteger3 = iniInteger2;

        Integer iniObject = iniInteger2;
        short iniShort2 = iniObject.shortValue();
        long iniLong2 = iniObject.longValue();
        float iniFloat2 = iniObject.floatValue();

    }
    
}
