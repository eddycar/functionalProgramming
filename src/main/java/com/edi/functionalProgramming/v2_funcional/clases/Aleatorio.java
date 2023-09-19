package com.edi.functionalProgramming.v2_funcional.clases;

import com.edi.functionalProgramming.v2_funcional.interfaces.Proveedor;

import java.util.Random;

public class Aleatorio implements Proveedor {

    Random random = new Random();
    @Override
    public Integer obtener() {
        return random.nextInt(1,10);
    }
}
