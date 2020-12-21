package shangjai;

import factory.UsbKingFactory;
import service.UsbShell;

/**
 * TaoBao是一个商家,代理金士顿U盘的销售
 */
public class TaoBao implements UsbShell {

    //声明商家具体代理的厂家是谁
    private UsbShell factory=new UsbKingFactory();


    /**
     * 实现销售的功能
     * @param amount 一次购买的数量
     * @return
     */
    @Override
    public float sell(int amount) {

        //向厂家发送订单，告诉厂家发货
        float price=factory.sell(amount);//厂家的价格
        //商家加价
        price+=25;//增强功能
        //在目标方法调用后，做的其他功能都是增强功能
        System.out.println("taobao反券");
        return price;
    }
}
