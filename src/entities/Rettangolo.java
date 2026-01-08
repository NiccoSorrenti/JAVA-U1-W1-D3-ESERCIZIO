package entities;

public class Rettangolo {
    public double altezza;
    public double larghezza;


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

    public void stampaRettangolo(){
        System.out.println("Il perimetro è: " + this.getPerimeter());
        System.out.println("L'area è: " + this.getArea());
    }

    public void stampaDueRettangoli(){
        System.out.println();
    }
}
