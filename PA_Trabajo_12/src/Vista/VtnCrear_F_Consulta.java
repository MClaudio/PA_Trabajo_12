
package vista;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ClauMldo
 */
public class VtnCrear_F_Consulta extends JInternalFrame implements ActionListener{
    private JTextField txtFecha;
    private JTextField txtHora;
    
    public VtnCrear_F_Consulta() {
        initComponets();
    }
    
    private void initComponets() {
        setTitle("Crear Doctor");
        setClosable(true);
        setMaximizable(true);
        setSize(300, 200);
        
        JPanel panel=new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc=new GridBagConstraints();
        
        panel.add(new JLabel("Fecha:"));
        txtFecha=new JTextField(10);
        panel.add(txtFecha);
        
        gbc.gridx=0;
        gbc.gridy=1;
        panel.add(new JLabel("Hora:"), gbc);
        gbc.gridx=1;
        gbc.gridy=1;
        txtHora=new JTextField(5);
        panel.add(txtHora, gbc);
        
        gbc.gridx=0;
        gbc.gridy=2;
        panel.add(new JLabel("Doctor:"), gbc);
        gbc.gridx=1;
        gbc.gridy=2;
        //txtCedula=new JTextField(15);
        //panel.add(txtCedula, gbc);
        
        gbc.gridx=0;
        gbc.gridy=3;
        panel.add(new JLabel("Pciente:"), gbc);
        gbc.gridx=1;
        gbc.gridy=3;
        //txtEspecialidad=new JTextField(5);
        //panel.add(txtEspecialidad, gbc);
        
        
        gbc.gridx=1;
        gbc.gridy=4;
        JButton btnGuardar=new JButton("Guardar");
        btnGuardar.addActionListener(this);
        btnGuardar.setActionCommand("btnGuardar");
        panel.add(btnGuardar, gbc);
        
        getContentPane().add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("btnGuardar")) {
            btnGuardar();
        }
    }
    
    private void btnGuardar() {
        try {
            
            JOptionPane.showMessageDialog(this, "Datos Guardados con exito...", "Guardar", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    
}
