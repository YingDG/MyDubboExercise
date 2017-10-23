package yingdg.exercise.dubbo.demo;


import org.springframework.stereotype.Service;

/**
 * Created by yingdg on 2017/10/21.
 */
// @Service("demoService")
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
