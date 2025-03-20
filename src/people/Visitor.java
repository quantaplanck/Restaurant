package people;

import java.text.NumberFormat;
import java.util.Locale;

public class Visitor {

    private String name;
    private int total_price;

    public Visitor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotal_price() {
        return total_price;
    }

    public void setTotal_price(int total_price) {
        this.total_price = total_price;
    }

    public void addTotal_Price(double price) {
        total_price += price;
    }

    public void showTotalPrice() {
        System.out.println(name + " paid for " + formatRupiah(total_price));
        System.out.println();
    }

    public String formatRupiah(double price) {
        Locale localeID = new Locale("in", "ID");
        NumberFormat formatRp = NumberFormat.getCurrencyInstance(localeID);
        return formatRp.format(price);
    }
}
