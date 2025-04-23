package com.mascotas.gestion;

public class Pajaro extends Mascota {

public Pajaro(String nombre, String especie, String raza, int edad, String tamaño, String color, String estadoSalud) {
    super(nombre, especie, raza, edad, tamaño, color, estadoSalud);

}

@Override
public void hacerSonido(){
    System.out.println(nombre + " dice: Pío Pío");
}

@Override
public void alimentar() {
    System.out.println(nombre + " está comiendo semillas.");
}

@Override
public void cuidar() {
    System.out.println(nombre + " necesita su jaula limpia y agua fresca.");






}

}