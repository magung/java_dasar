public class ForEach {

    public static void main(String[] args) {
        String[] array = {
                "Agung", "Maulana", "Programmer", "Java"
        };

        for (var i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("FOR EACH");

        for (var value : array) {
            System.out.println(value);
        }
    }

}
