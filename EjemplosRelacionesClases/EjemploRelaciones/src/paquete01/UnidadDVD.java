/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

public class UnidadDVD {

    private String marca;
    private double costo;

    public UnidadDVD(String a) {
        marca = a;
    }
    public UnidadDVD(String a, double b) {
        marca = a;
        costo = b;
    }

    public void establecerMarca(String n) {
        marca = n;
    }

    public void establecerCosto(double n) {
        costo = n;
    }

    public String obtenerMarca() {
        return marca;
    }
    public double obtenerCosto() {
        return costo;
    }
}
