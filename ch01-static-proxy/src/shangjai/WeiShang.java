package shangjai;

import factory.UsbKingFactory;
import service.UsbShell;

public class WeiShang implements UsbShell {
    private  UsbShell factory=new UsbKingFactory();
    @Override
    public float sell(int amount) {
        float price=factory.sell(amount);
        price+=1;
        return price;
    }
}
