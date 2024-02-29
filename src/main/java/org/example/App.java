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
        if(i%3 == 0)
        {
            return "FIZZ";
        }
        else
        {
            return String.valueOf(i);
        }
    }
}
