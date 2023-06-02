package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ProduktverwaltungView {
    private Scene mainScene;
    private VBox vBoxMain;
    private HBox hBoxTop;
    private HBox hBoxCenter;
    private HBox hBoxBottom;

    private final Label HEADING = new Label("Produktdatenbank");
    private Label produktIdLabel;
    private Label nameLabel;
    private TextField nameTextField;
    private Label beschreibungLabel;
    private TextField beschreibungTextField;
    private Label nettopreisLabel;
    private TextField nettopreisTextField;
    private Label bruttopreisLabel;
    private TextField bruttopreisTextField;
    private Button neuButton;
    private Button speichernButton;
    private Button printButton;


    //saveScene
    private Scene saveWarningScene;
    private Button jaButton;
    private Button neinButton;

    public ProduktverwaltungView() {
        produktIdLabel = new Label();
        beschreibungLabel = new Label("  Beschreibung:  ");
        nameLabel = new Label("Name:           ");
        nettopreisLabel = new Label("Nettopreis: ");
        bruttopreisLabel = new Label("Bruttopreis: ");
        nameTextField = new TextField();
        beschreibungTextField = new TextField();
        nettopreisTextField = new TextField();
        bruttopreisTextField = new TextField();
        neuButton = new Button("Neu");
        speichernButton = new Button("Save");
        printButton = new Button("Print");

        bruttopreisTextField.setEditable(false);

        createMainScene();
    }

    public void createMainScene() {
        vBoxMain = new VBox(10);
        hBoxCenter = new HBox(10);
        hBoxTop = new HBox(10);
        hBoxBottom = new HBox(10);

        nameTextField.setPrefWidth(150);

        neuButton.setPrefWidth(100);
        speichernButton.setPrefWidth(100);
        printButton.setPrefWidth(100);

        HEADING.setAlignment(Pos.CENTER);
        HEADING.setStyle("-fx-font-size: 24px; -fx-font-weight: bold;");
        produktIdLabel.setStyle("-fx-font-size: 18px; -fx-font-weight: bold;");
        hBoxTop.setSpacing(5);

        hBoxBottom.setSpacing(30);
        hBoxBottom.setPadding(new Insets(20, 0, 0, 0));

        hBoxBottom.getChildren().addAll(printButton, neuButton, speichernButton);
        hBoxBottom.setAlignment(Pos.BOTTOM_CENTER);

        hBoxCenter.getChildren().addAll(nettopreisLabel, nettopreisTextField, bruttopreisLabel, bruttopreisTextField);
        hBoxCenter.setAlignment(Pos.CENTER);
        hBoxCenter.setSpacing(10);

        hBoxTop.getChildren().addAll(nameLabel, nameTextField, beschreibungLabel, beschreibungTextField);
        hBoxTop.setAlignment(Pos.CENTER);

        vBoxMain.setAlignment(Pos.BASELINE_CENTER);


        vBoxMain.getChildren().addAll(HEADING, produktIdLabel, hBoxTop, hBoxCenter, hBoxBottom);
        mainScene = new Scene(vBoxMain, 550, 210);
    }

    public void createSaveWarningScene(){
        VBox vBox = new VBox(10);
        HBox hBox = new HBox(10);
        Label label = new Label("Wollen Sie die Daten speichern?");

        jaButton = new Button("Ja");
        neinButton = new Button("Nein");

        hBox.getChildren().addAll(jaButton, neinButton);
        hBox.setAlignment(Pos.CENTER);

        vBox.getChildren().addAll(label, hBox);
        vBox.setAlignment(Pos.CENTER);

        saveWarningScene = new Scene(vBox, 300, 100);
    }

    public Button getNeuButton() {
        return neuButton;
    }

    public Button getSpeichernButton() {
        return speichernButton;
    }

    public Button getPrintButton() {
        return printButton;
    }

    public Scene getMainScene() {
        return mainScene;
    }

    public TextField getNameTextField() {
        return nameTextField;
    }

    public TextField getBeschreibungTextField() {
        return beschreibungTextField;
    }

    public TextField getNettopreisTextField() {
        return nettopreisTextField;
    }

    public Label getProduktIdLabel() {
        return produktIdLabel;
    }

    public TextField getBruttopreisTextField() {
        return bruttopreisTextField;
    }

    public void setBruttopreisTextField(TextField bruttopreisTextField) {
        this.bruttopreisTextField = bruttopreisTextField;
    }

    public Scene getSaveWarningScene(){
        return saveWarningScene;
    }

    public Button getJaButton() {
        return jaButton;
    }

    public Button getNeinButton() {
        return neinButton;
    }
}
