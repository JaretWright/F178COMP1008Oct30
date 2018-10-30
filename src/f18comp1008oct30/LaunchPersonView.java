package f18comp1008oct30;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author jwright
 */
public class LaunchPersonView extends Application{

    public static void main(String[] args)
    {
        launch(args);
    }
    
    
    /**
     * The start method defines where to load the fxml file from.  
     * The fxml file knows it's controller (see fx:controller) and
     * from there we can show the scene
     * @param primaryStage
     * @throws Exception 
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("CreatePersonView.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("My first GUI");
        primaryStage.show();
    }
    
}
