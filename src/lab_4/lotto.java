package lab_4;

import java.util.ArrayList;
import java.util.Random;


public class lotto {
    public static void main(String[] args) {
        int[] num = lotto();
        for(int number : num)
            System.out.println(number);


    }

    private static int[] lotto() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for(int i=1 ; i<49 ; i++){
            numbers.add(i);
        }

        Random rand = new Random();
        int idx;
        int[] res = new int[6];
        for(int i=0 ; i<6 ; i++){
            idx = rand.nextInt(numbers.size());
            res[i] = numbers.get(idx);
            numbers.remove(idx);
        }

        return res;
    }
}
