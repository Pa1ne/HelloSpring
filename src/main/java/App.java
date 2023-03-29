import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld helloWorldBeanOne = applicationContext.getBean("helloWorld", HelloWorld.class);
        HelloWorld helloWorldBeanTwo = applicationContext.getBean("helloWorld", HelloWorld.class);
        Cat catBeanOne = applicationContext.getBean("cat", Cat.class);
        Cat catBeanTwo = applicationContext.getBean("cat", Cat.class);

        System.out.println(helloWorldBeanOne == helloWorldBeanTwo);
        System.out.println(catBeanOne == catBeanTwo);
    }
}