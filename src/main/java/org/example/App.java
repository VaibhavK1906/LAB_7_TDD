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
            if(i%5 ==0){
                return "FIZZBUZZ";
            }
            return "FIZZ";
        }
        else if (i%5 == 0)
        {
            return "BUZZ";
        }
        else
        {
            return String.valueOf(i);
        }
    }
}
