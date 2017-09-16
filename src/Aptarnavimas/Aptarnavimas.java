package Aptarnavimas;

import KavosAparatas.KavosAparatas;
import Produktai.Produktai;

public class Aptarnavimas {


    public   KavosAparatas sukurkAparata() {
        return  new KavosAparatas(0,0,0);
    }

    public void isplaukKavosAparata(KavosAparatas isplauk) {
        isplauk.valykAparata();
    }

    public   KavosAparatas[] sukurkMasyva(int n) {
        KavosAparatas[] masyvas = new KavosAparatas[n];
        for(int i = 0; i < masyvas.length ; i++)
        {
            masyvas[i] = new KavosAparatas(0,0,0);
        }
        return masyvas;
    }

    public void sumuokIrValykProduktus(KavosAparatas[] masyvas, int cukrausSuma, int kavosSuma, int vandensSuma) {

        for(int i = 0; i < masyvas.length ; i++)
        {
            cukrausSuma = cukrausSuma + masyvas[i].produktai.getCukrausKiekis();
            kavosSuma = kavosSuma + masyvas[i].produktai.getKavosPupKiekis();
            vandensSuma = vandensSuma + masyvas[i].produktai.getVandensKiekis();
            masyvas[i].produktai.setCukrausKiekis(0);
            masyvas[i].produktai.setKavosPupKiekis(0);
            masyvas[i].produktai.setVandensKiekis(0);
        }

        System.out.println("isvalyta cukraus " + cukrausSuma);
        System.out.println("isvalyta kavos " + kavosSuma);
        System.out.println("isvalyta vandens " + vandensSuma);
    }



    public void isplaukVisusAparatus(KavosAparatas[] masyvas) {

        for(int i = 0; i < masyvas.length ; i++)
        {
            masyvas[i].valykAparata();
        }
    }

    public void priskirkTaPatiObjekta(KavosAparatas[] masyvas) {
        Produktai naujas = new Produktai(10,10,10);
        for(int i = 0; i < masyvas.length ; i++)
        {
            masyvas[i].setProduktai(naujas);
        }
    }
    public void priskirkSkirtingusObjektus(KavosAparatas[] masyvas) {
        Produktai naujas = new Produktai(20,20,20);
        for(int i = 0; i < masyvas.length ; i++)
        {
            masyvas[i].setProduktai(naujas);
        }
    }

    public Produktai istraukProduktus(KavosAparatas k) {
        return k.getProduktai();
    }



    public static void main(String[] args) {


    }

}
