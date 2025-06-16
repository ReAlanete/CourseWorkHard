import java.util.Objects;

public class FullName {
    String firstName;
    String middleName;
    String lastName;


    public FullName(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }



    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        FullName fullName = (FullName) o;
        return Objects.equals(firstName, fullName.firstName) && Objects.equals(middleName, fullName.middleName) && Objects.equals(lastName, fullName.lastName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(firstName, middleName, lastName);
    }

    @Override
    public String toString() {
        return firstName + " " + middleName + " " + lastName;

    }
}
