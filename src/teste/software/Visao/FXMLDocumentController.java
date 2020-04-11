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
import java.time.Instant;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import teste.software.Controladora.Controladora;
import teste.software.Modelo.*;
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
    
    Caixa caixa;
    
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        MaskFieldUtil.monetaryField(tfvalor);
        
        tfvalor.setDisable(true);
        taMotivo.setDisable(true);
        
        caixa = new Caixa(1, 1000.00, 0, false);
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

    @FXML
    private void clkConfirmar(ActionEvent event)
    {
        Controladora ctrl = new Controladora();
        String tipo = "";
        if(cbInc.isSelected())
            tipo = "Incremento";
        else
            tipo = "Desconto";
        boolean cadastrou = ctrl.cadastrarMovimento(caixa, Date.from(Instant.now()), taMotivo.getText(), tipo, Double.parseDouble(tfvalor.getText()));
    }
}
