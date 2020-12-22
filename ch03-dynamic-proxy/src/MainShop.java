import factory.UsbKingFactory;
import handler.MySellHandler;
import service.UsbShell;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class MainShop {
    public static void main(String[] args) {
        //创建代理对像，使用Proxy
        //1.创建目标对象
        UsbShell factory=new UsbKingFactory();
        //2.创建InvocationHandler对象
        InvocationHandler handler =new MySellHandler(factory);
        //3.创建代理对象
        UsbShell proxy= (UsbShell) Proxy.newProxyInstance(factory.getClass().getClassLoader(),
                factory.getClass().getInterfaces(),
                handler);//可以强制类型转换为接口的原因factory对象实现了这个接口

        System.out.println(proxy.getClass().getName());//com.sun.proxy.$Proxy0 jdk动态代理创建的对象类型
        //4.通过代理执行方法
        float price=proxy.sell(1);
        System.out.println("动态代理的结果"+price);
    }
}
