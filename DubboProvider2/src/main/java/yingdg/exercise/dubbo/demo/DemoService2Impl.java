package yingdg.exercise.dubbo.demo;


import com.alibaba.dubbo.config.annotation.Service;

/**
 * Created by yingdg on 2017/10/21.
 */
@Service(interfaceName = "yingdg.exercise.dubbo.demo.DemoService2", timeout = 1000)
public class DemoService2Impl implements DemoService2 {
    @Override
    public String sayHello2(String name) {
        return "Hello: " + name;
    }
}
