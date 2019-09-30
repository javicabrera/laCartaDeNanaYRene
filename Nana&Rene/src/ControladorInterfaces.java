
import InterfazGrafica.PaginaPrincipal;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author elias
 */
public class ControladorInterfaces {
    PaginaPrincipal principal = new PaginaPrincipal();
        
    public ControladorInterfaces(){
        
        
    }
    
    public void iniciarInterfaz(){
        principal.setLocationRelativeTo(null);
        principal.setVisible(true);
    }
    
}
