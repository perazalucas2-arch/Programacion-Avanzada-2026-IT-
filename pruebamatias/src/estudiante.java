public class Estudiante {
    private String nombre;
    private int edad;
    private int grupo;
    private int promedio;

    public Estudiante(String nombre, int edad, int grupo, int promedio){
        this.nombre = nombre;
        this.edad = edad;
        this.grupo =  grupo;
        this.promedio = promedio;
    }

    public int getPromedio() {
        return promedio;
    }

    public void setPromedio(int promedio) {
        if (promedio > 0 && promedio <= 12){
            this.promedio = promedio;
        } else {
            System.out.println("error. promedio invalido");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad < 0) {
            System.out.println("error. edad negativa");
        } else {
            this.edad = edad;
        }

    }

    public int getGrupo() {
        return grupo;
    }

    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }

    public void mostrarDatos(){
        System.out.println("Estudiante llamado: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Grupo: " + grupo);
        System.out.println("Promedio: "+ promedio);
    }

    public boolean aprueba(){
        if (promedio >= 6){
            return true;
        } else {
            return false;
        }

    }
}
