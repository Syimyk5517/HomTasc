import java.time.LocalDate;

public class Pasport {
    private String id ;
    private Person person;
    private Country country;
    private LocalDate dateOfIssue;
    private LocalDate dateOfExpirty;

    public Pasport(String id, Person person, Country country, LocalDate dateOfIssue, LocalDate dateOfExpirty) {
        this.id = id;
        this.person = person;
        this.country = country;
        this.dateOfIssue = dateOfIssue;
        this.dateOfExpirty = dateOfExpirty;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public LocalDate getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(LocalDate dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public LocalDate getDateOfExpirty() {
        return dateOfExpirty;
    }

    public void setDateOfExpirty(LocalDate dateOfExpirty) {
        this.dateOfExpirty = dateOfExpirty;
    }

    @Override
    public String toString() {
        return "Pasport{" +
                "id='" + id + '\'' +
                ", person=" + person +
                ", country=" + country +
                ", dateOfIssue=" + dateOfIssue +
                ", dateOfExpirty=" + dateOfExpirty +
                '}';
    }
}
