package com.edi.functionalProgramming.v3_InlineClases.v2_funcional.clases;

import com.edi.functionalProgramming.v3_InlineClases.v2_funcional.interfaces.Proveedor;

public class Naturales implements Proveedor {

    private static int next = 0;

    @Override
    public Integer obtener() {
        return next++;
    }
}
