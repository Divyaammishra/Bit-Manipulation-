public class Main {

    public static void oddOrEven(int number){
        int bitMask = 1;

        if((number & bitMask) == 0){
            System.out.println("Number is Even");
        }else{
            System.out.println("Number is Odd");
        }
    }
    public static void main(String[] args) {

        oddOrEven(5);
        oddOrEven(6);
    }
}