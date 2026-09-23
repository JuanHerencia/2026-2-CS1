/**
 * La clase {@code Ejem} proporciona métodos para realizar cálculos matemáticos básicos.
 */
public class Ejem1 {

    /**
     * Calcula el factorial de un número entero no negativo.
     * <p>
     * El factorial de un número {@code n} (denotado como n!) es el producto de todos 
     * los enteros positivos menores o iguales a {@code n}.
     * </p>
     * 
     * @param n El número entero del cual se desea calcular el factorial.
     * @return El factorial de un número {@code n}.
     */
    public int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    /**
     * Calcula el seno de un ángulo en radianes mediante la serie de Taylor.
     * <p>
     * Utiliza la fórmula matemática: sin(x) = x - x^3/3! + x^5/5! - x^7/7! + ...
     * </p>
     * 
     * @param x El ángulo en radianes.
     * @return El valor aproximado del seno de {@code x}.
     */
    public double seno(double x) {
        double suma = 0;
        
        // El bucle se limita a 6 términos (n de 0 a 5) por seguridad.
        for (int n = 0; n < 6; n++) {
            int exponente = 2 * n + 1;
            double termino = Math.pow(x, exponente) / factorial(exponente);
            
            // Alterna los signos (+ y -) en la serie de Taylor.
            if (n % 2 == 0) {
                suma += termino;
            } else {
                suma -= termino;
            }
        }
        return suma;
    }
}
