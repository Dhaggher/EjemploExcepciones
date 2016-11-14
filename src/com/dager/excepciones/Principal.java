package com.dager.excepciones;

public class Principal {
	public static void main(String [] args){
		int [] numeros = {5,2,8};
		
		try{
			for(int i= 0; i < numeros.length; i++ ){
				System.out.println("indice " + i + " = " + numeros[i]);
			}
		}catch(ArrayIndexOutOfBoundsException arrayError){
			System.out.println("Error, no se puede acceder a esa localidad");
		}catch( Exception e){	// Esta es la excepcion general, esta captura cualquier excepción 
			System.out.println("Ocurrió este error:");
			e.printStackTrace();
		} finally {
			System.out.println("Final del arreglo");
		}
	}
}
