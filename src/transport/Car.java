package transport;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private boolean signSummerTires;



    public Car(String brand, String model, double engineVolume, String color, int year,
               String country, String transmission, String bodyType,
               String registrationNumber, int numberOfSeats, int month) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = "Информация не указана";
        } else {
            this.brand = brand;
        }
        if (engineVolume >=0) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 1.6;
        }
        this.model = model;
        this.color = color;
        this.year = year;
        this.country = country;
        if (transmission == null || transmission.isBlank()) {
            this.transmission = "Нет информации";
        } else {
            this.transmission = transmission;
        }
        if (bodyType == null || bodyType.isBlank()) {
            this.bodyType = "Нет информации";
        } else {
            this.bodyType = bodyType;
        }
        this.registrationNumber = registrationNumber;
        this.numberOfSeats = numberOfSeats;
        switch (month) {
            case 12:
            case 1:
            case 2:
            case 3:
                this.signSummerTires = false;
                break;
            default:
                this.signSummerTires = true;
                break;
        }
    }

    static private boolean checkRegistrationNumber(String registrationNumber) { //х000хх000
        if (registrationNumber == null || registrationNumber.isBlank()) {
            return false;
        }
        registrationNumber = registrationNumber.trim().replaceAll("\\s+", "").toUpperCase();
        if (registrationNumber.length() != 9) {
            return false;
        }

        char[] charNumber = registrationNumber.toCharArray();

        boolean checkLetters = Character.UnicodeBlock.of(charNumber[0]).equals(Character.UnicodeBlock.CYRILLIC) &&
                Character.UnicodeBlock.of(charNumber[4]).equals(Character.UnicodeBlock.CYRILLIC) &&
                Character.UnicodeBlock.of(charNumber[5]).equals(Character.UnicodeBlock.CYRILLIC);
        boolean checkNumbers = Character.isDigit(charNumber[1]) && Character.isDigit(charNumber[2]) &&
                Character.isDigit(charNumber[3]) && Character.isDigit(charNumber[6]) &&
                Character.isDigit(charNumber[7]) && Character.isDigit(charNumber[8]); //123 876
        return checkNumbers && checkLetters;
    }



    /*public Car(String brand, String model, int year, String country, String bodyType, int numberOfSeats) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.country = country;
        this.bodyType = bodyType;
        this.numberOfSeats = numberOfSeats;
    }*/


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public boolean isSignSummerTires() {
        return signSummerTires;
    }

    public void setSignSummerTires(boolean signSummerTires) {
        this.signSummerTires = signSummerTires;
    }

    public void presentation() {
        System.out.println(brand + " " + model + ", " + year + " года выпуска," + " сборка в " + country + ", "
                + color + " цвета, объем двигателя — " + engineVolume + " л.," + " коробка передач - " + transmission
                + ", тип кузова - " + bodyType + ", регестрационный номер - " + registrationNumber +
                ", количество мест - " + numberOfSeats + ", месяц для выбора колес - " + signSummerTires);
    }
}
