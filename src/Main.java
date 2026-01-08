import entities.Rettangolo;

public class Main {
    public static void main(String[] args) {
        Rettangolo r1 = new Rettangolo(10.3, 20.6);
        Rettangolo r2 = new Rettangolo(5, 7);
        Rettangolo.stampaRettangolo(r1);
        Rettangolo.stampaDueRettangoli(r1, r2);
    }
}