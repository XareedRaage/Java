package amina2;
import java.util.Scanner;
public class Ass17 {
    Scanner kb=new Scanner(System.in);
    public Ass17(){
        System.out.println("Enter base ");
        int b=kb.nextInt();
        System.out.println("Enter exponent: ");
        int ex=kb.nextInt();
        int r=0;
        String text="";
        for(int a=1; a<=ex; a++){
            if(a==1){
                r=b;
                text=""+b;
            }
            else{
                r*=b;
                text+="x"+b;
            }
        }
        System.out.println(text+"="+r);
    }
}
