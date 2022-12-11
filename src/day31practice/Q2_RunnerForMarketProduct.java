package day31practice;

public class Q2_RunnerForMarketProduct {
    public static void main(String[] args) {

            Q2_MarketProductsExpDate.Q02_MarketProductExpDate obj1=new Q2_MarketProductsExpDate.Q02_MarketProductExpDate("Cheese", 10.29, 10);

            System.out.println(obj1.productName+ " " + obj1.productPrice + "$ " + obj1.expirationDate);

            Q2_MarketProductsExpDate.Q02_MarketProductExpDate obj2= new Q2_MarketProductsExpDate.Q02_MarketProductExpDate("Milk", 4.99);
            System.out.println(obj2.productName+ " "+ obj2.productPrice+ "$");

            Q2_MarketProductsExpDate.Q02_MarketProductExpDate obj3= new Q2_MarketProductsExpDate.Q02_MarketProductExpDate("Salt", 3.5);

            System.out.println(obj3.productName+ " "+ obj3.productPrice+ "$");



    }
}
