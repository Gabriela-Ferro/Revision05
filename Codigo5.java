
import java.util.Scanner;
/* Al introducir un numero en el codigo, este por medio de while revisa si cumple
com la condicion de ser > a 0, si lo es entonces la variable digito obtiene el ultimo digito del numero ingresado, 
si cumple con las condiciones establecidas como ser = a 3, 7, 8 y 9 la variable numeroAfortunado aumentara en 1 de no ser asi
sera Noafortunado el que aumente su contador.
La parte del codigo numeroIngresado /= 10; quita un digito en cada iteracion.
Al final el contador mayor es quien decidira si es afortundo o no
**/
public class Codigo5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduzca un número: ");
		int numeroIngresado = scanner.nextInt();
          // cambie el nombre de variables como s a scanner, ni a numeroIngresado
          //asigne el ingreso a numero ingresado y  cambien nextLn por nextInt al ser un entero
          // elimine la variable c porque noentendi su funcion en el codigo

		int numeroAfortunado = 0;
		int numeroNoAfortunado = 0;
                              // cambie afo y noafo por los nombres de las variables
		while (numeroIngresado > 0) {
			int digito = numeroIngresado % 10; // corregi la forma en que se declaraba esta variable
			if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
				numeroAfortunado++;
			} else {
				numeroNoAfortunado++;
			}
                              numeroIngresado /= 10; // cambie el ni
		}

		if (numeroAfortunado > numeroNoAfortunado) {
			System.out.println("El número es afortunado."); // quite la concatenacion que se hacia
                              //por que el numero ingresado no queda como el usuario lo ingreso al inicio.
		} else {
			System.out.println("El número no es afortunado.");
		}

                    scanner.close();  // cerre scanner
          }
         
          }