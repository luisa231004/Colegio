package colegio;

import java.util.Date;

public class Colegio {
    
    private String dueno;
    private String nombre;
    private Boolean privado;
    private int numeroEstudiantes;
    private int numeroDeSalones;
    private int numeroDeMaterias;
    private int numeroDeProfesores;

    public Colegio(
            String dueno, 
            String nombre, 
            Boolean privado, 
            int numeroEstudiantes, 
            int numeroDeSalones, 
            int numeroDeMaterias, 
            int numeroDeProfesores) {
        this.dueno = dueno;
        this.nombre = nombre;
        this.privado = privado;
        this.numeroEstudiantes = numeroEstudiantes;
        this.numeroDeSalones = numeroDeSalones;
        this.numeroDeMaterias = numeroDeMaterias;
        this.numeroDeProfesores = numeroDeProfesores;
    }
            
    
    
   

    public void anadirEstudiantes(){
    this.numeroEstudiantes += 3;
    this.privado = true;
    }
    
    public String getDueno (){
    return dueno;
    }
    public void setDueno(String dueno){
    this.dueno = dueno;
    }
    public String getNombre (){
    return nombre;
    }
    public void setNombre(String nombre){
    this.nombre = nombre;
    }
    public Boolean getPrivado (){
    return privado;
    }
    public void setPrivado(Boolean privado){
    this.privado = privado;
    }
    
    public int getNumeroEstudiantes (){
    return numeroEstudiantes;
    }
    public void setNumeroEstudiantes(int numeroEstudiantes){
    this.numeroEstudiantes = numeroEstudiantes;
    }
    public int getNumeroDeSalones (){
    return numeroDeSalones;
    }
    public void setNumeroDeSalones(int numeroDeSalones){
    this.numeroDeSalones = numeroDeSalones;
    }
    public int getNumeroDeMaterias (){
    return numeroDeMaterias;
    }
    public void setNumeroDeMaterias(int numeroDeMaterias){
    this.numeroDeMaterias = numeroDeMaterias;
    }
    public int getNumeroDeProfesores (){
    return numeroDeProfesores;
    }
    public void setNumeroDeProfesores(int numeroDeProfesores){
    this.numeroDeProfesores = numeroDeProfesores;
    }
    public static void main (String[] args){
        Colegio colegioTecnicoMariaElvinia = new Colegio("Claudia", 
                "Colegio Tecnico Maria Elvinia", 
                true,
                368, 
                22, 
                13, 
                24); 
        System.out.println("La dueña del Colegio es " + colegioTecnicoMariaElvinia.getDueno());
        System.out.println("el nombre del colegio es " + colegioTecnicoMariaElvinia.getNombre());
        System.out.println("Hay " + colegioTecnicoMariaElvinia.getNumeroEstudiantes() + " estudiantes en el colegio");
        System.out.println("Hay una cantidad de " + colegioTecnicoMariaElvinia.getNumeroDeSalones() + " salones en el colegio");
        System.out.println("Se enseñan  " + colegioTecnicoMariaElvinia.getNumeroDeMaterias() + " materias en el colegio");
        System.out.println("Colegio privado:  " + colegioTecnicoMariaElvinia.getPrivado());

    }
}
