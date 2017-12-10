
package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JInternalFrame;
import javax.swing.JTextField;

/**
 *
 * @author ClauMldo
 */
public class VtnCrear_E_Jugador extends JInternalFrame implements ActionListener{
    private JTextField nombre;
    private JTextField apellido;
    private JTextField cedula;
    private JTextField edad;
    private JTextField nombreDeportivo;
    private JTextField numCamiseta;

    public VtnCrear_E_Jugador() {
        initComponets();
    }
    
    private void initComponets(){
        setTitle("Crear Jugador");
        setClosable(true);
        setMaximizable(true);
        setSize(300, 400);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
