package com.edi.functionalProgramming.v5_flujos;

import com.edi.functionalProgramming.v3_InlineClases.v2_funcional.clases.Impresor;
import com.edi.functionalProgramming.v5_flujos.interfaces.*;

import java.util.List;
import java.util.Random;

//************************************************************************************************************************//
//*********************** En esta version se crean las clases sobre la marcha por ejemplo new Proveedor() *************** //
//************************************ Aplica para Java 7 en java 8 se introducenlas funciones lambda ********************//
//************************************************************************************************************************//

public class Main {
    public static void main(String[] args) {

        // QUE QUEREMOS HACER => proveer, filtrar, transformar, actuar, reducir

        Integer total =
//                Flujo.proveer(10, new Proveedor<Integer>() {
//                    Random random = new Random();
//
//                    @Override
//                    public Integer obtener() {
//                        return random.nextInt(10);
//                    }
//                })
        new Flujo<Integer>(List.of(1, 2, 3, 4, 5, 6, 7, 8)).filtrar(new Predicado<>() {  //En lugar de utilizar el metodo proveer se puede crar directamente una lista;
                    @Override
                    public Boolean test(Integer valor) {
                        return valor % 2 == 0;
                    }
                }).transformar(new OperadorUnuario<>() {
                    @Override
                    public Integer aplicar(Integer valor) {
                        return valor * valor;
                    }
                }).actuar(new Consumidor<>() {
                    @Override
                    public void aceptar(Integer valor) {
                        System.out.println(valor);
                    }
                }).reducir(0, new OperadorBinario<>() {
                    @Override
                    public Integer aplicar(Integer valor1, Integer valor2) {
                        return valor1 + valor2;
                    }
                });
        System.out.println("Reduccion "+ total);
    }
}
