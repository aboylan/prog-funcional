package org.aboylan.prog.funcional.v2superfuncionesClases.clases;

import org.aboylan.prog.funcional.v2superfuncionesClases.interfaces.Consumidor;

public class Impresor implements Consumidor {
    @Override
    public void aceptar(Integer valor) {
        System.out.println(valor);
    }
}
