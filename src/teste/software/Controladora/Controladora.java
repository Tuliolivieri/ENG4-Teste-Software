/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.software.Controladora;

import java.util.Date;
import javax.swing.JOptionPane;
import teste.software.Modelo.*;
import teste.software.Util.Banco;

/**
 *
 * @author tulio
 */
public class Controladora
{
    public boolean cadastrarMovimento(Caixa caixa, Date data, String motivo, String tipo, double valor)
    {
        boolean ok = true;
        //acerto;
        
        if(caixa.isOpen())
        {
            if(valor > 0)
            {
                if(motivo.trim().length() > 10)
                {
                    /// INSERT ACERTO
                    Acerto acerto = new Acerto(data, valor, tipo, motivo);
                    String sql = "insert into acerto(act_data, act_valor, act_tipo, act_motivo) values('$1', $2, '$3', '$4')";
                    sql = sql.replace("$1", acerto.getData().toString());
                    sql = sql.replace("$2", acerto.getValor() + "");
                    sql = sql.replace("$3", acerto.getTipo());
                    sql = sql.replace("$4", acerto.getMotivo());
                    ok = Banco.getCon().manipular(sql);
                    System.out.println(sql);
                    
                    acerto.setCodigo(Banco.getCon().getMaxPK("acerto", "act_codigo"));
                    
                    /// INSERT MOVIMENTO DE CAIXA
                    MovimentoCaixa movcaixa = new MovimentoCaixa(caixa, acerto, acerto.getValor(), acerto.getTipo());
                    sql = "insert into movcaixa(cx_codigo, act_codigo, mov_valor, mov_tipo) values($1, $2, $3, '$4')";
                    sql = sql.replace("$1", movcaixa.getCaixa().getCodigo() + "");
                    sql = sql.replace("$2", acerto.getCodigo() + "");
                    sql = sql.replace("$3", acerto.getValor() + "");
                    sql = sql.replace("$4", acerto.getTipo());
                    System.out.println(sql);
                    ok = Banco.getCon().manipular(sql);
                }
                else
                   JOptionPane.showConfirmDialog(null, "Insira um motivo válido..."); 
            }
            else
                JOptionPane.showConfirmDialog(null, "Valor deve ser positivo...");
        }
        else
            JOptionPane.showConfirmDialog(null, "Caixa fechado...");
        
        return ok;
    }
}
