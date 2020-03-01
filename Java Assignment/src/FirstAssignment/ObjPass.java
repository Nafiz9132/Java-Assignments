/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FirstAssignment;

/**
 *
 * @author Nafizur Rahman Sizan
 */
public class ObjPass {
    int a,b,c;
    
    ObjPass ( int a, int b, int c ) {
        this.a = a;
        this.b = b;
        this.c = c;
        System.out.println(a + " " + b + " " + c);
    }
    
    void compare ( ObjPass obj ) {
        System.out.print(this.a + " = " + obj.a + " :: ");
        if ( this.a == obj.a )
         System.out.println("True");
        else
         System.out.println("False");
        System.out.print(this.b + " = " + obj.b + " :: ");
        if ( this.b == obj.b )
         System.out.println("True");
        else
         System.out.println("False");
        System.out.print(this.c + " = " + obj.c + " :: ");
        if ( this.c == obj.c )
         System.out.println("True");
        else
         System.out.println("False");
    }
    
}
