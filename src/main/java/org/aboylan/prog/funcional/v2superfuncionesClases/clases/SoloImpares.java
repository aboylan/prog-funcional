package org.aboylan.prog.funcional.v2superfuncionesClases.clases;

import org.aboylan.prog.funcional.v2superfuncionesClases.interfaces.Predicado;

public class SoloImpares implements Predicado {

    @Override
    public boolean test(Integer valor) {
        return (valor % 2 != 0);
    }
    
}
