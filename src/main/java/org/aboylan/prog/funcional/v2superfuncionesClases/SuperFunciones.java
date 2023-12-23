package org.aboylan.prog.funcional.v2superfuncionesClases;

import org.aboylan.prog.funcional.v2superfuncionesClases.interfaces.Predicado;

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

}
