public class Main {

    public static int clearIthBit(int number, int i){

        int bitMask = ~(1<<i);

        return number & bitMask;

    }
    public static void main(String[] args) {

        System.out.print(clearIthBit(10, 1));
    }
}