public class Flower {
    private final String flowerName;
    private String country;
    private final double cost;
    private int lifeSpan;

    public Flower(String flowerName, String country, double cost, int lifeSpan) {
        if (flowerName == null || flowerName.isEmpty()) {
            this.flowerName = "Тип цветка не указан";
        } else {
            this.flowerName = flowerName;
        }

        if (country == null || country.isEmpty()) {
            this.country = "Россия";
        } else {
            this.country = country;
        }

        if (cost <= 0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }

        if (lifeSpan <= 0 ) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }

    }

    public Flower(String flowerName, String country, double cost) {
        this.flowerName = flowerName;
        this.country = country;
        this.cost = cost;
        this.lifeSpan = 3;
    }

    public String getFlowerName() {
        return flowerName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getCost() {
        return cost;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan;
    }

    @Override
    public String toString() {
        return flowerName + " из " + country + ", стоимость штуки — " + cost + ", срок стояния — " + lifeSpan + " дней";
    }
}
