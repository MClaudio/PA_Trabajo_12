package vista;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;


public class VtnPrincipal extends JFrame implements ActionListener {

    private JDesktopPane escritorio;

    public VtnPrincipal() throws HeadlessException {
        //GD_Programa_F gdProgramaF = new GD_Programa_F();
        initComponents();
    }

    public void initComponents() {
        setTitle("Panel Administrativo");
        setSize(700, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        escritorio = new JDesktopPane();
        getContentPane().add(escritorio);
        JMenuBar barraMenu = new JMenuBar();

        //Inicio Menu 1
        JMenu menu1 = new JMenu("Programa A");

        JMenu sub1Menu1 = new JMenu("Crear");

        JMenuItem item1Submenu1Menu1 = new JMenuItem("Submenu 1");
        item1Submenu1Menu1.addActionListener(this);
        item1Submenu1Menu1.setActionCommand("item1Submenu1Menu1"); //caso 1
        sub1Menu1.add(item1Submenu1Menu1);

        JMenuItem item2Submenu1Menu1 = new JMenuItem("Submenu 2");
        item2Submenu1Menu1.addActionListener(this);
        item2Submenu1Menu1.setActionCommand("item2Submenu1Menu1"); //caso 2
        sub1Menu1.add(item2Submenu1Menu1);

        JMenuItem item3Submenu1Menu1 = new JMenuItem("Submenu 3");
        item3Submenu1Menu1.addActionListener(this);
        item3Submenu1Menu1.setActionCommand("item3Submenu1Menu1"); //caso 3
        sub1Menu1.add(item3Submenu1Menu1);

        menu1.add(sub1Menu1);

        JMenu sub2Menu1 = new JMenu("Listar");

        JMenuItem item1Submenu2Menu1 = new JMenuItem("Submenu 1");
        item1Submenu2Menu1.addActionListener(this);
        item1Submenu2Menu1.setActionCommand("item1Submenu2Menu1"); //caso 4
        sub2Menu1.add(item1Submenu2Menu1);

        JMenuItem item2Submenu2Menu1 = new JMenuItem("Submenu 2");
        item2Submenu2Menu1.addActionListener(this);
        item2Submenu2Menu1.setActionCommand("item2Submenu2Menu1"); //caso 5
        sub2Menu1.add(item2Submenu2Menu1);

        JMenuItem item3Submenu2Menu1 = new JMenuItem("Submenu 3");
        item3Submenu2Menu1.addActionListener(this);
        item3Submenu2Menu1.setActionCommand("item3Submenu2Menu1"); //caso 6
        sub2Menu1.add(item3Submenu2Menu1);

        menu1.add(sub2Menu1);
        barraMenu.add(menu1);
        //Fin Menu 1

        //Inicio Menu 2
        JMenu menu2 = new JMenu("Programa B");
        JMenu sub1Menu2 = new JMenu("Crear");

        JMenuItem item1Submenu1Menu2 = new JMenuItem("Submenu 1");
        item1Submenu1Menu2.addActionListener(this);
        item1Submenu1Menu2.setActionCommand("item1Submenu1Menu2"); //caso 7
        sub1Menu2.add(item1Submenu1Menu2);

        JMenuItem item2Submenu1Menu2 = new JMenuItem("Submenu 2");
        item2Submenu1Menu2.addActionListener(this);
        item2Submenu1Menu2.setActionCommand("item2Submenu1Menu2"); //caso 8
        sub1Menu2.add(item2Submenu1Menu2);

        JMenuItem item3Submenu1Menu2 = new JMenuItem("Submenu 3");
        item3Submenu1Menu2.addActionListener(this);
        item3Submenu1Menu2.setActionCommand("item3Submenu1Menu2"); //caso 9
        sub1Menu2.add(item3Submenu1Menu2);

        menu2.add(sub1Menu2);

        JMenu sub2Menu2 = new JMenu("Listar");

        JMenuItem item1Submenu2Menu2 = new JMenuItem("Submenu 1");
        item1Submenu2Menu2.addActionListener(this);
        item1Submenu2Menu2.setActionCommand("item1Submenu2Menu2"); //caso 10
        sub2Menu2.add(item1Submenu2Menu2);

        JMenuItem item2Submenu2Menu2 = new JMenuItem("Submenu 2");
        item2Submenu2Menu2.addActionListener(this);
        item2Submenu2Menu2.setActionCommand("item2Submenu2Menu2"); //caso 11
        sub2Menu2.add(item2Submenu2Menu2);

        JMenuItem item3Submenu2Menu2 = new JMenuItem("Submenu 3");
        item3Submenu2Menu2.addActionListener(this);
        item3Submenu2Menu2.setActionCommand("item3Submenu2Menu2"); //caso 12
        sub2Menu2.add(item3Submenu2Menu2);

        menu2.add(sub2Menu2);
        barraMenu.add(menu2);
        //Fin Menu 2

        //Inicio Menu 3
        JMenu menu3 = new JMenu("Menu 3");
        JMenu sub1Menu3 = new JMenu("Crear");

        JMenuItem item1Submenu1Menu3 = new JMenuItem("Submenu 1");
        item1Submenu1Menu3.addActionListener(this);
        item1Submenu1Menu3.setActionCommand("item1Submenu1Menu3"); //caso 13
        sub1Menu3.add(item1Submenu1Menu3);

        JMenuItem item2Submenu1Menu3 = new JMenuItem("Submenu 2");
        item2Submenu1Menu3.addActionListener(this);
        item2Submenu1Menu3.setActionCommand("item2Submenu1Menu3"); //caso 14
        sub1Menu3.add(item2Submenu1Menu3);

        JMenuItem item3Submenu1Menu3 = new JMenuItem("Submenu 3");
        item3Submenu1Menu3.addActionListener(this);
        item3Submenu1Menu3.setActionCommand("item3Submenu1Menu3"); //caso 15
        sub1Menu3.add(item3Submenu1Menu3);

        menu3.add(sub1Menu3);

        JMenu sub2Menu3 = new JMenu("Listar");

        JMenuItem item1Submenu2Menu3 = new JMenuItem("Submenu 1");
        item1Submenu2Menu3.addActionListener(this);
        item1Submenu2Menu3.setActionCommand("item1Submenu2Menu3"); //caso 16
        sub2Menu3.add(item1Submenu2Menu3);

        JMenuItem item2Submenu2Menu3 = new JMenuItem("Submenu 2");
        item2Submenu2Menu3.addActionListener(this);
        item2Submenu2Menu3.setActionCommand("item2Submenu2Menu3"); //caso 17
        sub2Menu3.add(item2Submenu2Menu3);

        JMenuItem item3Submenu2Menu3 = new JMenuItem("Submenu 3");
        item3Submenu2Menu3.addActionListener(this);
        item3Submenu2Menu3.setActionCommand("item3Submenu2Menu3"); //caso 18
        sub2Menu3.add(item3Submenu2Menu3);

        menu3.add(sub2Menu3);
        barraMenu.add(menu3);
        //Fin Menu 3

        //Inicio Menu 4
        JMenu menu4 = new JMenu("Menu 4");
        JMenu sub1Menu4 = new JMenu("Crear");

        JMenuItem item1Submenu1Menu4 = new JMenuItem("Submenu 1");
        item1Submenu1Menu4.addActionListener(this);
        item1Submenu1Menu4.setActionCommand("item1Submenu1Menu4"); //caso 19
        sub1Menu4.add(item1Submenu1Menu4);

        JMenuItem item2Submenu1Menu4 = new JMenuItem("Submenu 2");
        item2Submenu1Menu4.addActionListener(this);
        item2Submenu1Menu4.setActionCommand("item2Submenu1Menu4"); //caso 20
        sub1Menu4.add(item2Submenu1Menu4);

        JMenuItem item3Submenu1Menu4 = new JMenuItem("Submenu 3");
        item3Submenu1Menu4.addActionListener(this);
        item3Submenu1Menu4.setActionCommand("item3Submenu1Menu4"); //caso 21
        sub1Menu4.add(item3Submenu1Menu4);

        menu4.add(sub1Menu4);

        JMenu sub2Menu4 = new JMenu("Listar");

        JMenuItem item1Submenu2Menu4 = new JMenuItem("Submenu 1");
        item1Submenu2Menu4.addActionListener(this);
        item1Submenu2Menu4.setActionCommand("item1Submenu2Menu4"); //caso 22
        sub2Menu4.add(item1Submenu2Menu4);

        JMenuItem item2Submenu2Menu4 = new JMenuItem("Submenu 2");
        item2Submenu2Menu4.addActionListener(this);
        item2Submenu2Menu4.setActionCommand("item2Submenu2Menu4"); //caso 23
        sub2Menu4.add(item2Submenu2Menu4);

        JMenuItem item3Submenu2Menu4 = new JMenuItem("Submenu 3");
        item3Submenu2Menu4.addActionListener(this);
        item3Submenu2Menu4.setActionCommand("item3Submenu2Menu4"); //caso 24
        sub2Menu4.add(item3Submenu2Menu4);

        menu4.add(sub2Menu4);
        barraMenu.add(menu4);
        //Fin Menu 4

        //Inicio Menu 5
        JMenu menu5 = new JMenu("Programa E");
        JMenu sub1Menu5 = new JMenu("Crear");

        JMenuItem item1Submenu1Menu5 = new JMenuItem("Crear Jugador");
        item1Submenu1Menu5.addActionListener(this);
        item1Submenu1Menu5.setActionCommand("item1Submenu1Menu5"); //caso 25
        sub1Menu5.add(item1Submenu1Menu5);

        JMenuItem item2Submenu1Menu5 = new JMenuItem("Crear Equipo");
        item2Submenu1Menu5.addActionListener(this);
        item2Submenu1Menu5.setActionCommand("item2Submenu1Menu5"); //caso 26
        sub1Menu5.add(item2Submenu1Menu5);

        JMenuItem item3Submenu1Menu5 = new JMenuItem("Crear inscripcion");
        item3Submenu1Menu5.addActionListener(this);
        item3Submenu1Menu5.setActionCommand("item3Submenu1Menu5"); //caso 27
        sub1Menu5.add(item3Submenu1Menu5);

        menu5.add(sub1Menu5);

        JMenu sub2Menu5 = new JMenu("Listar");

        JMenuItem item1Submenu2Menu5 = new JMenuItem("Submenu 1");
        item1Submenu2Menu5.addActionListener(this);
        item1Submenu2Menu5.setActionCommand("item1Submenu2Menu5"); //caso 28
        sub2Menu5.add(item1Submenu2Menu5);

        JMenuItem item2Submenu2Menu5 = new JMenuItem("Submenu 2");
        item2Submenu2Menu5.addActionListener(this);
        item2Submenu2Menu5.setActionCommand("item2Submenu2Menu5"); //caso 29
        sub2Menu5.add(item2Submenu2Menu5);

        JMenuItem item3Submenu2Menu5 = new JMenuItem("Submenu 3");
        item3Submenu2Menu5.addActionListener(this);
        item3Submenu2Menu5.setActionCommand("item3Submenu2Menu5"); //caso 30
        sub2Menu5.add(item3Submenu2Menu5);

        menu5.add(sub2Menu5);
        barraMenu.add(menu5);
        //Fin Menu 5

        //Inicio Menu 6
        JMenu menu6 = new JMenu("Programa F");
        JMenu sub1Menu6 = new JMenu("Crear");

        JMenuItem item1Submenu1Menu6 = new JMenuItem("Crear Medico");
        item1Submenu1Menu6.addActionListener(this);
        item1Submenu1Menu6.setActionCommand("item1Submenu1Menu6"); //caso 31
        sub1Menu6.add(item1Submenu1Menu6);

        JMenuItem item2Submenu1Menu6 = new JMenuItem("Crear Paciente");
        item2Submenu1Menu6.addActionListener(this);
        item2Submenu1Menu6.setActionCommand("item2Submenu1Menu6"); //caso 32
        sub1Menu6.add(item2Submenu1Menu6);

        JMenuItem item3Submenu1Menu6 = new JMenuItem("Crear Consulta");
        item3Submenu1Menu6.addActionListener(this);
        item3Submenu1Menu6.setActionCommand("item3Submenu1Menu6"); //caso 33
        sub1Menu6.add(item3Submenu1Menu6);

        menu6.add(sub1Menu6);

        JMenu sub2Menu6 = new JMenu("Listar");

        JMenuItem item1Submenu2Menu6 = new JMenuItem("Submenu 1");
        item1Submenu2Menu6.addActionListener(this);
        item1Submenu2Menu6.setActionCommand("item1Submenu2Menu6"); //caso 34
        sub2Menu6.add(item1Submenu2Menu6);

        JMenuItem item2Submenu2Menu6 = new JMenuItem("Submenu 2");
        item2Submenu2Menu6.addActionListener(this);
        item2Submenu2Menu6.setActionCommand("item2Submenu2Menu6"); //caso 35
        sub2Menu6.add(item2Submenu2Menu6);

        JMenuItem item3Submenu2Menu6 = new JMenuItem("Submenu 3");
        item3Submenu2Menu6.addActionListener(this);
        item3Submenu2Menu6.setActionCommand("item3Submenu2Menu6"); //caso 36
        sub2Menu6.add(item3Submenu2Menu6);

        menu6.add(sub2Menu6);
        barraMenu.add(menu6);
        //Fin Menu 6

        //Inicio Menu Opciones
        JMenu menuOpciones = new JMenu("Opciones");
        JMenuItem itemMenuOpcioneSalir = new JMenuItem("Salir");
        itemMenuOpcioneSalir.addActionListener(this);
        itemMenuOpcioneSalir.setActionCommand("itemMenuOpcioneSalir"); //caso 37
        menuOpciones.add(itemMenuOpcioneSalir);
        barraMenu.add(menuOpciones);
        //Fin Menu Opciones

        setJMenuBar(barraMenu);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());

        switch (e.getActionCommand()) {
            //Inicio crear Menu 1 Programa 1
            case "item1Submenu1Menu1": //caso 1
                crearRevista();
                break;
            case "item2Submenu1Menu1": //caso 2
                crearArticulo();
                break;
            case "item3Submenu1Menu1": //caso 3
                crearAutor();
                break;

            //Inicio listar Menu 1 Programa 1
            case "item1Submenu2Menu1": //caso 4
                break;
            case "item2Submenu2Menu1": //caso 5
                break;
            case "item3Submenu2Menu1": //caso 6
                break;

            //Inicio crear Menu 2 Programa 2
            case "item1Submenu1Menu2": //caso 7
                break;
            case "item2Submenu1Menu2": //caso 8
                break;
            case "item3Submenu1Menu2": //caso 9
                break;

            //Inicio listar Menu 2 Programa 2
            case "item1Submenu2Menu2": //caso 10
                break;
            case "item2Submenu2Menu2": //caso 11
                break;
            case "item3Submenu2Menu2": //caso 12
                break;

            //Inicio crear Menu 3 Programa 3
            case "item1Submenu1Menu3": //caso 13
                break;
            case "item2Submenu1Menu3": //caso 14
                break;
            case "item3Submenu1Menu3": //caso 15
                break;

            //Inicio listar Menu 3 Programa 3
            case "item1Submenu2Menu3": //caso 16
                break;
            case "item2Submenu2Menu3": //caso 17
                break;
            case "item3Submenu2Menu3": //caso 18
                break;

            //Inicio crear Menu 4 Programa 4
            case "item1Submenu1Menu4": //caso 19
                break;
            case "item2Submenu1Menu4": //caso 20
                break;
            case "item3Submenu1Menu4": //caso 21
                break;

            //Inicio listar Menu 4 Programa 4
            case "item1Submenu2Menu4": //caso 22
                break;
            case "item2Submenu2Menu4": //caso 23
                break;
            case "item3Submenu2Menu4": //caso 24
                break;

            //Inicio crear Menu 5 Programa 5
            case "item1Submenu1Menu5": //caso 25
                crearJugador();
                break;
            case "item2Submenu1Menu5": //caso 26
                crearEquipo();
                break;
            case "item3Submenu1Menu5": //caso 27
                crearInscripcion();
                break;

            //Inicio listar Menu 5 Programa 5
            case "item1Submenu2Menu5": //caso 28
                break;
            case "item2Submenu2Menu5": //caso 29
                break;
            case "item3Submenu2Menu5": //caso 30
                break;

            //Inicio crear Menu 6 Programa 6
            case "item1Submenu1Menu6": //caso 31
                crearMedico();
                break;
            case "item2Submenu1Menu6": //caso 32
                crearPaciente();
                break;
            case "item3Submenu1Menu6": //caso 33
                crearConsulta();
                break;

            //Inicio listar Menu 6 Programa 6
            case "item1Submenu2Menu6": //caso 34
                break;
            case "item2Submenu2Menu6": //caso 35
                break;
            case "item3Submenu2Menu6": //caso 36
                break;

            //Inicio Menu Opciones   
            case "itemMenuOpcioneSalir": //caso 37
                salir();
                break;
            case "": //caso 38
                break;
            default:
                break;
        }

    }

