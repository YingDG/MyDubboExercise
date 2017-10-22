package yingdg.exercise.dubbo.demo;


import yingdg.exercise.dubbo.demo.DemoService2;

/**
 * Created by yingdg on 2017/10/21.
 */
public class DemoService2Impl implements DemoService2 {
    @Override
    public String sayHello2(String name) {
        return "Hello: " + name;
    }
}
