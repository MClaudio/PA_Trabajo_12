
package Vista;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VntCrear_A_Articulo extends JInternalFrame implements ActionListener {
    
    private JTextField titulo;
    private JTextField abstrat;
    private JTextField paginaInicio;
    private JTextField paginaFin;
    private JComboBox autor;
    
    public VntCrear_A_Articulo(){
        implement();
    }
    
    private void implement(){
        setTitle("");
        setClosable(true);
        setMaximizable(true);
        setSize(400,200);
        
        JPanel panel=new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints abc=new GridBagConstraints();
        
        panel.add(new JLabel("Titulo"));
        titulo=new JTextField(15);
        panel.add(titulo);
        
        abc.gridx=0;
        abc.gridy=1;
        panel.add(new JLabel("Abstract"),abc);
        abc.gridx=1;
        abc.gridy=1;
        abstrat=new JTextField(15);
        panel.add(abstrat,abc);
        
        abc.gridx=0;
        abc.gridy=2;
        panel.add(new JLabel("Pagina de Inicio"),abc);
        abc.gridx=1;
        abc.gridy=2;
        paginaInicio=new JTextField(5);
        panel.add(paginaInicio, abc);
        
        abc.gridx=0;
        abc.gridy=3;
        panel.add(new JLabel("Pagina Fin"),abc);
        abc.gridx=1;
        abc.gridy=3;
        paginaFin=new JTextField(5);
        panel.add(paginaFin,abc);
        
        abc.gridx=0;
        abc.gridy=4;
        panel.add(new JLabel("Autor"),abc);
        abc.gridx=1;
        abc.gridy=4;
        autor=new JComboBox();
        panel.add(autor,abc);
        
        abc.gridx=1;
        abc.gridy=5;
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
            case "btnGuardar":
                guardar();
                break;
        }
    }
    
    public void guardar(){
        try{
            
        }catch(Exception e){
            
        }
    }
    
    
    
}
