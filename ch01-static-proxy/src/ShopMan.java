import shangjai.TaoBao;

public class ShopMan {
    public static void main(String[] args) {
        //创建代理商家
        TaoBao taoBao=new TaoBao();
        float price=taoBao.sell(1);
        System.out.println("淘宝商家的价格"+price);
    }
}
