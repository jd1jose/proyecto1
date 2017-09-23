import java.awt.Color;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.WindowConstants;
import javax.swing.border.MatteBorder;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;


public class Practica extends JFrame{
    static Practica pantalla = new Practica(); 
    static Practica pantallasu=new Practica();
    static String SuperUser[]={"ipc1Admin","aux1"};
 public static   Vector<String> User = new Vector<String>();
 public static String dinero[];
 public   static JPanel login, superUser, Userpro, Userproc, Usercash;
 public static JLabel fl;

    private static String ImageIcon(URL resource) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
      public Practica(){
        
          login=new JPanel();
          superUser=new JPanel();
          Userpro=new JPanel();
          Usercash=new JPanel();
         
       setSize(450, 300);
       setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
          setContentPane(login);
          Userpro.setLayout(null);
          Usercash.setLayout(null);
          login.setLayout(null);
          superUser.setLayout(null);
           
                
      
    }
      public static void main(String[] args) {
        pantallasu.show(false);
       PantallaLogueo();
    }
   
public  static void  PantallaLogueo(){
     
   
        pantalla.show(true);
        pantallasu.show(false);
        pantalla.setSize(450, 300);
        pantalla.setContentPane(login);
        pantalla.setTitle("Logueo");
       login.setBackground(Color.CYAN);
        JTextField user= new JTextField();
        user.setBounds(150, 77, 200, 30);
        user.setVisible(true);
        /*****************************************/
        JLabel labeUser = new JLabel();
        labeUser.setBounds(80, 65, 100, 50);
        labeUser.setText("Usuario");
        labeUser.setVisible(true);
        /****************/
        JPasswordField pass= new JPasswordField();
        pass.setBounds(150, 127, 200, 30);
        
        pass.setVisible(true);
        /*****************************************/
        JLabel labepass = new JLabel();
        labepass.setBounds(60, 120, 100, 50);
        labepass.setText("Contraseña");
        labepass.setVisible(true);
        /****************/
        JButton logueo=new JButton();
        logueo.setBounds(60, 175, 300, 20);
        logueo.setText("Iniciar Secion");
        logueo.setVisible(true);
       login.add(logueo);
       login.add(user);
       login.add(labeUser);
       login.add(pass);
       login.add(labepass);
       login.setVisible(true);
       logueo.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                
               String usuario=user.getText();
               String contraseña=pass.getText();
               Logeo(usuario, contraseña);
            }
        });
   
}
 public static void PantalladeSuperUsuario(){
        
        pantalla.show(false);
        pantallasu.show(true);
        pantallasu.setContentPane(superUser);
        pantallasu.setTitle("Super Usuario");
        superUser.setBackground(Color.yellow);
        pantallasu.setSize(600,428);
        /************************/
        JButton Asignacion= new JButton();
        Asignacion.setBounds(40, 150, 200, 30);
        Asignacion.setText("Asignacion de Usuarios");
        Asignacion.setVisible(true);
         /************************/
        superUser.add(Asignacion);
          /************************/
        JButton Asignacionb= new JButton();
        Asignacionb.setBounds(300, 150, 200, 30);
        Asignacionb.setText("Asignacion de Billetes");
        Asignacionb.setVisible(true);
         /************************/
        superUser.add(Asignacionb);
        JButton Exit= new JButton();
        Exit.setBounds(300, 300, 200, 30);
        Exit.setText("Cerrar sesion");
        Exit.setVisible(true);
         /************************/
        superUser.add(Exit);
        
         Asignacion.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
          Exit.setVisible(false);
         Asignacionb.setVisible(false); 
         Asignacion.setVisible(false);    
        JTextField user= new JTextField("");
        user.setBounds(130, 30, 200, 30);
        user.setVisible(true);
        /*****************************************/
        JLabel labeUser = new JLabel();
        labeUser.setBounds(40, 20, 100, 50);
        labeUser.setText("Usuario");
        labeUser.setVisible(true);
        /****************/
        JTextField contraseña= new JTextField("");
        contraseña.setBounds(130, 90, 200, 30);
        contraseña.setVisible(true);
        /*****************************************/
        JLabel pass= new JLabel();
        pass.setBounds(40, 80, 100, 50);
        pass.setText("Contraseña");
        pass.setVisible(true);
         /****************/
        JTextField nombrealumno= new JTextField("");
        nombrealumno.setBounds(130, 150, 200, 30);
        nombrealumno.setVisible(true);
        /*****************************************/
        JLabel namealumno= new JLabel();
        namealumno.setBounds(40, 136, 100, 50);
        namealumno.setText("Alumno");
        namealumno.setVisible(true);
        /****************************/
        JTextField monto= new JTextField("");
        monto.setBounds(130, 210, 200, 30);
        monto.setVisible(true);
        /*****************************************/
        JLabel labemonto= new JLabel();
        labemonto.setBounds(40, 200, 100, 50);
        labemonto.setText("Monto Maximo");
        labemonto.setVisible(true);
        /****************************/
        JTextField saldo= new JTextField("");
        saldo.setBounds(130, 260, 200, 30);
        saldo.setVisible(true);
        /*****************************************/
        JLabel labesaldo= new JLabel();
        labesaldo.setBounds(40, 250, 100, 50);
        labesaldo.setText("Saldo inicial");
        labesaldo.setVisible(true);
        /****************************/
        JRadioButton Pro=new JRadioButton();
        Pro.setBounds(130, 300, 90, 50);
        Pro.setText("Propisto");
        Pro.setVisible(true);
        Pro.setSelected(false);
        String empresa="";
        JRadioButton cash=new JRadioButton();
        cash.setBounds(220, 300, 100, 50);
        cash.setText("cashmoney");
        cash.setVisible(true);
        cash.setSelected(false);
      
        /*****************************************/
        JLabel labeempresa= new JLabel();
        labeempresa.setBounds(40, 300, 100, 50);
        labeempresa.setText("Empresa");
        labeempresa.setVisible(true);
        ButtonGroup empresas=new ButtonGroup();
        empresas.add(cash);
        empresas.add(Pro);
        /************************/
        JButton agregar= new JButton();
        agregar.setBounds(450, 30, 100, 30);
        agregar.setText("Agregar");
        agregar.setVisible(true);
         /************************/
        JButton cerrar= new JButton();
        cerrar.setBounds(450, 60, 100, 30);
        cerrar.setText("Cerrar");
        cerrar.setVisible(true);
       /***************eventos y codigo********************/
        agregar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
               
                 if(Pro.isSelected()==true){
                     System.out.println(Pro.getText());
                    Guardar(user.getText(),nombrealumno.getText(),contraseña.getText(),saldo.getText(),monto.getText(),Pro.getText()); 
                    
                    
                 }else if(cash.isSelected()==true){
                   Guardar(user.getText(),nombrealumno.getText(),contraseña.getText(),saldo.getText(),monto.getText(),cash.getText()); 
                    
                 }
             
                user.setText("");
                nombrealumno.setText("");
                contraseña.setText("");
                saldo.setText("");
                monto.setText("");
                 cash.setVisible(true);
                 cash.setSelected(false);
                 Pro.setVisible(true);
                Pro.setSelected(false);
      
               
            }
        });
       cerrar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
             
        cerrar.setVisible(false);
        agregar.setVisible(false);
        monto.setVisible(false);
        labemonto.setVisible(false); 
        labesaldo.setVisible(false); 
        saldo.setVisible(false); 
        labeempresa.setVisible(false); 
        Pro.setVisible(false); 
        cash.setVisible(false); 
        namealumno.setVisible(false); 
        nombrealumno.setVisible(false); 
        user.setVisible(false); 
        labeUser.setVisible(false); 
        contraseña.setVisible(false); 
        pass.setVisible(false); 
           Asignacion.setVisible(true);       
             Asignacionb.setVisible(true); 
              Exit.setVisible(true);
            }
        });
       
            superUser.add(cerrar);
        superUser.add(agregar);
        superUser.add(monto);
        superUser.add(labemonto);
        superUser.add(labesaldo);
        superUser.add(saldo);
        superUser.add(labeempresa);
        superUser.add(Pro);
        superUser.add(cash);
        superUser.add(namealumno);
        superUser.add(nombrealumno);
        superUser.add(user);
        superUser.add(labeUser);
        superUser.add(contraseña);
        superUser.add(pass);    
               
            }
        });
       Asignacionb.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
             Exit.setVisible(false);
         Asignacionb.setVisible(false); 
         Asignacion.setVisible(false);        
        JTextField deno1= new JTextField("");
        deno1.setBounds(200, 30, 40, 30);
        deno1.setVisible(true);
        /*****************************************/
        JLabel labedeno1 = new JLabel();
        labedeno1.setBounds(40, 20, 200, 50);
        labedeno1.setText("Escriba los billetes de 100");
        labedeno1.setVisible(true);
        /****************/
        JTextField deno2= new JTextField("");
        deno2.setBounds(200, 90, 40, 30);
        deno2.setVisible(true);
        /*****************************************/
        JLabel labedeno2= new JLabel();
        labedeno2.setBounds(40, 80, 200, 50);
        labedeno2.setText("Escriba los billetes de 50");
        labedeno2.setVisible(true);
         /****************/
        JTextField deno3= new JTextField("");
        deno3.setBounds(200, 150, 40, 30);
        deno3.setVisible(true);
        /*****************************************/
        JLabel labedeno3= new JLabel();
        labedeno3.setBounds(40, 136, 200, 50);
        labedeno3.setText("Escriba los billetes de 20");
        labedeno3.setVisible(true);
        /****************************/
        JTextField deno4= new JTextField("");
        deno4.setBounds(200, 210, 40, 30);
        deno4.setVisible(true);
        /*****************************************/
        JLabel labedeno4= new JLabel();
        labedeno4.setBounds(40, 200, 200, 50);
        labedeno4.setText("Escriba los billetes de 10");
        labedeno4.setVisible(true);
        /****************************/
            JButton G= new JButton();
        G.setBounds(450, 60, 100, 30);
        G.setText("Guardar");
        G.setVisible(true);
        G.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
           
             dinero=new String[1];
             dinero[0]=deno1.getText()+" "+deno2.getText()+" "+deno3.getText()+" "+deno4.getText();
            }
        });
            JButton cerrar= new JButton();
        cerrar.setBounds(450, 90, 100, 30);
        cerrar.setText("Cerrar");
        cerrar.setVisible(true);
          cerrar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
             
        cerrar.setVisible(false);
        deno1.setVisible(false);
        deno2.setVisible(false);
        deno3.setVisible(false); 
        deno4.setVisible(false); 
        labedeno1.setVisible(false);
        labedeno2.setVisible(false);
        labedeno3.setVisible(false); 
        labedeno4.setVisible(false); 
        G.setVisible(false);
           Asignacion.setVisible(true);       
             Asignacionb.setVisible(true); 
              Exit.setVisible(true);
            }
        });
       
            superUser.add(cerrar);
        superUser.add(G);
        superUser.add(deno1);
        superUser.add(deno2);
        superUser.add(deno3);
        superUser.add(deno4);
        superUser.add(labedeno1);
        superUser.add(labedeno2);
        superUser.add(labedeno3);
        superUser.add(labedeno4);
            }
        });
       Exit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
              Exit.setVisible(false);
         Asignacionb.setVisible(false); 
         Asignacion.setVisible(false); 
         superUser.setVisible(false);
         pantalla.setContentPane(login);
            PantallaLogueo();
             
            }
        });
        /**********para agregar al panel**************/
      
        
        superUser.setVisible(true);
 }
 public static void Guardar(String user,String nombre,String contraseña,String saldo,String monto, String empresa ){
        
       
       User.add(user+"-"+contraseña+"-"+saldo+"-"+monto+"-"+empresa+"-"+nombre);
   
       JOptionPane.showMessageDialog(pantalla, "se Guardo con exito al Usuario");
 
 }
 public static void PantallaUser(String empresa,String datos,int id){
                int pos=id;
                String datouser[]=datos.split("-");
                String nameuser=datouser[0];
                String name=datouser[5];
                String saldo=datouser[2];
                String montomax=datouser[3];
                String emp=datouser[4];
               if(empresa.equals("Propisto")){
                    pantalla.setContentPane(Userpro);
                    pantalla.setTitle("Propisto");
                    pantalla.setSize(600,428);
                   Userpro.setBackground(Color.green);
                     JButton retirar= new JButton();
                    retirar.setBounds(75, 80, 200, 30);
                    retirar.setText("Retirar Fondos");
                    retirar.setVisible(true);
                    /*********************************/
                     JButton consulta= new JButton();
                    consulta.setBounds(290, 80, 200, 30);
                    consulta.setText("Consulta de Fondos");
                    consulta.setVisible(true);
                    /*********************************/
                     JButton retirarestu= new JButton();
                    retirarestu.setBounds(75, 130, 200, 30);
                    retirarestu.setText("Tranferencia Libre");
                    retirarestu.setVisible(true);
                    
                    /*********************************/
                     JButton transfer= new JButton();
                    transfer.setBounds(290, 130, 200, 30);
                    transfer.setText("Tranferencia saldo");
                    transfer.setVisible(true);
                    /*********************************/
                     JButton reimpre= new JButton();
                    reimpre.setBounds(75, 170, 200, 30);
                    reimpre.setText("Reimpresion saldo");
                    reimpre.setVisible(true);
                    /*********************************/
                     JButton cerrar= new JButton();
                    cerrar.setBounds(290, 170, 200, 30);
                    cerrar.setText("cerrar sesion");
                    cerrar.setVisible(true);
                    /*********************************/
               
                    
                         consulta.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e) {
                  
                    cerrar.setVisible(false);
                    reimpre.setVisible(false);
                    transfer.setVisible(false);
                    retirarestu.setVisible(false);
                    consulta.setVisible(false);
                    retirar.setVisible(false);
                                Saldo(saldo,id);
                                
                          }
                    });
                          transfer.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e) {
                                
                                cerrar.setVisible(false);
                                reimpre.setVisible(false);
                                transfer.setVisible(false);
                                retirarestu.setVisible(false);
                                consulta.setVisible(false);
                                retirar.setVisible(false);
                                Trasferir(saldo,montomax,id);
                                
                          }
                    });
                 
                    Userpro.add(cerrar);
                    Userpro.add(reimpre);
                    Userpro.add(transfer);
                    Userpro.add(retirarestu);
                    Userpro.add(consulta);
                    Userpro.add(retirar);
               }
               if(empresa.equals("cashmoney")){
                   
                     pantalla.setContentPane(Usercash);
                    pantalla.setTitle("Cashmoney");
                    pantalla.setSize(600,428);
                   Usercash.setBackground(Color.gray);
                     JButton retirar= new JButton();
                    retirar.setBounds(75, 60, 200, 30);
                    retirar.setText("Retirar Fondos");
                    retirar.setVisible(true);
                    /*********************************/
                     JButton consulta= new JButton();
                    consulta.setBounds(290, 60, 200, 30);
                    consulta.setText("Consulta de Fondos");
                    consulta.setVisible(true);
                    /*********************************/
                     JButton retirarestu= new JButton();
                    retirarestu.setBounds(75, 110, 200, 30);
                    retirarestu.setText("Tranferencia Libre");
                    retirarestu.setVisible(true);
                    
                    /*********************************/
                     JButton transfer= new JButton();
                    transfer.setBounds(290, 110, 200, 30);
                    transfer.setText("Tranferencia saldo");
                    transfer.setVisible(true);
                    /*********************************/
                     JButton reimpre= new JButton();
                    reimpre.setBounds(75, 150, 200, 30);
                    reimpre.setText("Reimpresion saldo");
                    reimpre.setVisible(true);
                    /*********************************/
                     JButton cerrar= new JButton();
                    cerrar.setBounds(290, 150, 200, 30);
                    cerrar.setText("cerrar sesion");
                    cerrar.setVisible(true);
                    /*********************************/
               
                    
                         consulta.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e) {
                  
                    cerrar.setVisible(false);
                    reimpre.setVisible(false);
                    transfer.setVisible(false);
                    retirarestu.setVisible(false);
                    consulta.setVisible(false);
                    retirar.setVisible(false);
                                Saldo(saldo,id);
                                
                          }
                    });
                          transfer.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e) {
                                
                                cerrar.setVisible(false);
                                reimpre.setVisible(false);
                                transfer.setVisible(false);
                                retirarestu.setVisible(false);
                                consulta.setVisible(false);
                                retirar.setVisible(false);
                                Trasferir(saldo,montomax,id);
                                
                          }
                    });
                 
                    Usercash.add(cerrar);
                    Usercash.add(reimpre);
                    Usercash.add(transfer);
                    Usercash.add(retirarestu);
                    Usercash.add(consulta);
                    Usercash.add(retirar);
               
               }
 }
 public static void Saldo(String Saldo,int id){
                    
             String dato=User.elementAt(id);
             String[]datos=dato.split("-");
                     Calendar d= Calendar.getInstance();
            if(datos[4].equals("Propisto")){ 
                    
                /**********************************************/
                    JLabel propisto= new JLabel();
                    propisto.setBounds(40, 20, 100, 50);
                    propisto.setText("Pro-Pisto");
                    propisto.setVisible(true);
                   /*****************************************/
                    JLabel bienvenida= new JLabel();
                    bienvenida.setBounds(40, 80, 200, 50);
                    bienvenida.setText("Bienvenido su Saldo es: ");
                    bienvenida.setVisible(true);
                   
                    /*****************************************/
                    JLabel saldol= new JLabel();
                    saldol.setBounds(40, 120, 100, 50);
                    saldol.setText(Saldo);
                    saldol.setVisible(true);
                    /**********************/
                    int horas=d.get(Calendar.HOUR);
                   JLabel hora= new JLabel();
                    hora.setBounds(50, 150, 50, 50);
                    hora.setText(Integer.toString(horas));
                    hora.setVisible(true);
                  /*****************************/
                       int minutos=d.get(Calendar.MINUTE);
                   JLabel minuto= new JLabel();
                    minuto.setBounds(60, 150, 50, 50);
                    minuto.setText(":"+Integer.toString(minutos));
                    minuto.setVisible(true);
                  /*****************************/
                       int segundos=d.get(Calendar.SECOND);
                   JLabel segundo= new JLabel();
                    segundo.setBounds(80, 150, 50, 50);
                    segundo.setText(":"+Integer.toString(segundos));
                    segundo.setVisible(true);
                  /*****************************/
                  
                    JButton regresar= new JButton();
                    regresar.setBounds(450, 85, 100, 30);
                    regresar.setText("regresar");
                    regresar.setVisible(true);
                    /****************/
                   
                   /***************eventos y codigo********************/
                   
                   regresar.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e) {
                        
                           segundo.setVisible(false);
                           minuto.setVisible(false);
                           hora.setVisible(false);
                           propisto.setVisible(false);
                           regresar.setVisible(false);
                           saldol.setVisible(false);
                           bienvenida.setVisible(false);
                           PantallaLogueo(id);


                        }
                    });

                    /**********para agregar al panel**************/

                    Userpro.add(hora);
                    Userpro.add(minuto);
                    Userpro.add(segundo);
                    Userpro.add(propisto);
                    Userpro.add(regresar);
                    Userpro.add(saldol);
                    Userpro.add(bienvenida);
                    Userpro.setVisible(true);
            }    
            if(datos[4].equals("cashmoney")){ 
                     /**********************************************/
                    JLabel propisto= new JLabel();
                    propisto.setBounds(40, 20, 100, 50);
                    propisto.setText("Cas-money");
                    propisto.setVisible(true);
                   /*****************************************/
                    JLabel bienvenida= new JLabel();
                    bienvenida.setBounds(40, 80, 200, 50);
                    bienvenida.setText("Bienvenido su Saldo es: ");
                    bienvenida.setVisible(true);
                   
                    /*****************************************/
                    JLabel saldol= new JLabel();
                    saldol.setBounds(40, 136, 100, 50);
                    saldol.setText(Saldo);
                    saldol.setVisible(true);
                    /**********************/
                    int horas=d.get(Calendar.HOUR);
                   JLabel hora= new JLabel();
                    hora.setBounds(40, 150, 50, 50);
                    hora.setText(Integer.toString(horas));
                    hora.setVisible(true);
                  /*****************************/
                       int minutos=d.get(Calendar.MINUTE);
                   JLabel minuto= new JLabel();
                    minuto.setBounds(60, 150, 50, 50);
                    minuto.setText(":"+Integer.toString(minutos));
                    minuto.setVisible(true);
                  /*****************************/
                       int segundos=d.get(Calendar.SECOND);
                   JLabel segundo= new JLabel();
                    segundo.setBounds(80, 150, 50, 50);
                    segundo.setText(":"+Integer.toString(segundos));
                    segundo.setVisible(true);
                  /*****************************/
                  
                    JButton regresar= new JButton();
                    regresar.setBounds(450, 85, 100, 30);
                    regresar.setText("regresar");
                    regresar.setVisible(true);
                    /****************/
                   
                   /***************eventos y codigo********************/
                   
                   regresar.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e) {
                        
                           segundo.setVisible(false);
                           minuto.setVisible(false);
                           hora.setVisible(false);
                           propisto.setVisible(false);
                           regresar.setVisible(false);
                           saldol.setVisible(false);
                           bienvenida.setVisible(false);
                           PantallaLogueo(id);


                        }
                    });

                    /**********para agregar al panel**************/

                    Usercash.add(hora);
                    Usercash.add(minuto);
                    Usercash.add(segundo);
                    Usercash.add(propisto);
                    Usercash.add(regresar);
                    Usercash.add(saldol);
                    Usercash.add(bienvenida);
                    Usercash.setVisible(true);
            } 
 
 } 
 public static void Logeo(String usuario, String contraseña){
           
            if(SuperUser[0].equals(usuario)){
              if( SuperUser[1].equals(contraseña)){
                   
                  login.setVisible(false);
                  
                   PantalladeSuperUsuario();
                }
            }
            
            else 
            {
                for(int i=0; i<User.size();i++){
                
                        String com=User.elementAt(i);
                        String[] vec=com.split("-");
                      
                        if(vec[0].equals(usuario)){
                          if(vec[1].equals(contraseña)){
                                
                                  PantallaUser(vec[4],User.elementAt(i),i); 
                                
                            }
                        }
                }
             
                            
                            
                     
            }
                        
            
    }
 public static void Trasferir(String saldo,String montomax,int id){
 
          
            int saldoestudiante= Integer.parseInt(saldo);
            String montomaxestudiante=montomax;
             String dato=User.elementAt(id);
             String[]datos=dato.split("-");
             if(datos[4].equals("Propisto")){  
                    Userpro.setBackground(Color.green);
                    pantalla.setTitle("Propisto-Trasfer");
                    pantalla.setSize(600,428);
                     JTextField busca= new JTextField();
                    busca.setBounds(40, 60, 100, 30);
                    busca.setVisible(true);
                    /**********************/
                     JButton buscar= new JButton();
                    buscar.setBounds(150, 60, 200, 30);
                    buscar.setText("Buscar");
                    buscar.setVisible(true);
                    /*************************/
                    JTextField monto= new JTextField();
                    monto.setBounds(40, 110, 100, 30);
                    monto.setVisible(false);
                    /**********************/
                     JButton retirar= new JButton();
                    retirar.setBounds(150, 110, 100, 30);
                    retirar.setText("transferir Fondos");
                    retirar.setVisible(false);
                    /*********************************/
                    JLabel lsaldo=new JLabel();
                    lsaldo.setBounds(50, 150, 30, 40);
                    lsaldo.setText("Su saldo es "+saldoestudiante);
                    lsaldo.setVisible(true);
                    
                     /****************/
                       JButton regresar= new JButton();
                    regresar.setBounds(150, 150, 200, 30);
                    regresar.setText("regresar");
                    regresar.setVisible(true);
                     
                    regresar.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e) {
                        
                                  retirar.setVisible(false);
                           regresar.setVisible(false);
                           busca.setVisible(false);
                           buscar.setVisible(false);
                           regresar.setVisible(false);
                           monto.setVisible(false);
                           lsaldo.setVisible(false);
                           PantallaLogueo(id);


                        }
                    });
                    
                   buscar.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e) {
                        
                         String estudiante=busca.getText();
                       
                               
                                for(int i=0; i<User.size();i++){
                                     String com=User.elementAt(i);
                                     String[] vec=com.split("-");
                                    if(vec[0].equals(estudiante)){
                                    int id2=i;
                                        monto.setVisible(true);
                                        retirar.setVisible(true);
                                        
                                          retirar.addActionListener(new ActionListener(){
                                                public void actionPerformed(ActionEvent e) {

                                                 int tranfer=Integer.parseInt(monto.getText());
                                                 int residuo=saldoestudiante-tranfer;
                                                 if(residuo>=0){
                                                 
                                                 int operacion=tranfer+Integer.parseInt(vec[2]) ;
                                                        if(operacion< Integer.parseInt(vec[3]) ){
                                                            System.out.println("que lleva "+vec[2]);
                                                            vec[2]=Integer.toString(operacion);
                                                            
                                                            System.out.println("y sale "+vec[2]);
                                                            String gr=vec[0]+"-"+vec[1]+"-"+vec[2]+"-"+vec[3]+"-"+vec[4]+"-"+vec[5];
                                                            User.setElementAt(gr, id2 );
                                                           String com2=User.elementAt(id);
                                                           String[]vec2=com2.split("-");
                                                           vec2[2]=Integer.toString(residuo);
                                                           String g=vec2[0]+"-"+vec2[1]+"-"+vec2[2]+"-"+vec2[3]+"-"+vec2[4]+"-"+vec2[5]; 
                                                           User.setElementAt(g, id);
                                                        }
                                                        else{JOptionPane.showMessageDialog(pantalla,"Ha llegado al monto maximo del EStudiando");}
                                                 }else{JOptionPane.showMessageDialog(pantalla,"su saldo es insuficiente");}
                                               }
                                           });
                                        
                                    }
                                }
                                                      
                            
                            
                        }
                    });
                    Userpro.add(regresar);
                    Userpro.add(busca);
                    Userpro.add(buscar);
                    Userpro.add(monto);
                    Userpro.add(retirar);
                    Userpro.add(lsaldo);
             }
             else if(datos[4].equals("cashmoney")){
                Usercash.setBackground(Color.gray);
                 pantalla.setTitle("cashmoney-Trasfer");
                    pantalla.setSize(600,428);
                     JTextField busca= new JTextField();
                    busca.setBounds(40, 60, 100, 30);
                    busca.setVisible(true);
                    /**********************/
                     JButton buscar= new JButton();
                    buscar.setBounds(150, 60, 200, 30);
                    buscar.setText("Buscar");
                    buscar.setVisible(true);
                    /*************************/
                    JTextField monto= new JTextField();
                    monto.setBounds(40, 110, 100, 30);
                    monto.setVisible(false);
                    /**********************/
                     JButton retirar= new JButton();
                    retirar.setBounds(150, 110, 100, 30);
                    retirar.setText("transferir Fondos");
                    retirar.setVisible(false);
                    /*********************************/
                    JLabel lsaldo=new JLabel();
                    lsaldo.setBounds(50, 150, 30, 40);
                    lsaldo.setText("Su saldo es "+saldoestudiante);
                    lsaldo.setVisible(true);
                    
                     /****************/
                       JButton regresar= new JButton();
                    regresar.setBounds(150, 150, 200, 30);
                    regresar.setText("regresar");
                    regresar.setVisible(true);
                     
                    regresar.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e) {
                        
                                  retirar.setVisible(false);
                           regresar.setVisible(false);
                           busca.setVisible(false);
                           buscar.setVisible(false);
                           regresar.setVisible(false);
                           monto.setVisible(false);
                           lsaldo.setVisible(false);
                           PantallaLogueo(id);


                        }
                    });
                    
                   buscar.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e) {
                        
                         String estudiante=busca.getText();
                       
                               
                                for(int i=0; i<User.size();i++){
                                     String com=User.elementAt(i);
                                     String[] vec=com.split("-");
                                    if(vec[0].equals(estudiante)){
                                    int id2=i;
                                        monto.setVisible(true);
                                        retirar.setVisible(true);
                                        
                                          retirar.addActionListener(new ActionListener(){
                                                public void actionPerformed(ActionEvent e) {

                                                 int tranfer=Integer.parseInt(monto.getText());
                                                 int residuo=saldoestudiante-tranfer;
                                                 if(residuo>=0){
                                                 
                                                 int operacion=tranfer+Integer.parseInt(vec[2]) ;
                                                        if(operacion< Integer.parseInt(vec[3]) ){                                                        
                                                            vec[2]=Integer.toString(operacion);  
                                                            String gr=vec[0]+"-"+vec[1]+"-"+vec[2]+"-"+vec[3]+"-"+vec[4]+"-"+vec[5];
                                                            User.setElementAt(gr, id2 );
                                                           String com2=User.elementAt(id);
                                                           String[]vec2=com2.split("-");
                                                           vec2[2]=Integer.toString(residuo);
                                                           String g=vec2[0]+"-"+vec2[1]+"-"+vec2[2]+"-"+vec2[3]+"-"+vec2[4]+"-"+vec2[5]; 
                                                           User.setElementAt(g, id);
                                                        }
                                                        else{JOptionPane.showMessageDialog(pantalla,"Ha llegado al monto maximo del EStudiando");}
                                                 }else{JOptionPane.showMessageDialog(pantalla,"su saldo es insuficiente");}
                                               }
                                           });
                                        
                                    }
                                }
                                                      
                            
                            
                        }
                    });
                    Usercash.add(regresar);
                    Usercash.add(busca);
                    Usercash.add(buscar);
                    Usercash.add(monto);
                    Usercash.add(retirar);
                    Usercash.add(lsaldo);
             
             
             }
 }
