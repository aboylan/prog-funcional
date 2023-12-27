package org.aboylan.prog.funcional.v2superfuncionesClases;

import org.aboylan.prog.funcional.v2superfuncionesClases.clases.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        // 1.- Crear lista de elemento
        List<Integer> numeros = SuperFunciones.proveer(10, new Naturales());
        System.out.println(numeros);
        // 2.- Quedarme solo con los pares
        List<Integer> filtrados = SuperFunciones.filtrar(numeros, new SoloPares());
        System.out.println(filtrados);
        // 3.- Obtener el cuadrado de cada numero
        List<Integer> transformados = SuperFunciones.transformar(filtrados, new AlCubo());
        System.out.println(transformados);
        // 4a.- Mostrar cada cuadrado por pantalla y retornar lista
        List<Integer> actuados =  SuperFunciones.actuar(transformados, new Impresor());
        // 4b.- Mostrar cada cuadrado por pantalla y no retornar nada
        SuperFunciones.consumir(transformados, new Impresor());
        // 5.- Obtener la suma de los cuadrados
        int total = sumarLista(actuados);
        System.out.println("Suma de cuadrados: " + total);
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