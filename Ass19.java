package amina2;
import java.util.Scanner;
public class Ass19 {
        Scanner kb=new Scanner(System.in);
        public Ass19(){
            System.out.println("Enter number: ");
            int n=kb.nextInt();
            System.out.println("Enter root number ");
            int r=kb.nextInt();            
            for(int a=2; a<n; a++){
                int result=1;
                for(int b=1; b<=r; b++)
                    result*=a;
                if(result==n){
                    System.out.println(a);
                    break;
                }
                
            }
        }
}
