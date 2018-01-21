package yingdg.exercise.dubbo.demo;


import com.alibaba.dubbo.config.annotation.Service;

/**
 * Created by yingdg on 2017/10/21.
 */
@Service(timeout = 1000)
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
