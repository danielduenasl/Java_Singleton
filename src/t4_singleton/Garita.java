/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t4_singleton;

/**
 *
 * @author PC
 */
public class Garita {
    
    private static Garita instance;

    public Garita() {
    }
    
    public static Garita getInstance(){
        if (instance == null){
            instance = new Garita();
        }
        return instance;
    }
    
    public void Entrada(){
        System.out.println("Se acaba de registrar una entrada en la garita");
    }
    
    public void Salida(){
        System.out.println("Se acaba de registrar una salida en la garita");
    }
}
