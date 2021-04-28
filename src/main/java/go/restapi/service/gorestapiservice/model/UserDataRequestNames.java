package go.restapi.service.gorestapiservice.model;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Data
public class UserDataRequestNames {
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
}
