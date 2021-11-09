package hw2.chapter1;

public class Exercise3 {

    private int x;
    private int y;
    private int z;

    public Exercise3(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void maxNumber1(){
        int max=x;

        if(max<y){
            max=y;
        }
        if (max<z){
            max=z;
        }
        System.out.println("Max number using IF:"+ max);
    }

    public void maxNumber2(){
        System.out.println("Max number using Math.max :"+ Math.max(x,Math.max(y,z)) );
    }
}
