package Esercizio1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il numero di parole: ");
        int N = scanner.nextInt();

        Set<String> parole = new HashSet<>();

        System.out.println("Inserisci le parole:");

        for (int i = 0; i < N; i++){
            String parola = scanner.next();
            parole.add(parola);
        }

        Set<String> paroleDuplicate = trovaParoleDuplicate(parole);
        System.out.println("Parole duplicate:");
        for (String parola : paroleDuplicate) {
            System.out.println(parola);
        }

        int numeroParoleDistinte = parole.size() - paroleDuplicate.size();
        System.out.println("Numero di parole distinte: " + numeroParoleDistinte);

        System.out.println("Elenco delle parole distinte:");
        for (String parola : parole) {
            System.out.println(parola);
        }
    }

    private static Set<String> trovaParoleDuplicate(Set<String> parole) {
        Set<String> paroleDuplicate = new HashSet<>();
        Set<String> paroleUniche = new HashSet<>();

        for (String parola : parole) {
            if (!paroleUniche.add(parola)){
                paroleDuplicate.add(parola);
            }
        }
        return paroleDuplicate;
    }

}
