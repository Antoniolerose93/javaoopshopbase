public class App {
    
    public static void main(String[] args) {
        
     

        prodotti prodotti1 = new prodotti();
        prodotti1.nome = "maglietta";
        prodotti1.descrizione ="T-shirt";
        prodotti1.prezzo = 20;
        prodotti1.iva = 0.22;
        System.out.println("Il codice prodotto è = " + prodotti1.codice);
        System.out.println("Il prezzo base è = " + prodotti1.prezzobase());
        System.out.println("Il prezzo ivato è = " + prodotti1.prezzoivato());
        System.out.println(prodotti1.nomeCodice());
        System.out.println(String.format("Il prezzo con iva (formattato) è %.2f", prodotti1.prezzoivato()));

        

    }
}

 