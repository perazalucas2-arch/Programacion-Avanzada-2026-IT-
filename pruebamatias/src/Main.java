public class Main {

    public static void main(String[] args) {

        Estudiante e1 = new Estudiante("maria", 18, 1, 10);
        Estudiante e2 = new Estudiante("pepe", 20, 2, 4);
        e1.mostrarDatos();
        if (e1.getPromedio() > 5){
            System.out.println("aprueba");
        }
        e1.setPromedio(12);
        System.out.println(e1.aprueba());
        System.out.println(e2.aprueba());
    }
}
