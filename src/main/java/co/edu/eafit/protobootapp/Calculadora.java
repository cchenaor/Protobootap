package co.edu.eafit.protobootapp;

//This is a simple calculator class
public class Calculadora {

    public Double cuadrado(Double numero) {
        return numero * numero;
        
    }
    
    public Double cubo(Double numero) {
        return numero * numero * numero;
    }
    // Método main para pruebas
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println("Prueba de CI: El cuadrado de 3 es " + calc.cuadrado(3.0));
        System.out.println("Prueba de CI: El  3 es " + calc.cubo(3.0));
    }
}
