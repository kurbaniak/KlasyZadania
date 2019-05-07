package Task3Rabat;

public class Article {
    private String name;
    private float price;
    private float margin;
    private float[] discount = {0f, 0.1f, 0.15f, 0.25f};

    public Article() {
    }

    public Article(String name, float price, float margin) {
        this.name = name;
        this.price = price;
        this.margin = margin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getMargin() {
        return margin;
    }

    public void setMargin(float margin) {
        this.margin = margin;
    }

    public float[] getDiscount() {
        return discount;
    }

    public void setDiscount(float[] discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Article{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", margin=" + margin +
                '}';
    }
}
