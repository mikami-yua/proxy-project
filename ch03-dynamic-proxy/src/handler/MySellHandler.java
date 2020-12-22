package handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

//必须实现InvocationHandler接口，完成代理类做的功能 1.调用目标方法 2.功能增强
public class MySellHandler implements InvocationHandler {
    private  Object target=null;

    /**
     * 动态代理，目标是活动的，不是固定的，需要传入进来
     * 传入谁就给谁创建代理
     * @param target 目标对象
     */
    public MySellHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object res=null;

        //向厂家发送订单，告诉厂家发货
        //float price=factory.sell(amount);//厂家的价格
        //动态代理执行目标方法
        res=method.invoke(target,args);//参数是args 对象是动态的需要传入

        //商家加价
        //price+=25;//增强功能
        if(res!=null){
            Float price=(Float)res;
            price+=25;
            res=price;
        }

        return res;
    }
}
