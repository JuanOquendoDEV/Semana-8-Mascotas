package com.mascotas.gestion;

public class Perro extends Mascota {

public Perro(String nombre, String especie, String raza, int edad, String tamaño, String color, String estadoSalud) {
    super(nombre, especie, raza, edad, tamaño, color, estadoSalud);

}

@Override
public void hacerSonido() {
    System.out.println  ( nombre +" dice Guau!" );
}

@Override
public void alimentar() {
    System.out.println("Alimentando al perro " + nombre + " con croquetas.");
}

@Override
public void cuidar() {
    System.out.println(nombre + " necesita un paseo diario y atención veterinaria regular.");

}

}
