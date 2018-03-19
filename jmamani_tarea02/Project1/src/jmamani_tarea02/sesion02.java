package jmamani_tarea02;

import java.util.LinkedList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.model.SelectItem;

public class sesion02 {
     String saludo;
    String sNombre;
    String sApellidos;
    String sFecha_Nacimiento;
    int codigo;
    int sexo;
  List<SelectItem>sexos;

    public void setSexos(List<SelectItem> sexos) {
        this.sexos = sexos;
    }

    public List<SelectItem> getSexos() {
        return sexos;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSaludo(String Saludo) {
        this.saludo = Saludo;
    }

    public String getSaludo() {
        return saludo;
    }

    public void setSNombre(String sNombre) {
        this.sNombre = sNombre;
    }

    public String getSNombre() {
        return sNombre;
    }

    public void setSApellidos(String sApellidos) {
        this.sApellidos = sApellidos;
    }

    public String getSApellidos() {
        return sApellidos;
    }

    public void setSFecha_Nacimiento(String sFecha_Nacimiento) {
        this.sFecha_Nacimiento = sFecha_Nacimiento;
    }

    public String getSFecha_Nacimiento() {
        return sFecha_Nacimiento;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

        public sesion02()
        {
                cargarsexos();
                }
        private void cargarsexos() {
        sexos=new LinkedList<SelectItem>();
        SelectItem si=null;

        si=new SelectItem();
        si.setLabel("Masculino");
        si.setValue("Masculino");
        sexos.add(si);

        si=new SelectItem();
        si.setLabel("Femenino");
        si.setValue("Femenino");
        sexos.add(si);
        }

    public String Datos() {
        saludo="Hola mundo!!!!. Bienvenid@"+ sNombre+ " "+sApellidos+" "+sFecha_Nacimiento+" "+codigo+" "+sexo;
        sNombre="";
        sApellidos="";
        sFecha_Nacimiento="";
        return "";
    }
   
    }