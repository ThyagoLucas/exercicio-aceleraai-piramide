import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        System.out.println("Hello, World!");

        Scanner reader = new Scanner(System.in);

        System.out.println("\n digite um numero para formar uma pirâmide \n");

        int number = reader.nextInt();

        for(int i = 1 ; i<= number ; i++){
            String output = "";
            for(int j = 1 ; j <= i ; j++){
                
                output = output + " " + i;
            }
            System.out.println(output);
        }
    }
}
