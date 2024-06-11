package SegundaEntrega;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lista {
    private List<Persona> personas;

    public Lista() {
        this.personas = new ArrayList<>();
    }

    public void agregarPersona(Persona persona) {
        this.personas.add(persona);
    }

    public void ordenarPorNombre() {
        //Con Collections.sort ordena la lista según el nombre
        Collections.sort(this.personas, Comparator.comparing(Persona::getNombre));
    }

    public void ordenarPorApellido() {
        //Con Collections.sort ordena la lista según el apellido
        Collections.sort(this.personas, Comparator.comparing(Persona::getApellido));
    }

    public void ordenarInversamentePorApellido() {
        //Con Collections.sort ordena la lista inversamente según el apellido
        Collections.sort(this.personas, Comparator.comparing(Persona::getApellido).reversed());
    }

    public void imprimirLista() {
        // Itera sobre cada persona en la lista y la imprime
        for (Persona persona : this.personas) {
            System.out.println(persona);
        }
    }
}
