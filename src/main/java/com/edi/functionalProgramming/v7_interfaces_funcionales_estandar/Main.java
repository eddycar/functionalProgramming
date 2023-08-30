package com.edi.functionalProgramming.v7_interfaces_funcionales_estandar;

import java.util.Random;

//************************************************************************************************************************//
//********************************* EN ESTA VERSION SE UTILIZAN EXPRESIONES LAMBDA ************************************** //
//************************************************************************************************************************//

public class Main {
    public static void main(String[] args) {

        // QUE QUEREMOS HACER => proveer, filtrar, transformar, actuar, reducir

        Random random = new Random();

        Integer total = Flujo.proveer(10, () -> random.nextInt(10))
                .filtrar(valor -> valor % 2 == 0)
                .transformar(valor -> valor * valor)
                .actuar(valor -> System.out.println(valor))
                .reducir(0, (valor1, valor2) -> valor1 + valor2);
        System.out.println("Reduccion " + total);
    }
}
