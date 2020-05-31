package ru.fivestarter.server.user;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @GetMapping
    public ResponseEntity<UserJson> getUser() {
        UserJson user = new UserJson();
        user.setFirstName("firstName");
        user.setLastName("lastName");
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
}
