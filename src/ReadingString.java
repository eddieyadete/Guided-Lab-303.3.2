import java.util.Scanner;

public class ReadingString {


    public void usingScanner(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three words separated by spaces: ");
        String s1 = input.next();
        String s2 = input.next();
        String s3 = input.next();
        System.out.println("s1 is " + s1 + " and s2 is " + s2 + " and s3 is " + s3);

    }
    public void usingString(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character: ");
        String s = input.nextLine();
        char ch = s.charAt(3);
        System.out.println("The character entered is " + ch);
    }
}
