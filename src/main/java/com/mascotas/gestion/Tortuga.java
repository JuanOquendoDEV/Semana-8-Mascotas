package com.mascotas.gestion;

public class Tortuga extends Mascota {
    
    public Tortuga(String nombre, String especie, String raza, int edad, String tamaño, String color, String estadoSalud) {
        super(nombre, especie, raza, edad, tamaño, color, estadoSalud);
    }

    @Override
    public void hacerSonido() {
        System.out.println( nombre + " hace un sonido suave y lento.");
    }

    @Override
    public void alimentar() {
        System.out.println( nombre + " está comiendo lechuga y verduras.");
    }

    @Override
    public void cuidar() {
        System.out.println( nombre + " necesita un ambiente cálido y húmedo.");
    }

}
