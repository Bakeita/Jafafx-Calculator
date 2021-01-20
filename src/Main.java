import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent Scenes = FXMLLoader.load(getClass().getResource("/Form/Calc.fxml"));
        stage.setScene(new Scene(Scenes));
 stage.show();
    }
}
