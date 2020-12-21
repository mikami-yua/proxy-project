package service;

/**
 * 表示厂家商家都要完成的功能的
 */
public interface UsbShell {

    /**
     *卖U盘
     * @param amount 一次购买的数量
     * @return 一个U盘的价格
     */
    float sell(int amount);
}
