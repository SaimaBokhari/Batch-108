package day31practice;

import java.time.LocalDate;

public class Q2_MarketProductsExpDate {
    public static class Q02_MarketProductExpDate {

        String productName;
        double productPrice;
        String expirationDate;

        public Q02_MarketProductExpDate(String productName, double productPrice) {
            this.productName = productName;
            this.productPrice = productPrice;
        }

        public Q02_MarketProductExpDate(String name, double price, int monthLeft) {
            productName = name;
            productPrice = price;
            expirationDate = LocalDate.now().plusMonths(monthLeft).toString();
        }
    }

}
