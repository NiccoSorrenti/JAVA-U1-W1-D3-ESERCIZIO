package entities;

public class Rettangolo {
    private double altezza;
    private double larghezza;


    public Rettangolo(double altezza, double larghezza){
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    public double getPerimeter(){
        return (larghezza + altezza) * 2;
    }

    public double getArea(){
        return larghezza * altezza;
    }

    public static void stampaRettangolo(Rettangolo rettangolo){
        System.out.println("Il perimetro è: " + rettangolo.getPerimeter());
        System.out.println("L'area è: " + rettangolo.getArea());
    }

    public static void stampaDueRettangoli(Rettangolo rettangolo1, Rettangolo rettangolo2){
        stampaRettangolo(rettangolo1);
        stampaRettangolo(rettangolo2);
        System.out.println(rettangolo1.getArea() + rettangolo2.getArea() );
        System.out.println(rettangolo1.getPerimeter() + rettangolo2.getPerimeter());
    }
}
