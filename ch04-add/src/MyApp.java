import handler.MyInvocationHandler;
import service.GongNeng;
import service.HelloService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 需要num*2 无权修改gongneng.java  使用代理做   调用handler就能达到目的
 */
public class MyApp {
    public static void main(String[] args) {
        GongNeng gn=new GongNeng();
        //int num=gn.print("xiaoshou");
        InvocationHandler handler=new MyInvocationHandler(gn);

        //创建代理
        HelloService proxy= (HelloService) Proxy.newProxyInstance(gn.getClass().getClassLoader(),
                gn.getClass().getInterfaces(),
                handler);
        int num=proxy.print("shichang");
        System.out.println(num);


    }
}
