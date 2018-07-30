/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
 *
 * @author Azhar Zaman
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

    @FXML
    void celciusSelected(ActionEvent event) {
        celcius = true;
        fahrenheit = false;
    }

    @FXML
    void convertPressed(ActionEvent event) {
        /*while(celcius == false && fahrenheit == false){
            subheading.setText("Please CHOOSE which unit you would like it converted to.");
        }/*/
        if(temperatureTextBox.getText() == null){
            subheading.setText("Please ENTER the temperature you would like to be converted.");
        }
        if(celcius == true){
            sentenceResult.setText(temperatureTextBox.getText());
            temperatureResult.setText(Double.toString(toCelcius(Double.parseDouble(temperatureTextBox.getText()))));
        } else if(fahrenheit == true){
            sentenceResult.setText(temperatureTextBox.getText());
            temperatureResult.setText(Double.toString(toFahrenheit(Double.parseDouble(temperatureTextBox.getText()))));
        }
    }

    @FXML
    void fahrenheitSelected(ActionEvent event) {
        celcius = false;
        fahrenheit = true;
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    private double toFahrenheit(double temperature){
        result = (temperature * 1.8) + 32;
        return result;
        
    }
    
    private double toCelcius(double temperature){
        
        result = (temperature - 32) * 0.5556;
        return result;
        
    }
}

