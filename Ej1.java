import java.util.Scanner;

public class Class1{
	public static void main(String[]ar){
	
	Scanner teclado=new Scanner(System.in);
	int cantidad;
	float precio;
	float importe;
	Sytem.out.println("ingrese la cantidad de articulos que quiere llevar:");
	cantidad=teclado.nextint();
	System.out.println("ingrese el valor unitario del producto:");
	precio=teclado.nextfloat();
	importe=precio*cantidad;
	System.out.println("El importe a pagar es:");
	System.out.println(importe);
	}
}