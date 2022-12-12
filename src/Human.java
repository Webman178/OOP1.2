public class Human {

    private int yearOfBirth;
    String name;
    private String town;
    String jobTitle;

    Human(int yearOfBirth, String name, String town, String jobTitle) {
        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = Math.abs(yearOfBirth);
        }
        this.name = name;
        if (this.name == null) {
            this.name = "Информация не указана";
        }
        this.town = town;
        if (this.town == null || this.town.isEmpty() || this.town.isBlank()) {
            this.town = "Информация не указана";
        }
        this.jobTitle = jobTitle;
        if (this.jobTitle == null || this.jobTitle.isEmpty() || this.jobTitle.isBlank()) {
            this.jobTitle = "Информация не указана";
        }
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    void greeting() {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town +
                ". Мой год рождения" + yearOfBirth + ". Я работаю на должности " + jobTitle + ". Будем знакомы!");
    }


}
