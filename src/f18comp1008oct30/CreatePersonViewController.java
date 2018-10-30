
package f18comp1008oct30;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
/**
 * FXML Controller class
 *
 * @author jwright
 */
public class CreatePersonViewController implements Initializable {

    @FXML
    private Label nameLabel;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        nameLabel.setText("My name is Jaret");
    }

}
 