
package Vista;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ClauMldo
 */
public class VtnCrear_E_Jugador extends JInternalFrame implements ActionListener{
    private JTextField txtNombre;
    private JTextField txtApellido;
    private JTextField txtCedula;
    private JTextField txtEdad;
    private JTextField txtNombreDeportivo;
    private JTextField txtNumCamiseta;
    private JComboBox equipos;

    public VtnCrear_E_Jugador() {
        initComponets();
    }
    
    private void initComponets(){
        setTitle("Crear Jugador");
        setClosable(true);
        setMaximizable(true);
        setSize(300, 300);
        
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
        txtEdad=new JTextField(5);
        panel.add(txtEdad, gbc);
        
        gbc.gridx=0;
        gbc.gridy=4;
        panel.add(new JLabel("Nombre Deportivo:"), gbc);
        gbc.gridx=1;
        gbc.gridy=4;
        txtNombreDeportivo=new JTextField(15);
        panel.add(txtNombreDeportivo, gbc);
        
        gbc.gridx=0;
        gbc.gridy=5;
        panel.add(new JLabel("Numero Deportivo:"), gbc);
        gbc.gridx=1;
        gbc.gridy=5;
        txtNumCamiseta=new JTextField(5);
        panel.add(txtNumCamiseta, gbc);
        
        gbc.gridx=0;
        gbc.gridy=7;
        panel.add(new JLabel("Equipo:"), gbc);
        gbc.gridx=1;
        gbc.gridy=7;
        equipos=new JComboBox();
        panel.add(equipos, gbc);
        
        gbc.gridx=1;
        gbc.gridy=8;
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
    
    public void btnGuardar(){
        try {
            
            JOptionPane.showMessageDialog(this, "Datos Guardados con exito...", "Guardar", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
