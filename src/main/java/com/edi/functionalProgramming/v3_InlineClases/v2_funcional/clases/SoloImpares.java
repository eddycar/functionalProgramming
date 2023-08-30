package com.edi.functionalProgramming.v3_InlineClases.v2_funcional.clases;

import com.edi.functionalProgramming.v3_InlineClases.v2_funcional.interfaces.Predicado;

public class SoloImpares implements Predicado {
    @Override
    public Boolean test(Integer valor) {
        return valor %2 != 0;
    }
}
