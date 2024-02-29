package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        for(int i = 1; i<=100; i++)
        {
            System.out.println(fizzBuzz(i));
        }
    }

    public static String fizzBuzz(int i){
        return String.valueOf(i);
    }
}
