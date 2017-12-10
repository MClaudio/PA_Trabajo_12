
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

public class VtnCrear_F_Paciente extends JInternalFrame implements ActionListener{
    
    private JTextField txtCedula;
    private JTextField txtNombre;
    private JTextField txtApellido;
    private JTextField txtEspecialidad;

    public VtnCrear_F_Paciente() {
        initComponets();
    }
    
    
   public void initComponets(){
        setTitle("Crear Doctor");
        setClosable(true);
        setMaximizable(true);
        setSize(300, 200);
        
        JPanel panel=new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc=new GridBagConstraints();
        
        panel.add(new JLabel("Nombre:"));
        txtNombre=new JTextField(15);
        panel.add(txtNombre);
        
        gbc.gridx=0;
        gbc.gridy=1;
        panel.add(new JLabel("Apellido:"), gbc);
        gbc.gridx=1;
        gbc.gridy=1;
        txtApellido=new JTextField(15);
        panel.add(txtApellido, gbc);
        
        gbc.gridx=0;
        gbc.gridy=2;
        panel.add(new JLabel("Cedula:"), gbc);
        gbc.gridx=1;
        gbc.gridy=2;
        txtCedula=new JTextField(15);
        panel.add(txtCedula, gbc);
        
        gbc.gridx=0;
        gbc.gridy=3;
        panel.add(new JLabel("Edad:"), gbc);
        gbc.gridx=1;
        gbc.gridy=3;
        txtEspecialidad=new JTextField(5);
        panel.add(txtEspecialidad, gbc);
        
        
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
