package my.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import my.test.config.AppConfig;
import my.test.entities.ISentence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Starting Spring Context..." );
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ISentence sentence = context.getBean("sentence", ISentence.class);
        sentence.setText("panaya rulez");
        sentence.countWords();
        
    }
}
