package amina2;
public class Ass13 {
    public Ass13(){
        for(int a=2; a<=50; a++){
            boolean bol=true;
            for(int b=2; b<a;b++){
                if(a%b==0)
                    bol=false;
            }// end of inner loop
            if(bol)
                System.out.print(a+",");
        }// end of outer loop
    }
}
