public class Main {

    public static int clearBitsInRange(int number, int i, int j){

        int a = ~(0)<<(j+1);
        int b = (1<<i)-1;

        int bitMask = a | b;

        return number & bitMask;
    }
    public static void main(String[] args) {

        System.out.print(clearBitsInRange(15, 2, 4));
    }
}