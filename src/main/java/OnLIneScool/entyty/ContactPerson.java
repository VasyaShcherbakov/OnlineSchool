package main.java.OnLIneScool.entyty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Embeddable
@Setter
@Getter
@ToString

public class ContactPerson {
    private String username;

    private String email;

    private String phoneNumber;
}
