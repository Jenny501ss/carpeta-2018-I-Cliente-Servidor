package jmamani_tarea01;

import java.util.ArrayList;
import java.util.Iterator;

public class listaCurso {
    ArrayList<cCursos> nomcurso;

       public listaCurso() {
           nomcurso = new <cCursos> ArrayList();
       }

       public void AgregarCurso(cCursos curso) {
           nomcurso.add(curso);
       }

       public void listaCurso() {
           cCursos c;
           Iterator<cCursos> continuar = nomcurso.iterator();
           while (continuar.hasNext()) {
               c = continuar.next();
               System.out.print("Cantante: " + c.getNombre());
               System.out.println("        Curso Elegido: " + c.getNombre());
           }
       }

    }