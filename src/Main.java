//Scrivere una funzione che restituisca un HashSet riempito
//Creare un oggetto dello stesso tipo inserito nell'HashSet e popolarlo
//Verificare che l' elemento sia parte del Set e stampare il risultato

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> settimana= new HashSet<Integer>();
        settimana.add(1);
        settimana.add(2);
        settimana.add(3);
        for (int i =0; i <=10;i++) {
            if(settimana.contains(i)){
                System.out.println(i + "La settimana si trova nello set");
            } else{
                System.out.println(i + "La settimana non se trova nello set ");
            }
            }
        }
}