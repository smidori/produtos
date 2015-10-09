package br.com.caelum.maven;

import static org.junit.Assert.*;
import org.junit.Test;

public class ProdutoTest {

	@Test
	public void teste() {
		Produto p = new Produto("bala", 0.25);
		assertEquals("bala", p.getNome());
		assertEquals(0.25, p.getPreco(), 0.00);
	}
}
