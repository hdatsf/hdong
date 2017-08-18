package com.hdong.upms.rpc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 服务启动类
 * Created by hdong on 2017/2/3.
 */
public class HdongUpmsRpcServiceApplication {

	private static Logger _log = LoggerFactory.getLogger(HdongUpmsRpcServiceApplication.class);

	public static void main(String[] args) {
		_log.info(">>>>> hdong-upms-rpc-service 正在启动 <<<<<");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/spring/*.xml");
		context.registerShutdownHook();
		_log.info(">>>>> hdong-upms-rpc-service 启动完成 <<<<<");
	}

}
