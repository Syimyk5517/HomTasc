import java.time.LocalDate;

public class Person {
    private String name ;
    private String lastName;
    private LocalDate dateOfBirth;
    private Gender gender;
    private Country placeOfBirth;

    public Person(String name, String lastName, LocalDate dateOfBirth, Gender gender, Country placeOfBirth) {
        this.name = name;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.placeOfBirth = placeOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }


    public Country getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(Country placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    @Override
    public String toString() {
        return  "\nName:" + name +
                "\nLastName:" + lastName +
                "\nDate Of birth:" + dateOfBirth +
                "\nGender:" + gender +
                "\nPlace Of birth:" + placeOfBirth ;
    }
}
