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
public class Caixa
{
    private int codigo;
    private double saldoInicial;
    private double saldoFinal;
    private boolean status;

    public Caixa()
    {
        this.codigo = 0;
        this.saldoInicial = 0;
        this.saldoFinal = 0;
        this.status = false; // ABERTO = TRUE / FECHADO = FALSE
    }
    
    public Caixa(double saldoInicial, double saldoFinal, boolean status)
    {
        this.codigo = 0;
        this.saldoInicial = saldoInicial;
        this.saldoFinal = saldoFinal;
        this.status = status;
    }
    
    public Caixa(int codigo, double saldoInicial, double saldoFinal, boolean status)
    {
        this.codigo = codigo;
        this.saldoInicial = saldoInicial;
        this.saldoFinal = saldoFinal;
        this.status = status;
    }

    public int getCodigo()
    {
        return codigo;
    }

    public void setCodigo(int codigo)
    {
        this.codigo = codigo;
    }

    public double getSaldoInicial()
    {
        return saldoInicial;
    }

    public void setSaldoInicial(double saldoInicial)
    {
        this.saldoInicial = saldoInicial;
    }

    public double getSaldoFinal()
    {
        return saldoFinal;
    }

    public void setSaldoFinal(double saldoFinal)
    {
        this.saldoFinal = saldoFinal;
    }

    public boolean isStatus()
    {
        return status;
    }

    public void setStatus(boolean status)
    {
        this.status = status;
    }
    
    public boolean isOpen()
    {
        return status;
    }
    
    @Override
    public String toString()
    {
        return "Caixa{" + "codigo=" + codigo + ", saldoInicial=" + saldoInicial + ", saldoFinal=" + saldoFinal + ", status=" + status + '}';
    }
}
