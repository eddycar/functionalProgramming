package com.edi.functionalProgramming.v10_optional;

import java.util.Comparator;
import java.util.Random;

public class Main {

    Random random = new Random();

    public Main() {
        Integer maximo = Flujo.proveer(10, this::randomInt)
//                .filtrar(valor -> NumbersUtils.esPrimo(valor))
                .filtrar( valor -> valor >= 10)
//                .ordenar((valor1, valor2) -> valor1.compareTo(valor2))
                .ordenar(Integer::compare)
//                .transformar(valor -> NumbersUtils.elevarAlCuadrado(valor))
                .transformar(NumbersUtils::elevarAlCuadrado)
//                .transformar(valor -> new Description(valor))
                .transformar(Description::new)
//                .actuar(valor -> System.out.println(valor))
                .actuar(System.out::println)
//                .transformar(description -> description.getValue())
                .transformar(Description::getValue)
                .max(Comparator.naturalOrder());
//                .reducir(0, (valor1, valor2) -> Integer.sum(valor1, valor2));
        //               .reducir(0, Integer::sum);
        System.out.println("Maximo " + maximo);
    }

    private int randomInt() {
        return random.nextInt(10);
    }

    public static void main(String[] args) {
        new Main();
    }

}