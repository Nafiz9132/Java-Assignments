/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FirstAssignment;

/**
 *
 * @author hp
 */
public class Recursion {

    static int fibonacchi(int number)
    {
        if (number == 1) {
                return 0;
            } else if (number == 2) {
                return 1;
            } else {
                return fibonacchi(number - 1) + fibonacchi(number - 2);
            }
        }
    
    public static void main(String[] args) {
            
        int n = 10;
        for ( int i = 1; i <= n; i++ )
        {
            System.out.println(fibonacchi(i));
        }
    }
}
