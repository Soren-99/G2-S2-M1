package Esercizio2;

import java.util.List;

public class Main {
    public static void main(String[] args){
        int N = 10;
        List<Integer> originalList = Lista.generateRandomList(N);
        List<Integer> rearrangedList = Lista.rearrangeList(originalList);

        System.out.println("Lista originale: " + originalList);
        System.out.println("Lista riarrangiata" + rearrangedList);

        System.out.println();

        Lista.printValues(originalList, true);
        Lista.printValues(originalList, false);
    }
}
