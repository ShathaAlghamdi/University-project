/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fixedpoint_5cz;
import java.util.Scanner;
/**
 *
 * @author RAHAF
 */
public class FixedPoint_5CZ 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       
        Scanner input = new Scanner(System.in);
        double p, p0, tol;
        int i=1;
        int N;

        System.out.println("Enter approximate p: ");
        p0 = input.nextDouble();

        System.out.println("Desired Tolerance: ");
        tol = input.nextDouble();

        System.out.println("Maximum Iterations: ");
        N = input.nextInt();

        while (i<=N){
            p = g(p0);

            if(Math.abs(p-p0) < tol)
                break;

            System.out.printf("Iteration %d: Current value %f\n", i, p);

            i++;
            p0 = p;

            if(i>N)
                System.out.printf("Method failed after %d iterations\n", N);
        }
    }
    static double g(double x){
        return Math.pow(3*x*x+3, .25);
    }
//    static double f(double x){
//        return x*x*x*x-3*x*x-3;
//    }
}
        
        
        

