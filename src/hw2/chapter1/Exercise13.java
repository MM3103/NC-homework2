package hw2.chapter1;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise13 {

    ArrayList<Integer> numbers = new ArrayList<>();
    ArrayList<Integer> winNumbers = new ArrayList<>();

    public void lottery(){
        for(int i =0;i<49;i++){
            numbers.add(i,i+1);
        }

        for(int i = 0; i <6; i++){
            int r = (int) (Math.random() * (numbers.size() - 1)) + 1;
            winNumbers.add(i,numbers.get(r));
            numbers.remove(r);
        }

        Collections.sort(winNumbers);

        System.out.println("Winning combination: ");
        for(Integer i : winNumbers){
            System.out.print(i + " ");
        }
    }
}
