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
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
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
    }    
    
}
