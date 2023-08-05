public class Main {

    public static int countSetBits(int number){

        int count = 0;

        while(number > 0){
            if((number & 1) == 1){
                count++;
            }
            number = number >> 1;
        }
        return count;
    }
    public static void main(String[] args) {

        System.out.print(countSetBits(10));
    }
}