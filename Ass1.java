package amina2;
import java.util.Scanner;
public class Ass1 {
    Scanner kb=new Scanner(System.in);
    public Ass1(){
        System.out.println("Enter start point: ");
        int a=kb.nextInt();
       System.out.println("Enter End point: ");
        int b=kb.nextInt();
        for(int i=a; i<=b; i++)
            System.out.print(i+",");
    }
}
