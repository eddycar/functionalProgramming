package com.edi.functionalProgramming.v2_funcional.clases;

import com.edi.functionalProgramming.v2_funcional.interfaces.Funcion;

public class AlCuadrado implements Funcion {
    @Override
    public Integer aplicar(Integer valor) {
        return valor * valor;
    }
}
