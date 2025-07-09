public class prodotti {
    
//Un prodotto è caratterizzato da:
// - codice (numero intero)
// - nome
// - descrizione
// - prezzo
// - iva
// Usate opportunamente costruttori, attributi ed eventuali altri metodi di “utilità” per fare in modo che:
// - alla creazione di un nuovo prodotto il codice sia valorizzato con un numero random
// - il prodotto esponga un metodo per avere il prezzo base
// - il prodotto esponga un metodo per avere il prezzo comprensivo di iva
// - il prodotto esponga un metodo per avere il nome esteso, ottenuto concatenando codice-nome
// Aggiungete una classe Main con metodo main nella quale testate tutte le funzionalità della classe Prodotto.

//

//ELENCO LE CARATTERISTICHE

public int codice;

public String nome;

public String descrizione;

public double prezzo;

public double iva;

   public prodotti() {
        codice = (int)(Math.random() * 901); // codice da 0 a 900
 }


public void prezzobaseprodotti() {
    System.out.println("Il prodotto " + nome + " ha il codice " + codice
    + " il prezzo base è di euro " + prezzo);

}
public void prezzoprodottiivato() {
    System.out.println("Il prodotto " + nome + " ha il codice " + codice
    + " il prezzo iva inclusa è di euro " + (prezzo + prezzo * iva));

}

}
