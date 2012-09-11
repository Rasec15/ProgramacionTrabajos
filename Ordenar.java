/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

          public class Ordenar {
    

         public static void main(String[] args) throws IOException  {
		
                    int numElementos=0;
		
                    int u, h = 0, aux;
		
                    int val[]= new int [20];
                    String dato2[]= new String [20];
                    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                    System.out.println ("¿Cuantos Numeros desea ordenar?");
                    String dato = br.readLine();
                    numElementos= Integer.parseInt(dato);


		for (u=0; u<numElementos; u++) {
			int a= u+1;
			System.out.println ("Ingrese el valor" +a+ ":");
			dato2 [u]= br.readLine();
			val[u]= Integer.parseInt(dato2[u]);
		}


		for (u=0; u<numElementos;u++) {
			for (h=u+1; h < numElementos; h++){
				if (val[h] < val[u]) {
					aux=val[u];
					val[u]= val[h];
					val[h]= aux;



					}
				}	
			}

		System.out.println();
		System.out.println("Los Numeros ordenados de menor a mayor son:");
		for (u=0; u < numElementos; u++);
		 for(int x=0; x<h;x++)

	            System.out.print(val[x] + "  ");



	}


}	


  


    
    
    


    
   








    
    
 
  

    
    






    


    

