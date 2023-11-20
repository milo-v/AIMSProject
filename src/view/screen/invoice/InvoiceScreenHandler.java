package view.screen.invoice;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import view.screen.BaseScreenHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import view.screen.payment.PaymentWebviewHandler;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class InvoiceScreenHandler extends BaseScreenHandler {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button confirmOrderButton;

    @FXML
    void initialize() {
        assert confirmOrderButton != null : "fx:id=\"confirmOrderButton\" was not injected: check your FXML file 'InvoiceScreen.fxml'.";
        confirmOrderButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Confirm Order button pressed");
                Stage stage = (Stage) confirmOrderButton.getScene().getWindow();
                PaymentWebviewHandler paymentWebviewHandler = new PaymentWebviewHandler(stage);
            }
        });
    }
    public InvoiceScreenHandler(Stage stage, String screenPath) throws IOException {
        super(stage, screenPath);
    }
}
