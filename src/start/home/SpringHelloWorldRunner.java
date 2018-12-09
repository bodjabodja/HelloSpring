package start.home;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloWorldRunner {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("resources/springHello.xml");
        PerformanceAuditory performanceAuditory = (PerformanceAuditory) context.getBean("performanceAuditory");
        performanceAuditory.getHelloMessage();
        //((ClassPathXmlApplicationContext) context).close();

        Actioner actioner1 = (Actioner) context.getBean("actioner1");
        actioner1.perform();

        Actioner actioner2 = (Actioner) context.getBean("actioner2");
        actioner2.perform();

        Actioner actioner30 = (Actioner) context.getBean("actioner3");
        actioner30.perform();

        Actioner actioner40 = (Actioner) context.getBean("actioner4");
        actioner40.perform();

        MultyActioner actioner3 = (MultyActioner) context.getBean("multyAct1");
        actioner3.perform();

        MultyActioner actioner4 = (MultyActioner) context.getBean("multyAct2");
        actioner4.perform();


        ((ClassPathXmlApplicationContext) context).close();
    }
}
