import javafx.application.Application;
import javafx.stage.Stage;
import utils.Configs;
import view.screen.cart.CartScreenHandler;

public class App extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        try {
            stage.setTitle("AIMS");
            CartScreenHandler cartScreenHandler = new CartScreenHandler(stage, Configs.CART_SCREEN_PATH);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}