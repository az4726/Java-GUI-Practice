/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author Azhar Zaman
 */
public class FXMLDocumentController implements Initializable {
    
    int number = 0;
    String numberString;
    
    @FXML
    private Label counterLabel;

    @FXML
    private Button countButton;

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
