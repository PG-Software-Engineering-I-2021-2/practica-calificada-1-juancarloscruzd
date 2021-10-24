package app;

import java.util.List;
import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class App
{
    private static Logger logger = Logger.getLogger(App.class.getName());
    public static void main( String[] args )
    {
        Oliver oliver = Oliver.getInstance();
        logger.info(oliver.health());
    }
}
