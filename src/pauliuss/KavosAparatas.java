package pauliuss;

import pauliuss.Produktai.Produktai;

public class KavosAparatas {

    public static final String JUODA = "juoda";
    public static final String BALTA = "balta";
    public static final String MOCHA = "mocha";


    private static final int PANAUDOJIMU_SKAICIUS_PLOVIMAS = 100;
    private static final int DEFAULT_PRODUCT_VALUE = 50;
//
//    private int cukrausKiekis = 0;
//    private int kavosPupKiekis = 0;
//    private int vandensKiekis = 0;

    private int panaudojimuSkaicius = 0;

    public Produktai produktai;

    public KavosAparatas(int cukrausKiekis, int kavosPupKiekis, int vandensKiekis) {
        produktai = new Produktai(cukrausKiekis, kavosPupKiekis, vandensKiekis);
    }

    private boolean arUztenka() {

        if (produktai.getCukrausKiekis() < 2) {
            System.out.println("Neuztenka cukraus");
            return false;
        }
        if (produktai.getKavosPupKiekis() < 2) {
            System.out.println("Neuztenka kavos");
            return false;
        }
        if (produktai.getVandensKiekis() < 2) {
            System.out.println("Neuztenka vandens");
            return false;
        }
        return true;

    }


    public void darykJuoda() {
        if (this.panaudojimuSkaicius < DEFAULT_PRODUCT_VALUE) {
            if (arUztenka()) {
                produktai.setCukrausKiekis(produktai.getCukrausKiekis() - 2);
                produktai.setKavosPupKiekis(produktai.getKavosPupKiekis() - 2);
                produktai.setVandensKiekis(produktai.getVandensKiekis() - 3);
                this.panaudojimuSkaicius++;
            }
        } else System.out.println("isvalyk");
    }

    public void darykBalta() {
        if (this.panaudojimuSkaicius < DEFAULT_PRODUCT_VALUE) {
            if (arUztenka()) {
                produktai.setCukrausKiekis(produktai.getCukrausKiekis() - 1);
                produktai.setKavosPupKiekis(produktai.getKavosPupKiekis() - 2);
                produktai.setVandensKiekis(produktai.getVandensKiekis() - 2);
                this.panaudojimuSkaicius++;
            }
        } else System.out.println("isvalyk");
    }

    public void darykMocha() {
        if (this.panaudojimuSkaicius < DEFAULT_PRODUCT_VALUE) {
            if (arUztenka()) {
                produktai.setCukrausKiekis(produktai.getCukrausKiekis() - 1);
                produktai.setKavosPupKiekis(produktai.getKavosPupKiekis() - 1);
                produktai.setVandensKiekis(produktai.getVandensKiekis() - 3);
                this.panaudojimuSkaicius++;
            }
        } else System.out.println("isvalyk");
    }

    public void papildykCukraus() {
        if (produktai.getCukrausKiekis() < DEFAULT_PRODUCT_VALUE) {
            produktai.setCukrausKiekis(produktai.getCukrausKiekis() + DEFAULT_PRODUCT_VALUE);
            System.out.println("Cukraus papildyta");
        } else System.out.println("cukraus uztenka");

    }

    public void papildykPupeliu() {
        if (produktai.getKavosPupKiekis() < DEFAULT_PRODUCT_VALUE) {
            produktai.setKavosPupKiekis(produktai.getKavosPupKiekis() + DEFAULT_PRODUCT_VALUE);
            System.out.println("pupeliu papildyta");
        } else System.out.println("pupeliu uztenka");

    }

    public void papildykVandens() {
        if (produktai.getVandensKiekis() < DEFAULT_PRODUCT_VALUE) {
            produktai.setVandensKiekis(produktai.getVandensKiekis() + DEFAULT_PRODUCT_VALUE);
            System.out.println("vandens papildyta");
        } else System.out.println("vandens uztenka");

    }

    public void valykAparata() {
        this.panaudojimuSkaicius = 0;
        System.out.println("isvalytas");
    }

    public void rodykBusena() {
        System.out.println("cukraus, " + produktai.getCukrausKiekis() + "kavos, " + produktai.getKavosPupKiekis() + "vendens, "
                + produktai.getVandensKiekis());
        System.out.println("valimas uz " + (DEFAULT_PRODUCT_VALUE - getPanaudojimuSkaicius()));

    }

    public int getPanaudojimuSkaicius() {
        return panaudojimuSkaicius;
    }

    public void setPanaudojimai(int panaudojimai) {
        this.panaudojimuSkaicius = panaudojimai;
    }

    public Produktai getProduktai() {
        return produktai;
    }

    public void setProduktai(Produktai produktai) {
        this.produktai = produktai;
    }

    public static void main(String[] args) {


    }


//    public KavosAparatas(int cukrausKiekis, int kavosPupKiekis, int vandensKiekis){
//        this.cukrausKiekis = cukrausKiekis;
//        this.kavosPupKiekis = kavosPupKiekis;
//        this.vandensKiekis = vandensKiekis;
//    }
//    public KavosAparatas(int vandensKiekis) {this(vandensKiekis, DEFAULT_PRODUCT_VALUE, DEFAULT_PRODUCT_VALUE);}
//
//    public KavosAparatas(int vandensKiekis, int kavosPupKiekis) {
//        this(vandensKiekis,kavosPupKiekis, DEFAULT_PRODUCT_VALUE);
//    }
//    public KavosAparatas() {
//        this(DEFAULT_PRODUCT_VALUE, DEFAULT_PRODUCT_VALUE, DEFAULT_PRODUCT_VALUE);
//    }
}
