package Vista;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VntCrear_A_Revista extends JInternalFrame implements ActionListener {

    private JTextField Isdn;
    private JTextField numeroEdicion;
    private JTextField nombre;
    private JTextField idioma;

    public VntCrear_A_Revista() {
        implement();
    }

    private void implement() {
        setTitle("Revista");
        setClosable(true);
        setMaximizable(true);
        setSize(300, 200);
        
        JPanel panel=new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints abc=new GridBagConstraints();
        
        panel.add(new JLabel("Ingrese el ISDN"));
        Isdn=new JTextField(10);
        panel.add(Isdn);
        
        abc.gridx=0;
        abc.gridy=1;
        panel.add(new JLabel("Numero de Edicion"),abc);
        abc.gridx=1;
        abc.gridy=1;
        numeroEdicion=new JTextField(5);
        panel.add(numeroEdicion,abc);
        
        abc.gridx=0;
        abc.gridy=2;
        panel.add(new JLabel("Nombre de la Revista"),abc);
        abc.gridx=1;
        abc.gridy=2;
        nombre=new JTextField(15);
        panel.add(nombre, abc);
        
        abc.gridx=0;
        abc.gridy=3;
        panel.add(new JLabel("Idioma"),abc);
        abc.gridx=1;
        abc.gridy=3;
        idioma=new JTextField(10);
        panel.add(idioma,abc);
        
        abc.gridx=1;
        abc.gridy=4;
        JButton btnGuardar=new JButton("Guardar"); 
        btnGuardar.addActionListener(this);
        btnGuardar.setActionCommand("btnGuardar");
        panel.add(btnGuardar,abc);
        
        getContentPane().add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando=e.getActionCommand();
        switch(comando){
            case "btnGuradar":
                btnGuardar();
                break;
        }
    }
    
    public void btnGuardar(){
        try{
            
        }catch(Exception e){
            
        }
    }

}
