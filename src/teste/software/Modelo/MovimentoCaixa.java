/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.software.Modelo;

/**
 *
 * @author tulio
 */
public class MovimentoCaixa
{
    private Caixa caixa;
    private Acerto movimento;
    private int codigo;
    private double valor;
    private String tipo;
    
    public MovimentoCaixa()
    {
        this.caixa = null;
        this.movimento = null;
        this.codigo = 0;
        this.valor = 0;
        this.tipo = "";
    }
    
    public MovimentoCaixa(Caixa caixa, Acerto movimento, double valor, String tipo)
    {
        this.caixa = caixa;
        this.movimento = movimento;
        this.codigo = 0;
        this.valor = valor;
        this.tipo = tipo;
    }
    
    public MovimentoCaixa(Caixa caixa, Acerto movimento, int codigo, double valor, String tipo)
    {
        this.caixa = caixa;
        this.movimento = movimento;
        this.codigo = codigo;
        this.valor = valor;
        this.tipo = tipo;
    }

    public Caixa getCaixa()
    {
        return caixa;
    }

    public void setCaixa(Caixa caixa)
    {
        this.caixa = caixa;
    }

    public Acerto getMovimento()
    {
        return movimento;
    }

    public void setMovimento(Acerto movimento)
    {
        this.movimento = movimento;
    }

    public int getCodigo()
    {
        return codigo;
    }

    public void setCodigo(int codigo)
    {
        this.codigo = codigo;
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
    
    @Override
    public String toString()
    {
        return "MovimentoCaixa{" + "caixa=" + caixa + ", movimento=" + movimento + ", codigo=" + codigo + ", valor=" + valor + ", tipo=" + tipo + '}';
    }
}
