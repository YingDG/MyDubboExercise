package yingdg.exercise.dubbo.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yingdg on 2017/10/21.
 */
public class Provider {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"classpath:spring-dubbo-provider.xml"});
        context.start();

        System.in.read(); // press any key to exit
    }
}
