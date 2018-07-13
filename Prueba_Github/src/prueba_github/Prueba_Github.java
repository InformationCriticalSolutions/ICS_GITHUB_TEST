package prueba_github;

public class Prueba_Github {

    public void main(String[] args) {
        System.out.println("Este es el comienzo de la prueba");
        System.out.println("El resultado de la resta de 2 - 2 es: " + Restar(2,2));
        System.out.println("La suma de 2 + 2 es: " + Sumar(2,2));
        System.out.println("La multiplicación de 2 * 2 es: " + Multiplicar(2,2));
    }
    
    public int Sumar(int _numero1, int _numero2)
    {
        return(_numero1 + _numero2);
    }
    
    public int Restar(int _numero1, int _numero2)
    {
        return(_numero1 - _numero2);
    }
    
    public int Multiplicar(int _numero1, int _numero2)
    {
        return(_numero1 * _numero2);
    }
}
