package com.java.designpattern.proxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * CGLib Study
 * 
 * @author taomk 2017年3月5日 下午10:38:34
 *
 */
public class CGLibStudy implements MethodInterceptor {

	private Enhancer enhancer = new Enhancer();  
    
	public static void main(String[] args) {
		CGLibStudy cglib = new CGLibStudy();
		ForumServiceImpl forumServiceImpl = (ForumServiceImpl) cglib.getProxy(ForumServiceImpl.class);
		
		forumServiceImpl.removeTopic("123456");
		forumServiceImpl.removeForum("abcdef");
	}

	public Object getProxy(Class<?> clazz){
		// 设置需要创建子类的类
		enhancer.setSuperclass(clazz);
		enhancer.setCallback(this);
		// 通过字节码技术动态创建子类
		return enhancer.create();
	}
	
	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {

		PerformanceMonitor.begin(obj.getClass().getName() + "." + method.getName());
		Object result = proxy.invokeSuper(obj, args);
		PerformanceMonitor.end();
		return result;
	}

}

///**
// * 业务类接口定义
// * 
// * @author taomk 2017年3月5日 下午9:35:29
// *
// */
//interface ForumService {
//	void removeTopic(String topicId);
//
//	void removeForum(String forumId);
//}

/**
 * 业务类接口实现
 * 
 * @author taomk 2017年3月5日 下午9:36:15
 *
 */
//class ForumServiceImpl implements ForumService {
class ForumServiceImpl {

//	@Override
	public void removeTopic(String topicId) {

		System.out.println("业务方法，模拟删除Topic记录：" + topicId);

		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

//	@Override
	public void removeForum(String forumId) {

		System.out.println("业务方法，模拟删除Forum记录：" + forumId);

		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}

/**
 * 性能计算工具类
 * 
 * @author taomk 2017年3月5日 下午9:44:51
 *
 */
class MethodPerformance {

	private long startTime;
	private long endTime;
	private String serviceName;

	MethodPerformance(String serviceName) {
		this.serviceName = serviceName;
		this.startTime = System.currentTimeMillis();
	}

	public void printPerformance() {
		this.endTime = System.currentTimeMillis();
		long elapse = endTime - startTime;
		System.out.println("[" + serviceName + "]，花费时间（ms）：" + elapse);
	}
}

/**
 * 性能监控器
 * 
 * @author taomk 2017年3月5日 下午10:43:01
 *
 */
class PerformanceMonitor {
	// ①通过一个ThreadLocal保存调用线程相关的性能监视信息
	private static ThreadLocal<MethodPerformance> performanceRecord = new ThreadLocal<MethodPerformance>();

	// ②启动对某一目标方法的性能监视
	public static void begin(String method) {
		System.out.println("Start monitor...");
		MethodPerformance mp = new MethodPerformance(method);
		performanceRecord.set(mp);
	}

	// ③打印出方法性能监视的结果信息。
	public static void end() {
		System.out.println("End monitor...");
		MethodPerformance mp = performanceRecord.get();
		mp.printPerformance();
	}

}