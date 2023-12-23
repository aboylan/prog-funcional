package org.aboylan.prog.funcional.v2superfuncionesClases;

import org.aboylan.prog.funcional.v2superfuncionesClases.interfaces.Funcion;
import org.aboylan.prog.funcional.v2superfuncionesClases.interfaces.Predicado;
import org.aboylan.prog.funcional.v2superfuncionesClases.interfaces.Proveedor;

import java.util.ArrayList;
import java.util.List;

public class SuperFunciones {

    public static List<Integer> filtrar(List<Integer> valores, Predicado predicado) {
        List<Integer> resultado = new ArrayList<Integer>();
        for (Integer valor : valores) {
            if(predicado.test(valor)) {
                resultado.add(valor);
            }
        }
        return resultado;
    }

    public static List<Integer> proveer(int size, Proveedor proveedor) {
        List<Integer> resultado = new ArrayList<Integer>();
        for (int i=0; i < size; i++) {
            resultado.add(proveedor.obtener());
        }
        return resultado;
    }

    public static List<Integer> transformar(List<Integer> valores, Funcion funcion) {
        List<Integer> resultado = new ArrayList<Integer>();
        for (Integer valor : valores) {
            resultado.add(funcion.aplicar(valor));
        }
        return resultado;
    }

}
