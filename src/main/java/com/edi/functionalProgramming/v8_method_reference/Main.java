package com.edi.functionalProgramming.v8_method_reference;

import java.util.Random;

public class Main {

    Random random = new Random();

    public Main() {
        Integer total = Flujo.proveer(10, this::randomInt)
//                .filtrar(valor -> NumbersUtils.esPrimo(valor))
                .filtrar(NumbersUtils::esPrimo)
//                .transformar(valor -> NumbersUtils.elevarAlCuadrado(valor))
                .transformar(NumbersUtils::elevarAlCuadrado)
//                .actuar(valor -> System.out.println(valor))
                .actuar(System.out::println)
//                .reducir(0, (valor1, valor2) -> Integer.sum(valor1, valor2));
                .reducir(0, Integer::sum);
        System.out.println("Reduccion " + total);
    }

    private int randomInt() {
        return random.nextInt(10);
    }

    public static void main(String[] args) {
        new Main();
    }

}