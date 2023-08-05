public class Main {

    public static int setIthBit(int number, int i){

        int bitMask = 1<<i;

        return number | bitMask;
    }
    public static void main(String[] args) {

        System.out.print(setIthBit(15, 2));
    }
}