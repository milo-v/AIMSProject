package view.screen.placeorder;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import view.screen.BaseScreenHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import view.screen.invoice.InvoiceScreenHandler;
import view.screen.placerushorder.PlaceRushOrderScreenHandler;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import utils.Configs;

public class PlaceOrderScreenHandler extends BaseScreenHandler {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button confirmDeliveryButton;

    @FXML
    private Button placeRushOrderButton;

    @FXML
    void initialize() {
        assert confirmDeliveryButton != null : "fx:id=\"confirmDeliveryButton\" was not injected: check your FXML file 'PlaceOrderScreen.fxml'.";
        assert placeRushOrderButton != null : "fx:id=\"placeRushOrderButton\" was not injected: check your FXML file 'PlaceOrderScreen.fxml'.";
        placeRushOrderButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Stage stage = (Stage) placeRushOrderButton.getScene().getWindow();
                try {
                    PlaceRushOrderScreenHandler placeRushOrderScreenHandler = new PlaceRushOrderScreenHandler(stage, Configs.PLACE_RUSH_ORDER_SCREEN_PATH);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        confirmDeliveryButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Stage stage = (Stage) placeRushOrderButton.getScene().getWindow();
                try {
                    InvoiceScreenHandler invoiceScreenHandler = new InvoiceScreenHandler(stage, Configs.INVOICE_SCREEN_PATH);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public PlaceOrderScreenHandler(Stage stage, String screenPath) throws IOException {
        super(stage, screenPath);
    }
}
