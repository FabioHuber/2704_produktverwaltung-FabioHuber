package model;

import java.util.LinkedList;

public class ProduktverwaltungManager {
    private LinkedList<Produkt> produkte;
    private Produkt currentProdukt;

    public ProduktverwaltungManager() {
        produkte = new LinkedList<>();
    }

    public void createProdukt() {
        currentProdukt = new Produkt();
    }

    public LinkedList<Produkt> getProdukte() {
        return produkte;
    }

    public void saveProdukt(Produkt produkt) {
        produkte.add(produkt);
        currentProdukt = null;
    }

    public void printProdukte() {
        for (Produkt produkt : produkte) {
            System.out.println("Produkt: " + produkt.getName() + "\nId: " + produkt.getId() + "\nBeschreibung: " + produkt.getBeschreibung() + "\nNettopreis: " + produkt.getNettopreis() + "\nBruttopreis: " + produkt.getBruttopreis() + "\n" + "====================" + "\n");
        }
    }

    public Produkt getCurrentProdukt() {
        return currentProdukt;
    }
}
