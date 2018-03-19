package jmamani_tarea01;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class cProfesorPrincipal {
 
        public static void main(String[] args)throws ParseException {
        Scanner teclado=new Scanner(System.in);
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
           
            
   String nombre = Coperaciones.ingreseDatos("Ingrese su Nombre:")     ;
   String apellido = Coperaciones.ingreseDatos("Ingrese sus Apellidos");
   Date fechaInicial=dateFormat.parse("2018-03-18");
   Date fechaFinal=dateFormat.parse(JOptionPane.showInputDialog("Ingrese la fecha que ingreso a la UAP:--año-mes-dia"));
      int dias=(int) ((fechaInicial.getTime()-fechaFinal.getTime())/86400000);
       
      
        String curso = Coperaciones.ingreseDatos("Ingrese su Curso asignado:");  
         
        Coperaciones.Mensaje("Sus datos son: "+apellido+" "+nombre+"\n"+" Usted lleva trabajando "+dias+" dias en la UAP \n"+" Los cursos asignados son: "+curso);
      
    
    }

}