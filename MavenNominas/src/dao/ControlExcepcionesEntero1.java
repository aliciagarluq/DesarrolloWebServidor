package dao;

import java.util.InputMismatchException;
import java.util.Scanner;
public class ControlExcepcionesEntero1 {

public static int leerEntero() {
	int num=0;
	boolean aux=false;
Scanner teclado=new Scanner(System.in);
	
	
	do {
		//System.out.print("Inserta una de las opciones: ");
		try{
			
			num=teclado.nextInt();
			aux=false;
		}catch(InputMismatchException exc){
			aux=true;
			System.out.println("error");
		}finally{
		teclado.nextLine();
		}
	}while(aux);
	
	
	
	
	

	
	
	
return num;
}
	
	
	
	
	
}
