/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author alumno
 */
public class Prueba extends JFrame {

    /**
     * @param args the command line arguments
     */
    private JLabel HP;
    private JButton button;
    private JTextField textField;
    private JPasswordField passwordField;
    private JCheckBox checkBox, checkBox1;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private ButtonGroup BG;
    private JComboBox comboBox;
    private JTextArea textArea;
    private JScrollPane ScrollPane;
    public Prueba (){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        HP = new JLabel ("     YA ESTA LA TAREA A ULTIMA HORA ");
        HP.setBounds(40,20,300,30);
        add(HP);
        
        button = new JButton ("Guardar");
        button.setBounds(300,300,200,30);
        add(button);
        
        textField = new JTextField ();
        textField.setBounds(200,300,100,30);
        add(textField);
        
        passwordField = new JPasswordField ("CONTRASEÑA");
        passwordField.setBounds(80,500,100,40);
        add(passwordField); 
        
        checkBox = new JCheckBox ("Estuvo correcto dejar la tarea a ultima hora: Si");
        checkBox.setBounds(100,80,300,40);
        add(checkBox); 
        
         checkBox1 = new JCheckBox ("Estuvo correcto dejar la tarea a ultima hora: No");
        checkBox1.setBounds(100,125,300,40);
        add(checkBox1); 
        
        BG = new ButtonGroup ();
       
        radioButton1 = new JRadioButton ("Puntos Posibles 1");
        radioButton1.setBounds(200,200,300,20);
        add(radioButton1); 
        BG.add(radioButton1);
        radioButton2 = new JRadioButton ("Puntos Posibles 2");
        radioButton2.setBounds(200,230,300,20);
        add(radioButton2); 
        BG.add(radioButton2);
        
        textArea = new JTextArea ();
        ScrollPane = new JScrollPane();
    }
    
    public static void main(String[] args) {
     Prueba MQM = new Prueba ();
     MQM.setBounds(0,0,800,600);
     MQM.setResizable(false);
     MQM.setVisible(true);
     MQM.setLocationRelativeTo(null);
     MQM.setBackground(Color.pink);
    }
    
}
