package com.edi.functionalProgramming.v8_method_reference;

import java.util.Random;

public class Main {

    Random random = new Random();

    public Main() {
        Integer total = Flujo.proveer(10, () -> randomInt())
                .filtrar(valor -> NumbersUtils.esPrimo(valor))
                .transformar(valor -> NumbersUtils.elevarAlCuadrado(valor))
                .actuar(valor -> System.out.println(valor))
                .reducir(0, (valor1, valor2) -> Integer.sum(valor1, valor2));
        System.out.println("Reduccion " + total);
    }

    private int randomInt() {
        return random.nextInt(10);
    }

    public static void main(String[] args) {
        new Main();
    }

}