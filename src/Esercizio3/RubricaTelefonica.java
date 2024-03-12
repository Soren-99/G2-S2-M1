package Esercizio3;

import java.util.HashMap;
import java.util.Map;
import java.util.SimpleTimeZone;

public class RubricaTelefonica {

    private Map<String, String> rubrica;

    public RubricaTelefonica(){
        rubrica = new HashMap<>();
    }

    public void inserisciContatto(String nome, String telefono) {
        rubrica.put(nome, telefono);
    }

    public void cancellaContatto(String nome) {
        rubrica.remove(nome);
    }

    public String ricercaNome(String telefono) {
        for (Map.Entry<String, String> entry : rubrica.entrySet()) {
            if (entry.getValue().equals(telefono)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public String ricercaTelefono(String nome){
    return rubrica.get(nome);
}

public void stampaRubrica(){
        for (Map.Entry<String, String> entry: rubrica.entrySet()) {
            System.out.println("Nome: " + entry.getKey() + ", Telefono: " + entry.getValue());
        }
    }
}
