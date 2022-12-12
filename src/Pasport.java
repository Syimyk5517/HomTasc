import java.time.LocalDate;

public class Pasport {
    private String id ;
    private Person person;
    private LocalDate dateOfIssue = LocalDate.now();
    private LocalDate dateOfExpirty;

    public Pasport(String id, Person person, LocalDate dateOfExpirty) {
        this.id = id;
        this.person = person;
        this.dateOfExpirty = dateOfExpirty;
    }
    public Pasport(){

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
        return "Pasport" +
                "\nId:" + id +
                person.toString() +
                "\nDate Of Issue:" + dateOfIssue +
                "\nDate Of Expirty:" + dateOfExpirty ;
    }
}
