package go.restapi.service.gorestapiservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserData {

    private String firstName;
    private String lastName;
    private String email;
    private String userId;

}
