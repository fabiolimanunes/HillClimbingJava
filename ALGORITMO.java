/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmo;

import java.util.Scanner;

/**
 *
 * @author fabio.nunes
 */
public class ALGORITMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        int n, i, j;
        Scanner sc = new Scanner (System.in);
		System.out.println ("Insira o número de nós no gráfico");
		n = sc.nextInt ();
                
                int [] [] graph = new int [n] [n];
                
                for(i=0;i<n;i++)
			for(j=0;j<n;j++)
				graph[i][j]=0;
						
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				//System.out.println("Is "+i+" is connected to "+ j);
                                System.out.println( i + " Está conectado a " + j);
				graph[i][j]=sc.nextInt();
			}
		}
		System.out.println("A matriz adjacente é:");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{		System.out.print(graph[i][j]+ "\t");
			}
			System.out.println();
		}
		
		}
    
}

