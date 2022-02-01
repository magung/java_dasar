public class Block {

    public static void main(String[] args) { // Block
        System.out.println("Hello World 1");
        System.out.println("Hello World 2");
        System.out.println("Hello World 3");

        {//Block
            System.out.println("Hello World 4");
            System.out.println("Hello World 5");
            System.out.println("Hello World 6");

            {
                System.out.println("Hello World 7");
            }
        }
    }
    
}
