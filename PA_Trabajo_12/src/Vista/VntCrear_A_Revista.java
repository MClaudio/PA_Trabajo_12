
package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JInternalFrame;
import javax.swing.JTextField;

public class VntCrear_A_Revista extends JInternalFrame implements ActionListener {

    private JTextField Isdn;
    private JTextField numeroEdicion;
    private JTextField nombre;
    private JTextField idioma;
    
    public VntCrear_A_Revista(){
        implement();
    }
    
    public void implement(){
        setTitle("");
        setClosable(true);
        setMaximizable(true);
        setSize(300,200);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
    
    
}
