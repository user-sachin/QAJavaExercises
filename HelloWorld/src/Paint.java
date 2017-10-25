public class Paint {

    String name;
    int volume;
    double price;
    int coverSizeM2;

    public Paint(String name, int volume, double price, int coverSizeM2) {
        this.name = name;
        this.volume = volume;
        this.price = price;
        this.coverSizeM2 = coverSizeM2;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getCoverSize() {
        return coverSizeM2;
    }

    public int getVolume() {
        return volume;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCoverSize(int coverSizeM2) {
        this.coverSizeM2 = coverSizeM2;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}

