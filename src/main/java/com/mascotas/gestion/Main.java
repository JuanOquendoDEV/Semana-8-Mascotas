package com.mascotas.gestion;

public class Main {
    public static void main(String[] args) {
    
Perro perro = new Perro("Simon", "Perro", "Chihuahua", 5, "Pequeño", "Negro", "Saludable");


perro.mostratrInformacion();
perro.hacerSonido();
perro.alimentar();
perro.cuidar();


System.out.println();

Gato gato = new Gato("Luna", "Gato", "Persa", 3, "Mediano", "Blanco", "Vacunado");


gato.mostratrInformacion();
gato.hacerSonido();
gato.alimentar();
gato.cuidar();


System.out.println();

Pajaro pajaro = new Pajaro("Piolin", "Pajaro", "Canario", 2, "pequeño", "Amarillo", "Saludable");


pajaro.mostratrInformacion();
pajaro.hacerSonido();
pajaro.alimentar();
pajaro.cuidar();

System.out.println();

Tortuga tortuga = new Tortuga("Rafael",  "Tortuga", "Golfina", 4, "Grande", "Verde", "Lenta pero sana");

tortuga.mostratrInformacion();
tortuga.hacerSonido();
tortuga.alimentar();
tortuga.cuidar();

System.out.println();

System.out.println("Fin de la gestión de mascotas.");




}


}