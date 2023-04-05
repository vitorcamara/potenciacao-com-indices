package com.vitorcamara.projetos;

public class PotenciacaoIndices {

	public static void main(String[] args) {

		double[] vetorA = new double[11];

		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = Math.pow(2, i); // o expoente é número da posição do índice do vetor

			System.out.println("2 elevado a " + i + " potência = " + vetorA[i]);
		}

	}

}
