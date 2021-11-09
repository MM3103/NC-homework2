package hw2.chapter1;

public class Exercise2 {
    private double number;

    public Exercise2(double number) {
        this.number = number;
    }

    public void convert1(){
        System.out.println("Using % : "+(number*(180/Math.PI)%360));
    }

    public void convert2(){
        System.out.println("Using floorMod : "+ Math.floorMod((int)(number * 180 / Math.PI), 360));
    }
}
