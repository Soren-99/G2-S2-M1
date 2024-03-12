package Esercizio2;

import  java.util.*;

public class Lista {
    public static List<Integer> generateRandomList(int N) {
        Random rand = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++){
            list.add(rand.nextInt(101));
        }
        Collections.sort(list);
        return list;
    }

    public static List<Integer> rearrangeList(List<Integer> list) {
        List<Integer> rearrangedList = new ArrayList<>(list);
        Collections.shuffle(rearrangedList);
        return rearrangedList;
    }

    public static void printValues(List<Integer> list, boolean evenPositions) {
        System.out.println("Valori in posizioni ");
        if (evenPositions) {
            System.out.println("pari: ");
        }else
            System.out.println("dispari: ");

        for (int i = 0; i < list.size(); i++) {
            if (evenPositions && i % 2 == 0)
                System.out.println(list.get(i) + " ");
            else if (!evenPositions && i % 2 != 0)
                System.out.println(list.get(i) + " ");
        }
        System.out.println();
        }
    }

