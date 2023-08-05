public class Main {

    public static int clearIBits(int number, int i){

        int bitMask = ~(0)<<i;

        return number & bitMask;
    }
    public static void main(String[] args) {

        System.out.print(clearIBits(15, 2));
    }
}