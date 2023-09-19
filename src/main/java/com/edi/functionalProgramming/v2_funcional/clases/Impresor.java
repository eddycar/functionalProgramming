package com.edi.functionalProgramming.v2_funcional.clases;

import com.edi.functionalProgramming.v2_funcional.interfaces.Consumidor;

public class Impresor implements Consumidor {

    @Override
    public void aceptar(Integer valor) {
        System.out.println(valor);
    }
}
