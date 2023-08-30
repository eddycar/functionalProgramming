package com.edi.functionalProgramming.v3_InlineClases.v2_funcional.clases;

import com.edi.functionalProgramming.v3_InlineClases.v2_funcional.interfaces.FuncionBinaria;

public class Multiplicador implements FuncionBinaria {
    @Override
    public Integer aplicar(Integer valor1, Integer valor2) {
        return valor1 * valor2;
    }
}
