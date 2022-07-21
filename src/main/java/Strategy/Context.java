/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strategy;

/**
 *
 * @author glorona
 */
public class Context {
    
     //atributos
    private Transporte transporte;
    
    //metodos
    public void transportar() {
        //logica de transporte 
    }
    
    public void setStrategy (Transporte t) {
        this.transporte = t;
    }
    
    
}
