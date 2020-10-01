package task212;

public class Product implements Comparable<Product>{
    private String name;
    private int price;
    private String description;

    public Product(int price, String name, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public int compareTo(Product o) {
        int ret=0;
        if(this.price>o.price) ret=1;
        if(this.price<o.price) ret=-1;
        return ret;
    }
}
