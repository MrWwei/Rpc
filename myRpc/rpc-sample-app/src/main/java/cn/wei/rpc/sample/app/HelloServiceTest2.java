package cn.wei.rpc.sample.app;

import cn.wei.rpc.client.RpcProxy;
import cn.wei.rpc.simple.client.HelloService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class HelloServiceTest2 {
    @Autowired
    private RpcProxy rpcProxy;
    @Test
    public void tests() {
        HelloService helloService = rpcProxy.create(HelloService.class);

        // 调用代理的方法，执行invoke
        String result = helloService.hello("World");
        System.out.println("服务端返回结果：");
        System.out.println(result);

    }
}
