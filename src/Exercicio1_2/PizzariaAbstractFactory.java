package Exercicio1_2;

import Exercicio1_2.Produto;

public interface PizzariaAbstractFactory {
	Produto getTypeInstance(String dayOfWeek);
}
