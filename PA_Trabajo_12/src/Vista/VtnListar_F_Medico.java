
package Vista;

import Controlador.GD_Programa_F;
import java.awt.BorderLayout;
import java.util.List;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import Modelo.Programa_F.Doctor; 

/**
 *
 * @author ClauMldo
 */ 
public class VtnListar_F_Medico extends JInternalFrame{
    private JTable tlbDoctores;
    private JPanel panel;
    private GD_Programa_F gdF;

    public VtnListar_F_Medico() {
        initComponets();
        gdF=new GD_Programa_F("src/Archivos/Programa_F/Medicos.txt");
    }
    
    public void initComponets(){
        setTitle("Listar Doctores");
        setClosable(true);
        setMaximizable(true);
        setSize(300, 200);
        
        panel=new JPanel();
        panel.setLayout(new BorderLayout());
        initTable();
    }
    
    public void initTable(){
        try {
            String[] cabezera = {"#", "Nombre", "Apellido", "Cedula", "Especialidad"};
            List<Doctor> doc=gdF.leeDatosMedico();
            String[][] datos = new String[doc.size()][cabezera.length];
            for (int i = 0; i < doc.size(); i++) {
                Doctor get = doc.get(i);
                int j = i;
                datos[j][0] = "" + (j + 1);
                datos[j][1] = get.getNombre();
                datos[j][2] = get.getApellido();
                datos[j][3] = get.getCedula();
                datos[j][4] = get.getEspecialidad();
            }
            tlbDoctores = new JTable(datos, cabezera);
            JScrollPane scroll = new JScrollPane(tlbDoctores);
             panel.add(scroll, BorderLayout.CENTER);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Error: Algunos datos no an sido ingresados.", e.getMessage(),
                    JOptionPane.ERROR_MESSAGE);
        } 
    }
}
