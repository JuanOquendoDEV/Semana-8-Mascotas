package com.mascotas.gestion;

public abstract class Mascota {

protected String nombre;
protected String especie;
protected String raza;
protected int edad;
protected String tamaño;
protected String color; 
protected String estadoSalud;

// Constructores 


public Mascota(String nombre, String especie, String raza, int edad, String tamaño, String color, String estadoSalud) {
    this.nombre = nombre;
    this.especie = especie;
    this.raza = raza;
    this.edad = edad;
    this.tamaño = tamaño;
    this.color = color;
    this.estadoSalud = estadoSalud;
}

// Métodos abstractos

public abstract void hacerSonido();
public abstract void alimentar();
public abstract void cuidar();

public void mostratrInformacion() {
    System.out.println("Nombre: " + nombre);
    System.out.println("Especie: " + especie);
    System.out.println("Raza: " + raza);
    System.out.println("Edad: " + edad);
    System.out.println("Tamaño: " + tamaño);
    System.out.println("Color: " + color);
    System.out.println("Estado de salud: " + estadoSalud);
}


}