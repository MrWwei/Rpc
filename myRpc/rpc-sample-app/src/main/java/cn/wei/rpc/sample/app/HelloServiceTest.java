package cn.wei.rpc.sample.app;

import cn.wei.rpc.simple.client.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;


import cn.wei.rpc.client.RpcProxy;
import cn.wei.rpc.simple.client.HelloService;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring.xml")
public class HelloServiceTest {

	@Autowired
	private RpcProxy rpcProxy;

	@Test
	public void helloTest1() {


		/**
		 *Author:wei
		 *Date:2018/9/30 9:05
		 *
		*/

		HelloService helloService = rpcProxy.create(HelloService.class);

		// 调用代理的方法，执行invoke
		String result = helloService.hello("World");
		System.out.println("服务端返回结果：");
		System.out.println(result);
	}

	@Test
	public void helloTest2() {
		HelloService helloService = rpcProxy.create(HelloService.class);
		String result = helloService.hello(new Person("wei", "xie"));
		System.out.println("服务端返回结果：");
		System.out.println(result);
	}
}
