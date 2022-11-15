/**
 * vamos a crear una Interfaz,
 * llamada calculosFormas que tendrá, los dos métodos para calcular el área, el
 * perímetro y el valor de PI como constante.
 */
package g9ej4;

/**
 *
 * @author Carlitos
 */
public interface CalculoForma {
    public static double PI = Math.PI;
    public abstract double calcularPerimetro();
    public abstract double calcularArea();   
}
