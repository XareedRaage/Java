package amina2;
public class Ass20 {
    public Ass20(){
        for(int a=2; a<=25; a++){
            if(a%3==0 || a%5==0){
                if(a==3 || a==5)
                    System.out.print(a+",");
            }
            else
                System.out.print(a+",");
        }
    }
}
