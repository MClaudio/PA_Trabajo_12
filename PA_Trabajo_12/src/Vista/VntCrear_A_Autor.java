
package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JInternalFrame;
import javax.swing.JTextField;

public class VntCrear_A_Autor extends JInternalFrame implements ActionListener {
    
    private JTextField codigo;
    private JTextField nombre;
    private JTextField anioNacimiento;
    private JTextField nacionalidad;
    
    public VntCrear_A_Autor(){
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
