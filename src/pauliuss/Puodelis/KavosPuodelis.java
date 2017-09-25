package pauliuss.Puodelis;

import pauliuss.Produktai.Produktai;


public class KavosPuodelis extends Puodelis {

    private Produktai produktai;
    private String kavosPavadinimas;
    private boolean arPagaminta;


    public KavosPuodelis(String kavosPavadinimas, int cukrausKiekis, int vandensKiekis, int pupeliuKiekis){
        this.kavosPavadinimas = kavosPavadinimas;
        this.produktai = new Produktai(cukrausKiekis, vandensKiekis, pupeliuKiekis);
    }


}
