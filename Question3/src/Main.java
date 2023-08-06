public class Main {

    public static void main(String[] args) {

        //Lower to upper

        for(char ch='a'; ch<='z'; ch++){
            System.out.print((char) (ch ^ ' '));
        }


        
        System.out.println();


        //UpperToLower

        for(char ch='A'; ch<='Z'; ch++){
            System.out.print((char) (ch | ' '));
        }

    }
}