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
    public static Scanner input = new Scanner(System.in).useDelimiter("\n");
    
    public static void main(String[] args) {
        //TODO: crear objetos y pasar parametros
        
        Circulo c = new Circulo();
        Rectangulo r = new Rectangulo();
        
        System.out.println("Ingresaremos los datos del las formas geométrica: ");
        
        c.setNombreFigura("Circulo");
        System.out.printf("Ingresar el diametro del %s:",c.getNombreFigura());
        c.setDiametro(input.nextDouble());
        System.out.printf("El area del %s es %.3f\n",c.getNombreFigura(),c.calcularArea());
        System.out.printf("El perimetro del %s es %.3f\n",c.getNombreFigura(),c.calcularPerimetro());
        System.out.println("********************************************************************");
        System.out.println("********************************************************************");
        r.setNombreFigura("Rectangulo");
        System.out.printf("Ingresar el tamaño de la base del %s: ",r.getNombreFigura());
        r.setBase(input.nextDouble());
        System.out.printf("Ingresar el tamaño de la altura del %s: ",r.getNombreFigura());
        r.setAltura(input.nextDouble());
        System.out.printf("El area del %s es %.3f\n",r.getNombreFigura(),r.calcularArea());
        System.out.printf("El perimetro del %s es %.3f\n",r.getNombreFigura(),r.calcularPerimetro());
        
    }

}
