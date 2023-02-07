public class Capitan {
    private String nombre;
    private String apellido;
    private int matriculaNavegacion;

    public Capitan(String nombre, String apellido, int matriculaNavegacion){
        this.nombre = nombre;
        this.apellido = apellido;
        this.matriculaNavegacion = matriculaNavegacion;
    }

    public String getNombre(){
        return  this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public int getMatriculaNavegacion(){
        return this.matriculaNavegacion;
    }

}
