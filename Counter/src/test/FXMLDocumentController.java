package test;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * This is the controller class for the fxml file. It includes the handlers
 * for both of the buttons.
 * 
 * @author Azhar Zaman
 * @version 1.0
 */
public class FXMLDocumentController implements Initializable {
    
    /*
    * The following variables have been added to store the current counter 
    * value and modify the label that will display that value.
    */
    int number = 0;
    String numberString;
    
    //FXML variables have been added to modify the program further if necessary
    @FXML
    private Label counterLabel;

    @FXML
    private Button countButton;
    
    @FXML
    private Button resetButton;

    /*
    * This method resets the value for counter to 0 and applies the value to 
    * the label on the GUI
    */
    @FXML
    void resetPressed(ActionEvent event) {
        number = 0;
        numberString = Integer.toString(number);
        counterLabel.setText(numberString);
    }

    /*
    * This method increments the value for the counter and applies the value to
    * the label on the GUI
    */
    @FXML
    void countPressed(ActionEvent event) {
        number++;
        numberString = Integer.toString(number);
        counterLabel.setText(numberString);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
