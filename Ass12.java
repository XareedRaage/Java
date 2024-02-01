package amina2;
public class Ass12 {
    public Ass12(){
              System.out.println("X \t Y \t Z \t Y==>XZ'\n---------------------------------");
        for(int x=1; x>=0; x--){
            for(int y=1; y>=0; y--){
                for(int z=1; z>=0; z--){
                    int zz=z==1?0:1;
                    int xz=x*zz;
                    int result=y==1&&xz==0?0:1;
                    System.out.println(x+" \t "+y+" \t "+z+" \t "+result);
                }// end of z
            }// end of y
        }// end of x
    }
}
