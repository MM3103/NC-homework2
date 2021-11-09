package hw2.chapter1;

public class Main {
    public static void main(String[] args) {
        Exercise1 exercise1 = new Exercise1(16);
        exercise1.convert();

        Exercise2 exercise2 = new Exercise2(Math.PI);
        exercise2.convert1();
        exercise2.convert2();

        Exercise3 exercise3 = new Exercise3(30, 10, 20);
        exercise3.maxNumber1();
        exercise3.maxNumber2();

        Exercise4 exercise4 = new Exercise4();
        exercise4.maxAndMinDouble();

        Exercise6 exercise6 = new Exercise6();
        System.out.println(exercise6.factorial(1000));

        Exercise13 exercise13 = new Exercise13();
        exercise13.lottery();
    }
}
