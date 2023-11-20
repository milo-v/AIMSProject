package view.screen.cart;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import view.screen.BaseScreenHandler;
import view.screen.placeorder.PlaceOrderScreenHandler;
import utils.Configs;

public class CartScreenHandler extends BaseScreenHandler {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private HBox cart_media;

    @FXML
    private Button delete_media_button;

    @FXML
    private Button placeOrderButton;

    @FXML
    void initialize() {
        assert cart_media != null : "fx:id=\"cart_media\" was not injected: check your FXML file 'CartScreenHandler.fxml'.";
        assert delete_media_button != null : "fx:id=\"delete_media_button\" was not injected: check your FXML file 'CartScreenHandler.fxml'.";
        placeOrderButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Stage stage = (Stage) placeOrderButton.getScene().getWindow();
                try {
                    PlaceOrderScreenHandler placeOrderScreenHandler = new PlaceOrderScreenHandler(stage, Configs.PLACE_ORDER_SCREEN_PATH);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }

    public CartScreenHandler(Stage stage, String screenPath) throws IOException {
        super(stage, screenPath);
    }
}
