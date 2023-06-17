/*Ejercicio de laboratorio 6.1.2. Cuevas Romero Desire, Hernández Méndez Gerardo Antonio. 3BV2.*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface Persona {
    String getID();
    String getNombre();
    String getCURP();
    String getDomicilio();
}

class Estudiante implements Persona {
    private String id;
    private String nombre;
    private String curp;
    private String domicilio;
    
    public Estudiante(String id, String nombre, String curp, String domicilio) {
        this.id = id;
        this.nombre = nombre;
        this.curp = curp;
        this.domicilio = domicilio;
    }
    
    public String getID() {
        return id;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getCURP() {
        return curp;
    }
    
    public String getDomicilio() {
        return domicilio;
    }
}

class Docente implements Persona {
    private String id;
    private String nombre;
    private String curp;
    private String domicilio;
    
    public Docente(String id, String nombre, String curp, String domicilio) {
        this.id = id;
        this.nombre = nombre;
        this.curp = curp;
        this.domicilio = domicilio;
    }
    
    public String getID() {
        return id;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getCURP() {
        return curp;
    }
    
    public String getDomicilio() {
        return domicilio;
    }
}

class PAAE implements Persona {
    private String id;
    private String nombre;
    private String curp;
    private String domicilio;
    
    public PAAE(String id, String nombre, String curp, String domicilio) {
        this.id = id;
        this.nombre = nombre;
        this.curp = curp;
        this.domicilio = domicilio;
    }
    
    public String getID() {
        return id;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getCURP() {
        return curp;
    }
    
    public String getDomicilio() {
        return domicilio;
    }
}