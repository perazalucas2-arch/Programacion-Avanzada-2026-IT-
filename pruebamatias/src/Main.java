import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        Estudiante e1 = new Estudiante("juan", 30, "2", 10);
        Estudiante e2 = new Estudiante("maria", 22, "1", 8);

        System.out.println(e1.promedio);
        e1.setPromedio(9);

        System.out.println(e1.edad);
        System.out.println(e2.nombre);
        System.out.println(e1.promedio);

    }

    public static class Estudiante {
        String nombre;
        int edad;
        String grupo;
        int promedio;

        public Estudiante(String nombre, int edad, String grupo, int promedio) {
            this.nombre = nombre;
            this.edad = edad;
            this.grupo = grupo;
            this.promedio = promedio;
        }

        public void setPromedio(int promedio) {
            this.promedio = promedio;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public void setGrupo(String grupo) {
            this.grupo = grupo;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;



        }
    }
}