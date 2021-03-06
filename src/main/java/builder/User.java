package builder;

import java.time.LocalDate;

public class User {
    private String login;
    private String emailAddress;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;

    public User(String login, String emailAddress) {
        this.login = login;
        this.emailAddress = emailAddress;
    }

    public User(String login, String emailAddress, LocalDate birthDate) {
        this(login, emailAddress);
        this.birthDate = birthDate;
    }

    public User(String login, String emailAddress, LocalDate birthDate, String firstName, String lastName) {
        this(login, emailAddress, birthDate);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getLogin() {
        return login;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    private static Builder builder (){
        return User.Builder.builder();
    }

    public static class Builder {
        private String login;
        private String emailAddress;
        private String firstName;
        private String lastName;
        private LocalDate birthDate;

        private Builder(){
        }

        public static Builder builder () {
            return new Builder();
        }

        public Builder login (String login) {
            this.login = login;
            return this;
        }

        public Builder emailAddress (String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }

        public Builder birthDate (LocalDate birthDate) {
            this.birthDate = birthDate;
            return this;
        }

        public Builder firstName (String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName (String lastName) {
            this.lastName = lastName;
            return this;
        }

        public User build() {
            return new User(login, emailAddress, birthDate, firstName, lastName);
        }
    }

}

// User.Builder.builder   - pierwszy sposób tworzenia
