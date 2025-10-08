package org.sysimc.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.sysimc.model.Pessoa;

import java.text.DecimalFormat;

public class MainController {

    @FXML
    protected TextField txtNome;

    @FXML
    protected TextField txtAltura;

    @FXML
    protected TextField txtPeso;

    @FXML
    protected Label lbIMC;

    @FXML
    protected Label lbClassificacao;




    Pessoa pessoa = new Pessoa();




    @FXML
    protected void onCalcularIMCClick() {

        DecimalFormat df = new DecimalFormat();

        this.pessoa.setNome(this.txtNome.getText());
        this.pessoa.setAltura(Float.parseFloat (this.txtAltura.getText() ));
        this.pessoa.setPeso(Float.parseFloat (this.txtPeso.getText() ));




        df.applyPattern("#0.00");
        this.lbIMC.setText(df.format(this.pessoa.calcularIMC() ));
        this.lbClassificacao.setText(this.pessoa.classificacaoIMC());





    }
}