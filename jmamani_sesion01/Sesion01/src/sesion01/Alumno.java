package sesion01;

public class Alumno {
    /* MVC Modelo Vista Control */
    String sNombre;
    public void setSNombre(String sNombre) {
        this.sNombre = sNombre;
    }

    public String getSNombre() {
        return sNombre;
    }
    int nEdad;
    public void setNEdad(int nEdad) {
        this.nEdad = nEdad;
    }
    public int getNEdad() {
        return nEdad;
    }
    public Alumno(String sNombre, int nEdad) {
        super();
        this.sNombre = sNombre;
        this.nEdad = nEdad;
    }  
    /*es un constructor porque lleva el mismo nombre que la clase*/
    public Alumno() {
        super();
    }
    public String saludoBienvenido(String psNombre) {
        /* funcion que retorna algo "STRING" usar return*/
        /* un void main por proyecto*/
        /* Los templates son las funciones propias de java "LIBRERIAS" */
        return "Hola Mundo!! Bienvenid@: " + psNombre;
    }
    public static void main(String[] args) {
        /* crear un objeto*/
        Alumno myAlumno = new Alumno();
        
        /* fori [Ctrl] + [ENTER]*/
        for (int i = 0; i < 6; i++) {
            System.out.println(i + myAlumno.saludoBienvenido(" Jenny"));
            ;
        }
    }
}
