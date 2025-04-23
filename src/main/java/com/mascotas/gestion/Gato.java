package com.mascotas.gestion;

public class Gato extends Mascota {
    public Gato(String nombre, String especie, String raza, int edad, String tamaño, String color, String estadoSalud) {
        super(nombre, especie, raza, edad, tamaño, color, estadoSalud);
    }

    @Override
    public void hacerSonido() {
        System.out.println( nombre + " dice: Miau!");
    }

    @Override
    public void alimentar() {
        System.out.println( nombre + " está comiendo comida para gatos.");
    }

    @Override
    public void cuidar() {
        System.out.println( nombre + " Necesita arenero limpio y cepillado regular.");
    }

}
