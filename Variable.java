

public class Variable {

    public static void main(String[] args) {
      /*
       * variable = tempat menyimpan data  
       * Java = bahasa static type
       * nama variable tidak boleh bengandung whitespace
       * */

       String name;
       name = "Agung Maulana";

       int age = 22;
       String address = "Indonesia";

       System.out.println(name);
       System.out.println(age);
       System.out.println(address);

       // kata kunci var | sejak java 10
       var firstName = "agung";
       var lastName = "maulana";

       // kata kunci final (konstan) tidak bisa berubah valuenya
       final String nama = "agung";

       

    }
    
}
