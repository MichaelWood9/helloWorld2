import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String mystr;
        Scanner scanner = new Scanner(System.in);
        System.out.println("hello world");
        mystr = scanner.next();
        System.out.println(mystr);
        if(mystr.equals("hello")){
            System.out.println("hello stranger");//test
        }


    }
}
