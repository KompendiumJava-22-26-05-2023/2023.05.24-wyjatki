package pl.comarch.szkolenia.wyjatki;

public class JakisNowyWyjatek extends Exception {
    private String dodatkoweInformacje;

    public JakisNowyWyjatek(String dodatkoweInformacje) {
        this.dodatkoweInformacje = dodatkoweInformacje;
    }

    public String getDodatkoweInformacje() {
        return dodatkoweInformacje;
    }
}
