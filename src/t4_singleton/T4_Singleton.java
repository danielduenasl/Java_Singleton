/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4_singleton;

/**
 *
 * @author PC
 */
public class T4_Singleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Garita g = new Garita();
        
        g.Entrada();
        g.Salida();
        
        boolean valid = g instanceof Garita;
        System.out.println(valid);
    }
    
}
