
package Vista;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ClauMldo
 */
public class VtnCrear_E_Equipo extends JInternalFrame implements ActionListener{
    
    private JTextField txtNombre;
    private JTextField txtCategoria;

    public VtnCrear_E_Equipo() {
        initComponents();
    }
    
    public void initComponents(){
        setTitle("Crear Equipo");
        setClosable(true);
        setMaximizable(true);
        
        JPanel panel=new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc=new GridBagConstraints();
        
        panel.add(new JLabel("Nombre:"));
        txtNombre=new JTextField(15);
        panel.add(txtNombre);
        
        gbc.gridx=0;
        gbc.gridy=1;
        panel.add(new JLabel("Categoria:"), gbc);
        gbc.gridx=1;
        gbc.gridy=1;
        txtCategoria=new JTextField(5);
        panel.add(txtCategoria, gbc);
        
        getContentPane().add(panel);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
