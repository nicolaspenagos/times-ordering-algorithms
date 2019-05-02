package ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import model.Numbers;

public class Controller {
	
	private Numbers n1;

    @FXML
    private TextField txtF1;



    @FXML
    private TextArea textFA;
    

    @FXML
    void generate(ActionEvent event) {
    	int size = Integer.parseInt(txtF1.getText());
    	n1.generateNumbers(size);
    	updateNumbers();
    }
    
    public void initialize() {
    	textFA.setEditable(false);
    	n1=new Numbers();
    	updateNumbers();
  
    }
    public void updateNumbers() {
    	textFA.setText(n1.printArray());
    }

}