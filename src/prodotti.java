
import java.util.Random;

public class prodotti {
    


public int codice;

public String nome;

public String descrizione;

public double prezzo;

public double iva;

   public prodotti() {
        Random random =new Random();
        this.codice = random.nextInt(1000);
 }


public double prezzobase() {
    return this.prezzo;
  
}

public double prezzoivato() {
    return prezzobase()+ (prezzobase()*iva);

}

public String nomeCodice(){

    String nomeEsteso = codice + "-" + nome;
    return nomeEsteso;
}


}

