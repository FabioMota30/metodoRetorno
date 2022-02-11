package com.fabio.universidadeXti;

public class MatematicaTeste {

	public static void main(String[] args) {
		
		Matematica m = new Matematica();
		int maior = m.maior(10,20);
		
		System.out.println(maior);
		
		//double so = m.soma(10, 20);
		//System.out.println(so);
		
		double so = m.soma(m.maior(2, 4), m.maior(3, 5));
        System.out.println(so);
	}

}
