package org.aboylan.prog.funcional.v1imperativa;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        // 1.- Crear lista de elemento
        List<Integer> numeros = crearLista();
        System.out.println(numeros);
        // 2.- Quedarme solo con los pares
        List<Integer> pares = filtrarPares(numeros);
        System.out.println(pares);
        // 3.- Pasar cada numero al cuadrado
        List<Integer> cuadrados = elevarAlCuadrado(pares);
        System.out.println(cuadrados);
        // 4.- Mostrar cada cuadrado por pantalla
        List<Integer> mostrados =  mostrarLista(cuadrados);
        // 5.- Obtener la suma de los cuadrados
        int total = sumarLista(mostrados);
        System.out.println("Suma de cuadrados: " + total);
    }

    private List<Integer> crearLista() {
        return List.of(0, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144);
    }

    private List<Integer> filtrarPares(List<Integer> numeros) {
        List<Integer> resultado = new ArrayList<>();
        // Se recorre la lista y se agrega a la lista resultado solo los numeros
        // de la lista que sean pares
        for (Integer numero : numeros) {
            if (numero % 2 == 0) {
                resultado.add(numero);
            }
        }
        return resultado;
    }

    private List<Integer> elevarAlCuadrado(List<Integer> numeros) {
        List<Integer> resultado = new ArrayList<>();
        // Se recorre la lista y se agrega a la lista resultado el
        // cuadrado de los numero originales
        for (Integer numero : numeros) {
            resultado.add(numero * numero);
        }
        return resultado;
    }

    private List<Integer> mostrarLista(List<Integer> numeros) {
        for (Integer numero : numeros) {
            System.out.println(numero);
        }
        return numeros;
    }

    private int sumarLista(List<Integer> numeros) {
        int total = 0;
        for (Integer numero : numeros) {
            total += numero;
        }
        return total;
    }
}