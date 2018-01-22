package exercise.powermock;

import java.util.Objects;

public class Email {

    private String address;
    private String title;
    private String body;

    public Email(String address, String title, String body) {
        this.address = address;
        this.title = title;
        this.body = body;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Email email = (Email) o;
        return Objects.equals(address, email.address)
                && Objects.equals(title, email.title)
                && Objects.equals(body, email.body);
    }
}
