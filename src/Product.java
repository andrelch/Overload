
public class Product {

    //have to make variables without static method?
    int redApples;
    int greenApples;
    double extract;
    double water;

    public void apple (int redApples, int greenApples){
        //this refers to the current object in the method
        //in this case, it's the input in the parameters
        this.redApples = redApples;
        this.greenApples = greenApples;

        int sum;
        sum = redApples + greenApples;

        System.out.println("The sum of the red and green apples is: " + sum);

    }

    public void apple (double extract, double water){
        //this refers to the current object in the method
        //in this case, it's the input in the parameters
        this.extract = extract;
        this.water = water;

        double sumJuice;
        sumJuice = extract + water;

        System.out.println("The amount of juice is: " + sumJuice);

    }

    static void time(){
        System.out.println("The time is now " + java.time.LocalTime.now());
    }

}
