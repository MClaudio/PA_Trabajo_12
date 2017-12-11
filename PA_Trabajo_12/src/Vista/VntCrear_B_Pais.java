
package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JInternalFrame;

public class VntCrear_B_Pais extends JInternalFrame implements ActionListener {

    public VntCrear_B_Pais(){
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
