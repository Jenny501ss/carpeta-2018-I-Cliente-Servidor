package jmamani_tarea01;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import javax.swing.*;
import javax.swing.JOptionPane;

public class Coperaciones {
 
    public static String ingreseDatos(String msj){
        String dat =JOptionPane.showInputDialog(msj);
        return dat ;
        
                         
                }
    
    public static void Mensaje(String msj){
            JOptionPane.showMessageDialog(null, msj);
        }
   
   }
