/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import modelo.Base;

/**
 *
 * @author antonio.gonzalez
 */
public class Productos extends Base{

    private String nombreProducto;
    private int cantidadProdcuto;
    private double valorProducto;

    public Productos() {
    }

    public Productos(String nombreProducto, int cantidadProdcuto, double valorProducto) {
        this.nombreProducto = nombreProducto;
        this.cantidadProdcuto = cantidadProdcuto;
        this.valorProducto = valorProducto;
    }

    /**
     * Get the value of valorProducto
     *
     * @return the value of valorProducto
     */
    public double getValorProducto() {
        return valorProducto;
    }

    /**
     * Set the value of valorProducto
     *
     * @param valorProducto new value of valorProducto
     */
    public void setValorProducto(double valorProducto) {
        this.valorProducto = valorProducto;
    }


    /**
     * Get the value of cantidadProdcuto
     *
     * @return the value of cantidadProdcuto
     */
    public int getCantidadProdcuto() {
        return cantidadProdcuto;
    }

    /**
     * Set the value of cantidadProdcuto
     *
     * @param cantidadProdcuto new value of cantidadProdcuto
     */
    public void setCantidadProdcuto(int cantidadProdcuto) {
        this.cantidadProdcuto = cantidadProdcuto;
    }


    /**
     * Get the value of nombreProducto
     *
     * @return the value of nombreProducto
     */
    public String getNombreProducto() {
        return nombreProducto;
    }

    /**
     * Set the value of nombreProducto
     *
     * @param nombreProducto new value of nombreProducto
     */
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    @Override
    public Base copy() {
       
        return new Productos(nombreProducto, cantidadProdcuto, valorProducto);
    }

    @Override
    public String toString() {
        return "Productos{" + "nombreProducto=" + nombreProducto + ", cantidadProdcuto=" + cantidadProdcuto + ", valorProducto=" + valorProducto + '}';
    }
    
}
