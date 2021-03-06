package builder;

import java.time.LocalDate;
public class User {
    private final String login;
    private final String emailAddress;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    public User(String login, String emailAddress){
        this.login = login;
        this.emailAddress = emailAddress;
    }
    public User(String login, String emailAddress, LocalDate birthDate){
        this(login, emailAddress);
        this.birthDate = birthDate;
    }
    public User(String login, String emailAddress, LocalDate birthDate, String firstName, String lastName){
        this(login, emailAddress, birthDate);
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getLogin() {
        return login;
    }
    public String getEmail() {
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
    public static RequireLogin builder(){
        return User.Builder.builder();
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }

    interface RequireLogin {
        Builder login (String login);
    }

    public static class Builder{
        private String login;
        private String emailAddress;
        private String firstName;
        private String lastName;
        private LocalDate birthDate;
        private Builder(){
        }
        private static RequireLogin builder(){
            return l -> {
                Builder builder = new Builder();
                builder.login = l;
                return builder;
            };
        }

        public Builder login(String login){
            this.login = login;
            return this;
        }

        public Builder emailAddress(String emailAddress){
            this.emailAddress = emailAddress;
            return this;
        }

        public Builder birthDate(LocalDate birthDate){
            this.birthDate = birthDate;
            return this;
        }

        public Builder firstName(LocalDate birthDate){
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public User build(){
            return new User(login, emailAddress, birthDate, firstName, lastName);
        }
    }
}

// User.Builder.builder   - pierwszy sposób tworzenia
