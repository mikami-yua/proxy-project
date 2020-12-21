package factory;

import service.UsbShell;

/**
 * 目标类：金士顿厂家，不接受单独购买
 */
public class UsbKingFactory implements UsbShell {

    /**
     * 一个U盘85 后期可以根据amount实现不同的价格  1w-》80 5w-->75
     * @param amount 一次购买的数量
     * @return 单个U盘的价格
     */
    @Override
    public float sell(int amount) {
        return 85.0f;
    }
}
