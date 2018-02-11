/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area.y.perimetro.de.cuadrado;

import java.util.Scanner;

/**
 *
 * @author gcros
 */
public class AreaYPerimetroDeCuadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("escribe la longitud de un lado del cuadrado");
        int lon;
        Scanner sc = new Scanner(System.in);
        lon = sc.nextInt();
        int area;
        area = lon*lon;
        System.out.println("el area del cuadrado es "+area);
        int per;
        per = lon*4;
        System.out.println("el perimetro del cuadrado es "+per);
        // TODO code application logic here
    }
    
}
