package model;

public class Produkt {

    private static int counter = 1001;
    private String name;
    private String beschreibung;
    private double nettopreis;
    private double bruttopreis;
    private int id;

    public Produkt() {
        id = counter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public double getNettopreis() {
        return nettopreis;
    }

    public void setNettopreis(double nettopreis) {
        this.nettopreis = nettopreis;
    }

    public int getId() {
        return id;
    }

    public void setBruttopreis(double nettopreis) {
        bruttopreis = nettopreis * 1.19;
    }

    public double getBruttopreis() {
        return bruttopreis;
    }
}
