/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab01_principal;

/**
 *
 * @author H P
 */
public class Coordenada {
    
    private double x;
    private double y;
    
    public Coordenada() {
       
    }

    public Coordenada(double x, double y) {
 
    }

    public Coordenada(Coordenada c) {
        
    }
    
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    double distancia(Coordenada c){
        return 0.0;        
    }
    
    static double distancia(Coordenada c1, Coordenada c2){
        return 0.0;
    }

    @Override
    public String toString() {
        return "Coordenada{" + "x=" + x + ", y=" + y + '}';
    }
    
    
    
}
