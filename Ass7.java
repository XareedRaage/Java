package amina2;
public class Ass7 {
    public Ass7(){
        for(int a=1; a<11; a++){
            for(int b=1; b<=a; b++){
                System.out.print(a%3==0?"-":"*");
            }// end of inner loop
            System.out.println("");
        }// end of outer
    }// end of constructor
}
