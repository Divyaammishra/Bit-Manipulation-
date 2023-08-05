public class Main {

    public static int clearIthBit(int number, int i){

        int bitMask = ~(1<<i);

        return number & bitMask;
    }

    public static int setIthBit(int number, int i){

        int bitMask = 1<<i;

        return number | bitMask;
    }

    public static int updateIthBit(int number, int i, int newBit){

    /*
     if(newBit == 0){
           return clearIthBit(number, i);
        }else{
            return setIthBit(number, i);
        }
     */

                //OR

        number = clearIthBit(number, i);
        int bitMask =  newBit<<i;
        return number | bitMask;



    }

    public static void main(String[] args) {

        System.out.print(updateIthBit(10, 2, 1));
    }
}