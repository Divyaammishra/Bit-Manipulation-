public class Main {

    public static boolean approach1(int number){

        int bitMask = 1;

        if((number & bitMask) ==  0){
            return true;
        }else{
            return false;
        }
    }

    public static boolean approach2(int number){

        return (number & (number-1)) == 0;
    }


    public static void main(String[] args) {

        System.out.println(approach1(8));
        System.out.println(approach2(9));

    }
}