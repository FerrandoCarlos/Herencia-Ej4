/**
 * 4. Se plantea desarrollar un programa que nos permita calcular el área y el perímetro
 * de formas geométricas, en este caso un circulo y un rectángulo. Ya que este
 * calculo se va a repetir en las dos formas geométricas, 
 * Desarrollar el ejercicio para que las formas implementen los métodos de la
 * interfaz y se calcule el área y el perímetro de los dos. En el main se crearán las
 * formas y se mostrará el resultado final.
 * Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
 * Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2
 */
package g9ej4;

import java.util.Scanner;

/**
 * @author Carlos Ferrando
 */
public class Principal {

    public static void main(String[] args) {
        //TODO: crear objetos y pasar parametros
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        Circulo c = new Circulo();
        Rectangulo r = new Rectangulo();
        
        System.out.println("Ingresaremos los datos del la forma geométrica: ");
    }

}
