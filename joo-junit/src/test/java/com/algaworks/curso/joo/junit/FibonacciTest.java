package com.algaworks.curso.joo.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class FibonacciTest {
	
	private static Fibonacci fibonacci;
	
	@BeforeAll
	public static void init() {
		fibonacci = new Fibonacci();
	}

	@Test
	public void deve_retornar_1_em_fibonacci_posicao_1() {
		// 1. Cenário
		long posicao = 1L;
				
		// 2. Ação
		long valor = fibonacci.calcular(posicao);
		
		// 3. Validação
		assertEquals(1l, valor);
	}
	
	@Test
	public void deve_retornar_1_em_fibonacci_posicao_2() {
		long posicao = 2L;
		
		long valor = fibonacci.calcular(posicao);
		
		assertEquals(1l, valor);
	}
	
	@Test
	public void deve_retornar_2_em_fibonacci_posicao_3() {
		long posicao = 3L;
		
		long valor = fibonacci.calcular(posicao);
		
		assertEquals(2l, valor);
	}
	
	@Test
	public void deve_retornar_3_em_fibonacci_posicao_4() {
		long posicao = 4L;
		
		long valor = fibonacci.calcular(posicao);
		
		assertEquals(3l, valor);
	}
	
	@Test
	public void deve_retornar_0_em_fibonacci_posicao_0() {
		long posicao = 0L;
		
		long valor = fibonacci.calcular(posicao);
		
		assertEquals(0l, valor);
	}
	
}
