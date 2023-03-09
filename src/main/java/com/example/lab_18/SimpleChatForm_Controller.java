package com.example.lab_18;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class SimpleChatForm_Controller {
    @FXML
    private TextArea TA1;
    @FXML
    private TextField TF1;
    @FXML
    private void enter(ActionEvent eventTwo){
       TA1.setText(TA1.getText()+"Your message: "+TF1.getText() +"\n");
        TF1.setText("");
        TF1.requestFocus();
    }
    @FXML
    private void click(ActionEvent eventOne){
        TA1.setText(TA1.getText() + "Your message: " + TF1.getText() + "\n");
        TF1.setText("");
        TF1.requestFocus();
    }
    @FXML
    private Button button1;

}
