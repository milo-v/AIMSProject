package view.screen;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class BaseScreenHandler {
    protected FXMLLoader loader;
    protected BorderPane content;
    protected final Stage stage;
    private Scene scene;
    public BaseScreenHandler(Stage stage, String screenPath) throws IOException {
        this.loader = new FXMLLoader(getClass().getResource(screenPath));
        this.loader.setController(this);
        this.content = (BorderPane) loader.load();

        this.stage = stage;

        if (this.scene == null) {
            this.scene = new Scene(this.content);
        }
        this.stage.setScene(this.scene);
        this.stage.show();
    }
}
