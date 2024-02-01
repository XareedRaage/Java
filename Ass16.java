package amina2;
import java.util.Scanner;
public class Ass16 {
    Scanner kb=new Scanner(System.in);
    public Ass16(){
        System.out.println("Enter number ");
        int n=kb.nextInt();
        int r=0;
        String text="";
        for(int a=n; a>0; a--){
            if(a==n){
                r=a;
                text=""+a;
            }
            else{
                r*=a;
                text+="x"+a;
            }
        }
        System.out.println(text+"="+r);
    }
}
