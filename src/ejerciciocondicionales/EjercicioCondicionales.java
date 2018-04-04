package ejerciciocondicionales;

import javax.swing.JOptionPane;

public class EjercicioCondicionales {

    public static void main(String[] args) {
        EjercicioCondicionales obj;
        obj = new EjercicioCondicionales();
        
        obj.positivoNegativo();
    }
    
    public void positivoNegativo(){
        
        int b;
        b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero para saber si es positivo o no."));
        System.out.println((b<0) ? "El numero es negativo" : "El numero es positivo.");
    }
    
    public void parImpar(){
       
       int a;
       a = 3;
       System.out.println((a%2 == 0) ? "El numero es par." : "El numero es impar.");
       
       if(a%2 == 0){
           System.out.println("El numero es par.");
       }else{
           System.out.println("El numero es impar.");
       }
    }
    
    public void ejercicio1(){
        
        int y;
        int x;
        double n;
        double m;
        y = 3;
        x = 4;
        n = 3.5;
        m = 2.2;
        double suma;
        double resta;
        double multiplicacion;
        double division;
        suma = y + x + n + m;
        resta = y - x - n - m;
        multiplicacion = y * x * n *m;
        division = y / x / n / m;
        
        
        
    }
    
}
