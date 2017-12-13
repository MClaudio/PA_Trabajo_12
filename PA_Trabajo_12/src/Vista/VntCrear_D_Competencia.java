/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.GD_Programa_D;
import Modelo.Programa_D.Atleta;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Cristian
 */
public class VntCrear_D_Competencia extends JInternalFrame implements ActionListener {
    
    private JTextField txtCompetencia;
    private JTextField txtFechaComp;
    private JTextField txtlugarComp;
    private JComboBox<String> atletas;
    private String auxatletas;


    
    JButton btnGuardar;
    JButton btnNuevo;

    JLabel etiqueta1;
    JLabel etiqueta2;
    JLabel etiqueta3;
    JLabel etiqueta4;

    public VntCrear_D_Competencia() {

        initComponents();
    }

    private void initComponents() {
        // TODO Auto-generated method stub

        setSize(250, 300);
        setTitle("INGRESAR EMPRESAS");
        setClosable(true);
        setMaximizable(false);
        setMaximizable(true);

        getContentPane().setLayout(new FlowLayout());
        
        GD_Programa_D gdD = new GD_Programa_D("src/Archivos/Programa_D/Atleta.txt");
        atletas = new JComboBox<String>();
        atletas.setBounds(29, 35, 148, 20);
        String arreglo[] = gdD.listAtletas();
        atletas.setModel(new DefaultComboBoxModel<>(arreglo));
        atletas.addActionListener(this);

        btnGuardar = new JButton("GUARDAR");
        btnGuardar.addActionListener(this);
        btnGuardar.setActionCommand("botonGuardar");

        btnNuevo = new JButton("NUEVO");
        btnNuevo.addActionListener(this);
        btnNuevo.setActionCommand("botonNuevo");

        etiqueta1 = new JLabel("TIPO COMPETENCIA ");
        etiqueta2 = new JLabel("FECHA ");
        etiqueta3 = new JLabel("LUGAR ");
        etiqueta4 = new JLabel("ATLETA ");

        txtCompetencia = new JTextField(15);
        txtFechaComp = new JTextField(15);
        txtlugarComp = new JTextField(15);
       
        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridBagLayout());
        panel1.setBorder(BorderFactory.createTitledBorder("Datos Competencia "));

        getContentPane().add(panel1, BorderLayout.CENTER);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel1.add(etiqueta1, gbc);

        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        panel1.add(txtCompetencia, gbc);

        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel1.add(etiqueta2, gbc);

        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        panel1.add(txtFechaComp, gbc);

        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel1.add(etiqueta3, gbc);

        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 2;
        panel1.add(txtlugarComp, gbc);

        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 3;
        panel1.add(etiqueta4, gbc);

       gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 3;
        panel1.add( atletas, gbc);

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
        
        if (evt.getSource() == atletas) {
            auxatletas = atletas.getSelectedItem().toString();
        }

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
            GD_Programa_D gdD= new GD_Programa_D("src/Archivos/Programa_D/Competencia.txt");
            Atleta atlet= gdD.buscarAtleta(auxatletas);
            gdD.crearCompetencia(txtCompetencia.getText(), txtFechaComp.getText(), txtlugarComp.getText(),atlet.getNombreApellido());
            JOptionPane.showMessageDialog(this, "Datos Guardados con exito...", "Guardar", JOptionPane.INFORMATION_MESSAGE);


        } catch (Exception e) {

            e.printStackTrace();
        }

    }
    
}
