/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contador;

import Gui.SuContador;

/**
 *
 * @author ramon
 */
public class Contador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SuContador windows = new SuContador();
        windows.setTitle("Simulador de Contador Manual ");
        windows.setVisible(true);
        windows.setLocationRelativeTo(null);
    }
    
}
