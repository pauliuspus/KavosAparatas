package lt.vcs.kavosaparatas.paulius.Produktai;

public class Produktai {
    private int cukrausKiekis = 0;
    private int kavosPupKiekis = 0;
    private int vandensKiekis = 0;

    public Produktai(int cukrausKiekis, int kavosPupKiekis, int vandensKiekis) {
        this.cukrausKiekis = cukrausKiekis;
        this.kavosPupKiekis = kavosPupKiekis;
        this.vandensKiekis = vandensKiekis;
    }

    public int getCukrausKiekis() {
        return cukrausKiekis;
    }

    public void setCukrausKiekis(int cukrausKiekis) {
        this.cukrausKiekis = cukrausKiekis;
    }

    public int getKavosPupKiekis() {
        return kavosPupKiekis;
    }

    public void setKavosPupKiekis(int kavosPupKiekis) {
        this.kavosPupKiekis = kavosPupKiekis;
    }

    public int getVandensKiekis() {
        return vandensKiekis;
    }

    public void setVandensKiekis(int vandensKiekis) {
        this.vandensKiekis = vandensKiekis;
    }

    public static void main(String[] args) {

    }
}
