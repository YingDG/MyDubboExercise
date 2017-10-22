package yingdg.exercise.dubbo.demo;


import yingdg.exercise.dubbo.demo.DemoService;

/**
 * Created by yingdg on 2017/10/21.
 */
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
