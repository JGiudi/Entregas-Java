package SegundaEntrega;

public class Test {
    public static void main(String[] args) {

        Lista lista = new Lista();

        lista.agregarPersona(new Persona("Fernando", "Alonso"));
        lista.agregarPersona(new Persona("Sergio", "Romero"));
        lista.agregarPersona(new Persona("Lionel", "Messi"));
        lista.agregarPersona(new Persona("Cristiano", "Ronaldo"));
        lista.agregarPersona(new Persona("Andres", "Iniesta"));

        lista.ordenarPorNombre();
        System.out.println("Ordenado por nombre:\n");
        lista.imprimirLista();

        lista.ordenarPorApellido();
        System.out.println("\nOrdenado por apellido:\n");
        lista.imprimirLista();

        lista.ordenarInversamentePorApellido();
        System.out.println("\nOrdenado inversamente por apellido:\n");
        lista.imprimirLista();
    }
}
