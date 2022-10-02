import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Product product = new Product();

        //overloaded method
        product.apple(265, 542);
        product.apple(2459.45, 5949.66);

        //static method
        Product.time();
    }
}