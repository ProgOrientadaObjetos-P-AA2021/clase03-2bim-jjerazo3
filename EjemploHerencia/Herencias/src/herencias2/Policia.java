/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias2;

/**
 *
 * @author USUARIO 2020
 */
public class Policia extends Persona{
    
    private String rango;
    public Policia(String n, String a, int e, String r) {
        super(n, a, e);
        rango = r;
    }
    
    public void setRango(String r){
        rango = r;
    }
    
    public String getRango(){
        return rango;
    }
    
    @Override
    public String toString(){
    
        return String.format("%s - %s", super.toString(), rango);
    }
    
}
