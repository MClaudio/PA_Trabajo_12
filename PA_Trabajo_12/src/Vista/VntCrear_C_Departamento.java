/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Cristian
 */
public class VntCrear_C_Departamento extends JInternalFrame implements ActionListener {
    
    private JTextField txtNmbreDep;
    private JTextField txtNombreSupe;
    private JTextField txtNumeroDep;

    JButton btnGuardar;
    JButton btnNuevo;

    JLabel etiqueta1;
    JLabel etiqueta2;
    JLabel etiqueta3;
    JLabel etiqueta4;
    String auxuniversidades;

    public VntCrear_C_Departamento() {

        initComponents();
    }

    private void initComponents() {
        // TODO Auto-generated method stub

        setSize(250, 300);
        setTitle("INGRESAR DEPARTAMENTOS");
        setClosable(true);
        setMaximizable(false);
        setMaximizable(true);

        getContentPane().setLayout(new FlowLayout());

        btnGuardar = new JButton("GUARDAR");
        btnGuardar.addActionListener(this);
        btnGuardar.setActionCommand("botonGuardar");

        btnNuevo = new JButton("NUEVO");
        btnNuevo.addActionListener(this);
        btnNuevo.setActionCommand("botonNuevo");

        etiqueta1 = new JLabel("NOMBRE DEPARTAMENTO ");
        etiqueta2 = new JLabel("NOMBRE SUPERVISOR ");
        etiqueta3 = new JLabel("NUMERO DEPARTAMENTO ");
        etiqueta4 = new JLabel("EMPLEADO ");

        txtNmbreDep = new JTextField(15);
        txtNombreSupe = new JTextField(15);
        txtNumeroDep = new JTextField(15);
       
        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridBagLayout());
        panel1.setBorder(BorderFactory.createTitledBorder("Datos Departamentos "));

        getContentPane().add(panel1, BorderLayout.CENTER);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel1.add(etiqueta1, gbc);

        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        panel1.add(txtNmbreDep, gbc);

        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel1.add(etiqueta2, gbc);

        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        panel1.add(txtNombreSupe, gbc);

        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel1.add(etiqueta3, gbc);

        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 2;
        panel1.add(txtNumeroDep, gbc);

        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 3;
        panel1.add(etiqueta4, gbc);

       /* gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 3;
        panel1.add(  gbc);*/

        JPanel botones = new JPanel();
        botones.setLayout(new FlowLayout());
        botones.add(btnGuardar);
        botones.add(btnNuevo);

        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 4;
        panel1.add(botones, gbc);

    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        // TODO Auto-generated method stub
        String comando = evt.getActionCommand();

        System.out.println("evento boton " + comando);

        switch (comando) {

            case "botonGuardar":
                guardar();
                break;
            case "botonNuevo":
                limpiar();
                break;
            default:
                break;
        }
    }

    private void limpiar() {

    }

    private void guardar() {

        try {

        } catch (Exception e) {

            e.printStackTrace();
        }

    }


    
    
}
