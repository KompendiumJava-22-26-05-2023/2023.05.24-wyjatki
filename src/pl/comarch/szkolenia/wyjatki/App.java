package pl.comarch.szkolenia.wyjatki;

public class App {
    public static void main(String[] args) {
        int[] tab = new int[5];
        String s = null;
        try {
            //String s2 = s.toLowerCase();
            System.out.println(tab[9]);
        } catch (ArrayIndexOutOfBoundsException wyjatek) {
            System.out.println("Exception !!!");
            wyjatek.printStackTrace();
            System.out.println(wyjatek.getMessage());
            System.out.println(wyjatek.getCause());
        } catch (NullPointerException exception) {

        } catch (ArithmeticException blad) {

        } finally {
            System.out.println("Finally");
            //zamknij plik
        }

        System.out.println("koniec programu !!");
    }
}
