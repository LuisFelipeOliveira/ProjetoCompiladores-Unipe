
package com.br.unipe.projetominic.gerador;

import java.io.IOException;

import java_cup.internal_error;

/**
 * 
 * @author Hilario Tomaz Alves de Oliveira
 *
 */

public class GeradorClassesJavaCup {

  public static void main(String[] args) throws internal_error, IOException, Exception {
  
	String[] argumentos = new String[] { "especificacoes/MiniC.cup" };
	
    java_cup.Main.main( argumentos );
	  
  }
  
}
