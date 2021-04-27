package go.restapi.service.gorestapiservice.common;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserUtil {

    public String generateId() {
        return UUID.randomUUID().toString();
    }
}
