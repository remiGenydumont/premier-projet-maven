package dev;

import com.github.lalyos.jfiglet.FigletFont;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println(FigletFont.convertOneLine("APP"));
    	String name = "Rémi";
        System.out.println( "Hello "+name+"!");
    }
}
