package com.edi.functionalProgramming.v6_lambdas.interfaces;

@FunctionalInterface
public interface Consumidor<T>  {
    void aceptar(T valor);
}
