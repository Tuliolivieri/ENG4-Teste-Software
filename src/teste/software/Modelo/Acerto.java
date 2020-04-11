/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.software.Modelo;

import java.time.Instant;
import java.util.Date;

/**
 *
 * @author tulio
 */
public class Acerto
{
    private int codigo;
    private Date data;
    private double valor;
    private String tipo;
    private String motivo;

    public Acerto()
    {
        this.codigo = 0;
        this.data = Date.from(Instant.now());
        this.valor = 0;
        this.tipo = "";
        this.motivo = "";
    }
    
    public Acerto(Date data, double valor, String tipo, String motivo)
    {
        this.codigo = 0;
        this.data = data;
        this.valor = valor;
        this.tipo = tipo;
        this.motivo = motivo;
    }
    
    public Acerto(int codigo, Date data, double valor, String tipo, String motivo)
    {
        this.codigo = codigo;
        this.data = data;
        this.valor = valor;
        this.tipo = tipo;
        this.motivo = motivo;
    }

    public int getCodigo()
    {
        return codigo;
    }

    public void setCodigo(int codigo)
    {
        this.codigo = codigo;
    }

    public Date getData()
    {
        return data;
    }

    public void setData(Date data)
    {
        this.data = data;
    }

    public double getValor()
    {
        return valor;
    }

    public void setValor(double valor)
    {
        this.valor = valor;
    }

    public String getTipo()
    {
        return tipo;
    }

    public void setTipo(String tipo)
    {
        this.tipo = tipo;
    }

    public String getMotivo()
    {
        return motivo;
    }

    public void setMotivo(String motivo)
    {
        this.motivo = motivo;
    }

    @Override
    public String toString()
    {
        return "Acerto{" + "codigo=" + codigo + ", data=" + data + ", valor=" + valor + ", tipo=" + tipo + ", motivo=" + motivo + '}';
    }
}
