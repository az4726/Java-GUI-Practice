package degreeconvertor;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

/**
 * This is the controller class for the fxml file. It includes the handlers
 * for both of the buttons as well as the methods required to calculate the 
 * temperature conversions
 * 
 * @author Azhar Zaman
 * @version 1.0
 */
public class ConversionWindowController implements Initializable {
    
    //Java Variables
    boolean celcius;
    boolean fahrenheit;
    double result;
    
    //FXML Variables
    @FXML
    private Label heading;

    @FXML
    private Label subheading;

    @FXML
    private TextField temperatureTextBox;

    @FXML
    private RadioButton cRadioBtn;

    @FXML
    private RadioButton fRadioBtn;

    @FXML
    private Button convertButton;

    @FXML
    private Label sentenceResult;

    @FXML
    private Label temperatureResult;

    /**
    * This method is executed if the user chooses to convert to celcius. The 
    * boolean variable celcius is given the value of 'true' and the fahrenheit 
    * variable is given the value 'false'.
    */
    @FXML
    void celciusSelected(ActionEvent event) {
        celcius = true;
        fahrenheit = false;
    }
    
    /**
    * This method is executed if the user chooses to convert to fahrenheit. The 
    * boolean variable fahrenheit is given the value of 'true' and the celcius 
    * variable is given the value 'false'.
    */
    @FXML
    void fahrenheitSelected(ActionEvent event) {
        celcius = false;
        fahrenheit = true;
    }
    
    /**
     * This method is executed once the user presses the convert button. 
     * The first if statement checks to see if the user has typed a number in 
     * and if they have, then the following if statements check to see what the 
     * user would like to convert to. Then the original temperature and the 
     * converted temperature are printed below the buttons.
     */
    @FXML
    void convertPressed(ActionEvent event) {
        if(temperatureTextBox.getText() == null){
            sentenceResult.setText(" ");
            temperatureResult.setText("Please ENTER the temperature you would like to be converted.");
        }
        if(celcius == true){
            sentenceResult.setText(temperatureTextBox.getText());
            temperatureResult.setText(Double.toString(toCelcius(Double.parseDouble(temperatureTextBox.getText()))));
        } else if(fahrenheit == true){
            sentenceResult.setText(temperatureTextBox.getText());
            temperatureResult.setText(Double.toString(toFahrenheit(Double.parseDouble(temperatureTextBox.getText()))));
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    /**
     * This method takes in the user's temperature as a parameter and converts
     * it into the fahrenheit format using the correct formula before returning it.
     * 
     * @param temperature
     * @return result
     */
    private double toFahrenheit(double temperature){
        result = Math.round((temperature * 1.8) + 32);
        return result;
    }
    
    /**
     * This method takes in the user's temperature as a parameter and converts
     * it into the celcius format using the correct formula before returning it.
     * 
     * @param temperature
     * @return result
     */
    private double toCelcius(double temperature){
        result = Math.round((temperature - 32) * 0.5556);
        return result;
    }
}

