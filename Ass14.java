package amina2;
import java.util.Scanner;
public class Ass14 {
    Scanner kb=new Scanner(System.in);
    public Ass14(){
        System.out.println("Enter number: ");
        int n=kb.nextInt();
        boolean bol=true;
        String text="";
        for(int a=2; a<n; a++){
            if(n%a==0){
                bol=false;
                text+=a+",";
            }
        }//end of loop
        System.out.println(bol?n+" is prime number":n+" is not prime number because it divisible by: "+text);
    }
}
