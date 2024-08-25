package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public int subtract( int a, int b ){
        return a - b;
    }

    public int add( int a, int b ){
        return a + b;
    }
    public int multiply( int a, int b ){
        return a * b;
    }

    public int divide( int a, int b ){
        if(b==0){
            throw new ArithmeticException("Divide by zero");
        }
        return a / b;

    }
}
