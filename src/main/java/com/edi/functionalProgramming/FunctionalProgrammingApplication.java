package com.edi.functionalProgramming;

import com.edi.functionalProgramming.v3_InlineClases.v2_funcional.clases.AlCuadrado;
import com.edi.functionalProgramming.v3_InlineClases.v2_funcional.clases.Impresor;
import com.edi.functionalProgramming.v3_InlineClases.v2_funcional.clases.Multiplicador;
import com.edi.functionalProgramming.v3_InlineClases.v2_funcional.clases.SoloPares;
import com.edi.functionalProgramming.v3_InlineClases.v2_funcional.interfaces.Proveedor;
import com.edi.functionalProgramming.v1_imperactiva.FuncionesImperativas;
import com.edi.functionalProgramming.v3_InlineClases.v2_funcional.Funcional;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class FunctionalProgrammingApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FunctionalProgrammingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		FuncionesImperativas funcionesImperativas = new FuncionesImperativas();

		// QUE QUEREMOS HACER?
		// 1. - Crear una lista de enteros
		List<Integer> numeros = Funcional.proveer(10, new Proveedor() {
			@Override
			public Integer obtener() {
				return null;
			}
		});
		System.out.println("Numeros " + numeros);
		// 2. - Obtener pares de una lista
		List<Integer> filtrados = Funcional.filtrar(numeros, new SoloPares());
		System.out.println("Filtrados " + filtrados);

		// 3. - Obtener cuadrado de los pares
		List<Integer> transformados = Funcional.transformar(filtrados, new AlCuadrado());
		System.out.println("Transformación " + transformados);

		// 4. - Mostrar cada cuadrado por pantalla
		Funcional.consumir(transformados, new Impresor());

		// 5. - Obtener la suma de los cuadrados
		Integer total  = Funcional.reducir(transformados, 1, new Multiplicador());
		System.out.println("total:  " + total);

	}
}
