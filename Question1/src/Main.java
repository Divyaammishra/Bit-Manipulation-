public class Main {

    // Q. Swap two numbers without using any third variable
    public static void main(String[] args) {

        int a = 12 , b = 17;

        System.out.println("Original value is : " + "a = " + a + " and " + "b = " + b);

        //Swapping by using XOR operation

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After swapping : " +  " a = " + a + " and " + "b = " + b);
    }
}