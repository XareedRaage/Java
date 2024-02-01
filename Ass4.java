package amina2;
import java.util.Scanner;
public class Ass4 {
    Scanner kb=new Scanner(System.in);
    public Ass4(){
        System.out.println("Enter number: ");
        int n=kb.nextInt();
        for(int a=n; a>0; a--)
            System.out.println("square "+a+" is: "+a*a);
    }
}
