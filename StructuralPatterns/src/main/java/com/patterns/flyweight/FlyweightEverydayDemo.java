package com.patterns.flyweight;

public class FlyweightEverydayDemo {

  public static void main(String[] args) {
    Integer firstInt = Integer.valueOf(5);
    Integer secondInt = Integer.valueOf(5);
    Integer thirdInt = Integer.valueOf(10);    
    
    System.out.println(System.identityHashCode(firstInt));
    System.out.println(System.identityHashCode(secondInt));
    System.out.println(System.identityHashCode(thirdInt));
    // el tercero es una direcci�n diferente y eso es porque el 
    // el primero lo est� creando y almacenando en la agrupaci�n literal,
    // la segunda simplemente la saca de esa agrupaci�n literal o esa
    // cach� de peso mosca (flyweight) y luego la tercera crea un nuevo
    // objeto y tambi�n lo recupera de la cach�.
  }
}
