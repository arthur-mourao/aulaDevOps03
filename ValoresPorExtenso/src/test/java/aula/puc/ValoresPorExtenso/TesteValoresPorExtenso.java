package aula.puc.ValoresPorExtenso;

import org.junit.Assert;
import org.junit.Test;

public class TesteValoresPorExtenso {
	
	ValoresPorExtenso conversor = new ValoresPorExtenso();
	
	@Test
    public void testeValorInvalido()
    {	
		String valorPorExtenso;
		valorPorExtenso = conversor.valorPorExtenso((float) 1222.45);
		Assert.assertEquals( "Valor Inválido", valorPorExtenso);
    }

	@Test
    public void testeValorDoisDigitos()
    {	
		String valorPorExtenso;
		valorPorExtenso = conversor.valorPorExtenso((float) 42.00);
		Assert.assertEquals( "Quarenta e Dois", valorPorExtenso);
    }
		
	@Test
    public void testeValorTresDigitos()
    {	
		String valorPorExtenso;
		valorPorExtenso = conversor.valorPorExtenso((float) 678.00);
		Assert.assertEquals( "Seiscentos e Setenta e Oito", valorPorExtenso);
    }	
}
