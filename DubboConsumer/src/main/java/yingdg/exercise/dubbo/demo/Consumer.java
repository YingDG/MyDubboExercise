package yingdg.exercise.dubbo.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yingdg on 2017/10/21.
 */
public class Consumer {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"classpath:spring-dubbo-consumer.xml"});
        context.start();

        DemoService demoService = (DemoService) context.getBean("demoService"); // obtain proxy object for remote invocation
        String hello = demoService.sayHello("world"); // execute remote invocation
        System.out.println(hello); // show the result

        DemoService2 demoService2= (DemoService2) context.getBean("demoService2");
        String hello2 = demoService2.sayHello2("dubbo");
        System.out.println(hello2);
    }
}
