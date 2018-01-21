package yingdg.exercise.dubbo.demo;

import com.alibaba.dubbo.config.annotation.Reference;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by yingdg on 2018/1/21.
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "classpath:spring-dubbo-consumer.xml")
public class DubboConsumer2Test {
    @Reference
    private DemoService demoService;
    @Reference(interfaceName = "yingdg.exercise.dubbo.demo.DemoService2")
    private DemoService2 demoService2;

    @Test
    public void dubboAnnotationTest() {
        String sayHello = demoService.sayHello("yingdg");
        System.out.println(sayHello);

        String sayHello2 = demoService2.sayHello2("ying");
        System.out.println(sayHello2);
    }

}
