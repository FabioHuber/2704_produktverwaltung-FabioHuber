package controller;

import javafx.stage.Stage;
import model.ProduktverwaltungManager;
import view.ProduktverwaltungView;


public class ProduktverwaltungController {
    private ProduktverwaltungView view;
    private ProduktverwaltungManager manager;
    public ProduktverwaltungController(ProduktverwaltungView view) {
        this.view = view;
        manager = new ProduktverwaltungManager();
        makeNewProdukt();

        view.getNeuButton().setOnAction(e -> makeNewProdukt());
        view.getSpeichernButton().setOnAction(e -> saveCurrentProdukt());
        view.getPrintButton().setOnAction(e -> manager.printProdukte());
        view.getNettopreisTextField().setOnKeyReleased(e -> setBruttoPreis());
    }

    private void makeNewProdukt() {
            manager.createProdukt();
            view.getProduktIdLabel().setText("Produkt ID: " + manager.getCurrentProdukt().getId());

            view.getNeuButton().setDisable(true);
            view.getPrintButton().setDisable(true);

            view.getNameTextField().clear();
            view.getBeschreibungTextField().clear();
            view.getNettopreisTextField().clear();
            view.getBruttopreisTextField().clear();
    }

    public void saveCurrentProdukt() {
        view.getNeuButton().setDisable(false);
        view.getPrintButton().setDisable(false);

        manager.getCurrentProdukt().setName(view.getNameTextField().getText());
        manager.getCurrentProdukt().setBeschreibung(view.getBeschreibungTextField().getText());
        manager.getCurrentProdukt().setNettopreis(Double.parseDouble(view.getNettopreisTextField().getText()));
        manager.saveProdukt(manager.getCurrentProdukt());
    }

    public void setBruttoPreis() {
        String text = view.getNettopreisTextField().getText();
        double nettopreis = text.isEmpty() ? 0 : Double.parseDouble(text);

        manager.getCurrentProdukt().setBruttopreis(nettopreis);
        view.getBruttopreisTextField().setText(String.valueOf(manager.getCurrentProdukt().getBruttopreis()));
    }


}