public  static void  PantallaLogueo(int id){
        pantalla.show(true);
       
        pantalla.setSize(450, 300);
       pantalla.setContentPane(login);
        pantalla.setTitle("Reingreo-Logueo");
        JTextField user= new JTextField();
        user.setBounds(150, 77, 200, 30);
        user.setVisible(true);
        /*****************************************/
        JLabel labeUser = new JLabel();
        labeUser.setBounds(80, 65, 100, 50);
        labeUser.setText("Usuario");
        labeUser.setVisible(true);
        /****************/
        JPasswordField pass= new JPasswordField();
        pass.setBounds(150, 127, 200, 30);
        
        pass.setVisible(true);
        /*****************************************/
        JLabel labepass = new JLabel();
        labepass.setBounds(60, 120, 100, 50);
        labepass.setText("Contraseña");
        labepass.setVisible(true);
        /****************/
        JButton logueo=new JButton();
        logueo.setBounds(60, 175, 300, 20);
        logueo.setText("Iniciar Secion");
        logueo.setVisible(true);
       login.add(logueo);
       login.add(user);
       login.add(labeUser);
       login.add(pass);
       login.add(labepass);
       login.setVisible(true);
       logueo.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                
               String usuario=user.getText();
               String contraseña=pass.getText();
               String com=User.elementAt(id);
               String[] vec=com.split("-");
                      
                        if(vec[0].equals(usuario)){
                          if(vec[1].equals(contraseña)){
                                
                                  PantallaUser(vec[4],User.elementAt(id),id); 
                                
                            }
                        }
            }
        });
   
}
}
