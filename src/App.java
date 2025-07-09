public class App {
    
    public static void main(String[] args) {
        
     

        prodotti prodotti1 = new prodotti();
        prodotti1.nome = "maglietta";
        prodotti1.prezzo = 10;
        prodotti1.iva = 0.22;

        prodotti1.prezzobaseprodotti();
        prodotti1.prezzoprodottiivato();

        prodotti prodotti2 = new prodotti();
        prodotti2.nome = "pantalone";
        prodotti2.prezzo = 30;
        prodotti2.iva = 0.22;

        prodotti2.prezzobaseprodotti();
        prodotti2.prezzoprodottiivato();

    }
}

 