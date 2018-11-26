/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DAM215
 */
public class Validaciones {
     public static boolean introducirNombre(String nombre) {
        
        boolean valido = false;
        
            if (nombre.matches("[A-Z]{1}[a-z ]{2,15}")) {
                valido = true;
            }
        
        return valido;
    }
    
}
