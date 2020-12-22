package factory;

import service.UsbShell;

//目标类
public class UsbKingFactory implements UsbShell {

    /**
     * 目标方法
     * @param amount
     * @return
     */
    @Override
    public float sell(int amount) {
        System.out.println("目标类中执行了sell目标方法");
        return 85f;
    }

    @Override
    public void print() {

    }
}
