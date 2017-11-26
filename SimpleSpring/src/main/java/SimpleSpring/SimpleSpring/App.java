package SimpleSpring.SimpleSpring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Spring!" );
        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("spring-context.xml"));
        HelloWorld world = (HelloWorld)factory.getBean("helloBean");
        
        System.out.println("Welcome to the Spring : " + world.getName());
    }
}
