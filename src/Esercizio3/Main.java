package Esercizio3;

public class Main {
    public static void main(String[] args){
        RubricaTelefonica  rubrica = new RubricaTelefonica();

        rubrica.inserisciContatto("Marco", "3392928393");
        rubrica.inserisciContatto("Anna", "22320392093");
        rubrica.inserisciContatto("Luca", "2392039203");

        System.out.println("Rubrica telefonica: ");
        rubrica.stampaRubrica();

        System.out.println("Cerca un nome col numero 3392928393" + rubrica.ricercaNome("3392928393"));
        System.out.println("Cerca il numero di telefono di Marco: " + rubrica.ricercaTelefono("Marco"));

        rubrica.cancellaContatto("Anna");
        System.out.println("Rubrica telefonica dopo la cancellazione;");
        rubrica.stampaRubrica();
    }
}
