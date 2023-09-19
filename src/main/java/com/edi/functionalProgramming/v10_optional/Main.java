package com.edi.functionalProgramming.v10_optional;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    Random random = new Random();

    public Main() {

//        Flujo.proveer(10, this::randomInt)
////                .filtrar(valor -> NumbersUtils.esPrimo(valor))
//                .filtrar(valor -> valor >= 10)
////                .ordenar((valor1, valor2) -> valor1.compareTo(valor2))
//                .ordenar(Integer::compare)
////                .transformar(valor -> NumbersUtils.elevarAlCuadrado(valor))
//                .transformar(NumbersUtils::elevarAlCuadrado)
////                .transformar(valor -> new Description(valor))
//                .transformar(Description::new)
////                .actuar(valor -> System.out.println(valor))
//                .actuar(System.out::println)
////                .transformar(description -> description.getValue())
//                .transformar(Description::getValue)
//                .max(Comparator.naturalOrder())
//                .ifPresentOrElse(
//                        valor -> System.out.println("Máximo: " + valor.doubleValue()),
//                        () -> System.out.println("No hay un maximo porque el flujo está vacio")
//
//                );
//        ;

        //************************* Version utilizando Streams en lugar de la clase Flujo ***********************//

        int result = random.ints(10, 1, 11)
                .boxed()
                .filter(valor -> valor > 5)
                .sorted(Integer::compareTo)
                .map(NumbersUtils::elevarAlCuadrado)
                .map(Description::new)
                .peek(System.out::println)
                .map(Description::getValue)
//                .mapToInt(Integer::intValue)  //Primero se convierte el stream de Integer a Stream de int, es decir a enteros primitivos
//                .sum();
        //tambien se puede hacer la redsucción de suma de la siguiente manera:
                .reduce(0, Integer::sum);

        // Otra forma de terminar el Stream es utilizar una operación terminal como forEach

        System.out.println(result);
    }




    private int randomInt() {
        return random.nextInt(10);
    }

    public static void main(String[] args) {
        new Main();
    }

}