/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.modelos;

import es.albarregas.exceptions.ExcepcionDividirPorCero;

/**
 * Clase Divisor.
 * @author FranciscoAntonio
 */
public class Divisor{
	public int cociente (int numerador, int denominador)throws ExcepcionDividirPorCero {
		int valor=0;
		try{
			valor =numerador/denominador;
		}
		catch(ExcepcionDividirPorCero  e){
                    System.out.println( "Cero es un denominador inválido" );
		}
		return valor; //retorna el valor de la división.
		
	}
}
