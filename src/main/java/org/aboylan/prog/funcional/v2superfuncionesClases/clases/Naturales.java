package org.aboylan.prog.funcional.v2superfuncionesClases.clases;

import org.aboylan.prog.funcional.v2superfuncionesClases.interfaces.Proveedor;

import java.util.Random;

public class Naturales implements Proveedor {

    private static int next = 0;
    @Override
    public Integer obtener() {
        return next++;
    }
}
