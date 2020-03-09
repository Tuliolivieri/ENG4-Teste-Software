/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.software.Visao;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.Property;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.input.MouseEvent;
import teste.software.Util.MaskFieldUtil;

/**
 *
 * @author tulio
 */
public class FXMLDocumentController implements Initializable
{

    @FXML
    private JFXDatePicker dpData;
    @FXML
    private JFXCheckBox cbInc;
    @FXML
    private JFXCheckBox cbDesc;
    @FXML
    private JFXTextField tfvalor;
    @FXML
    private JFXTextArea taMotivo;
    @FXML
    private JFXButton btConfirmar;
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        MaskFieldUtil.numericField(tfvalor);
        
        tfvalor.setDisable(true);
        taMotivo.setDisable(true);
    }    

    @FXML
    private void clkCbInc(ActionEvent event) 
    {
        if(cbInc.selectedProperty().getValue() == true)
        {    
            cbDesc.selectedProperty().set(false);
            tfvalor.setDisable(false);
            taMotivo.setDisable(false);
        }
        checkTipo();
    }

    @FXML
    private void clkCbDesc(ActionEvent event) 
    {
        if(cbDesc.selectedProperty().getValue() == true)
        {    
            cbInc.selectedProperty().set(false);
            tfvalor.setDisable(false);
            taMotivo.setDisable(false);
        }
        checkTipo();
    }

    private void checkTipo()
    {
        if(cbDesc.selectedProperty().getValue() == false && cbInc.selectedProperty().getValue() == false)
        {
            tfvalor.setDisable(true);
            taMotivo.setDisable(true);
        }
    }
}
