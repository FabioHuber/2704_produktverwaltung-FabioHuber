import controller.ProduktverwaltungController;
import javafx.application.Application;
import javafx.stage.Stage;
import view.ProduktverwaltungView;

public class Produktverwaltung extends Application {
    private ProduktverwaltungView view;

    public Produktverwaltung() {
        view = new ProduktverwaltungView();
        new ProduktverwaltungController(view);
    }

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) {
        primaryStage.setTitle("Produktverwaltung");
        primaryStage.setScene(view.getMainScene());
        primaryStage.setMinWidth(550);
        primaryStage.setMinHeight(240);
        primaryStage.show();
    }
}
