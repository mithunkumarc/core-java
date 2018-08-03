package info;



//import com.foo.Bar;
 
// Import log4j classes.
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
 
public class Test {
 
    // Define a static logger variable so that it references the
    // Logger instance named "MyApp".
    private static final Logger logger = LogManager.getLogger(Test.class);
 
    public static void main(final String... args) {
 
        // Set up a simple configuration that logs on the console.
 
        logger.trace("Entering application.");
        Video video = new Video();
        video.startPlaying();
        video.stopPlaying();
        logger.trace("Exiting application.");
        
        
    }
}