package org.aboylan.prog.funcional.v2superfuncionesClases.clases;

import org.aboylan.prog.funcional.v2superfuncionesClases.interfaces.Funcion;

public class AlCuadrado implements Funcion {
    @Override
    public Integer aplicar(Integer valor) {
        return valor * valor;
    }
}
