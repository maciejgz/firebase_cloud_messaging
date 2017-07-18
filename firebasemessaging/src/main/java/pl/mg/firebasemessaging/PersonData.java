package pl.mg.firebasemessaging;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PersonData {
    private final String firstName;
    private final String lastName;

    public PersonData(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }
}
