package jar;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        if (args != null) {
            if (args[0] instanceof String) {
                System.out.println( args[0] );
            }
        }
        
        System.out.println( "No args!" );
    }
}
