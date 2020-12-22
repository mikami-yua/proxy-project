import service.HelloService;
import service.impl.HelloServiceImpl;
import service.impl.HelloServiceImpl2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestApp {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        /*
        HelloService service=new HelloServiceImpl();
        service.sayHello("zhangsan");

         */
        //使用反射机制执行sayHello  核心Method（类中的方法）
        HelloService target=new HelloServiceImpl();
        //获取sayHello名称对于Method类对象
        Method method = HelloService.class.getMethod("sayHello", String.class);
        //通过method可以执行sayHello方法的调用

        /*
        invoke表示执行方法的调用，
        参数1：object表示对象，要执行这个对象的方法
        参数2：object args方法执行时的参数值
        返回值：表示方法执行后的返回值
         */
        Object ret = method.invoke(target,"zhangsan");//method.invoke(target,"zhangsan") 执行target对象的sayHello 参数是zhangsan

        HelloService s2=new HelloServiceImpl2();
        Method method2 = HelloService.class.getMethod("sayHello", String.class);
        Object ret2 = method2.invoke(s2,"zhangsan");//method.invoke(target,"zhangsan") 执行target对象的sayHello 参数是zhangsan

    }
}
