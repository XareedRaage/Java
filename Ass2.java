package amina2;
import java.util.Scanner;
public class Ass2 {
    Scanner kb=new Scanner(System.in);
    public Ass2(){
        System.out.println("Enter start point: ");
        int a=kb.nextInt();
       System.out.println("Enter End point: ");
        int b=kb.nextInt();
        if(a<b){
            int sw=a;
            a=b;
            b=sw;
        }
        for(int i=a; i>=b; i--)
            System.out.print(i+",");
    }
}