    private void salir() {
        int opcion = JOptionPane.showConfirmDialog(this,
                "Seguro desea salir?", "Confirmar",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.INFORMATION_MESSAGE);
        if (opcion == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
        if (opcion == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(this, "Siga trabajando",
                    "MSJ", JOptionPane.INFORMATION_MESSAGE);
        }

    }
    
    private void crearRevista(){
        VntCrear_A_Revista car=new VntCrear_A_Revista();
        try{
            car.setVisible(true);
            car.setSelected(true);
            escritorio.add(car);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    private void crearArticulo(){
        VntCrear_A_Articulo vaa=new VntCrear_A_Articulo();
        try{
            vaa.setVisisble(true);
            vaa.setSelection(true);
            escritorio.add(vaa);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    private void crearAutor(){
        VntCrear_A_Autor caa=new VntCrear_A_Autor();
        try{
            caa.setVisisble(true);
            caa.setSelection(true);
            escritorio.add(caa);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    private void crearMedico() {
        VtnCrear_F_Medico vcm=new VtnCrear_F_Medico();
        try {
            vcm.setVisible(true);
            vcm.setSelected(true);
            escritorio.add(vcm);
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: "+e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void crearPaciente(){
        VtnCrear_F_Paciente cp=new VtnCrear_F_Paciente();
        try {
            cp.setVisible(true);
            cp.setSelected(true);
            escritorio.add(cp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void crearConsulta(){
        VtnCrear_F_Consulta cc=new VtnCrear_F_Consulta();
        try {
            cc.setVisible(true);
            cc.setSelected(true);
            escritorio.add(cc);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void crearJugador(){
        VtnCrear_E_Jugador vcj=new VtnCrear_E_Jugador();
        try {
            vcj.setVisible(true);
            vcj.setSelected(true);
            escritorio.add(vcj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void crearEquipo(){
        VtnCrear_E_Equipo vce=new VtnCrear_E_Equipo();
        try {
            vce.setVisible(true);
            vce.setSelected(true);
            escritorio.add(vce);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void crearInscripcion(){
        VtnCrear_E_Inscripcion vci=new VtnCrear_E_Inscripcion();
        try {
            vci.setVisible(true);
            vci.setSelected(true);
            escritorio.add(vci);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    

}
