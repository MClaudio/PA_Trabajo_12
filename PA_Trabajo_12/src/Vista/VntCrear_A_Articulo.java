
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

public class VntCrear_A_Articulo extends JInternalFrame implements ActionListener {
    
    private JTextField titulo;
    private JTextField abstrat;
    private JTextField paginaInicio;
    private JTextField paginaFin;
    
    public VntCrear_A_Articulo(){
        implement();
    }
    
    private void implement(){
        setTitle("");
        setClosable(true);
        setMaximizable(true);
        setSize(300,200);
        
        JPanel panel=new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints abc=new GridBagConstraints();
        
        panel.add(new JLabel("Titulo"));
        titulo=new JTextField(15);
        panel.add(titulo);
        
        panel.add(new JLabel("Abstract"));
        abstrat=new JTextField(15);
        panel.add(abstrat);
        
        panel.add(new JLabel("Pagina de Inicio"));
        paginaInicio=new JTextField(5);
        panel.add(paginaInicio);
        
        panel.add(new JLabel("Pagina Fin"));
        paginaFin=new JTextField(5);
        panel.add(paginaFin);
        
        JButton btnGuardar=new JButton("Guardar"); 
        btnGuardar.addActionListener(this);
        btnGuardar.setActionCommand("btnGuardar");
        panel.add(btnGuardar);
        
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
