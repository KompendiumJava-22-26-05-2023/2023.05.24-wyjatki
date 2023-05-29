package pl.comarch.szkolenia.wyjatki;

public class Walidator {
    public void sprawdz(int i) throws JakisNowyWyjatek {
        if(i > 100) {
            throw new JakisNowyWyjatek("Podana liczba to: " + i);
        }
    }

    public void x() throws JakisNowyWyjatek {
        sprawdz(1000);
    }
}
