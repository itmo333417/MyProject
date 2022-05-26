import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Execute numbers = new Execute();
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();
        int s = numbers.exe(num);
        System.out.format("Sum from 0 to %s = " + s,num);
    }
}