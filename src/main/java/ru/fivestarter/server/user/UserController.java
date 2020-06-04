package ru.fivestarter.server.user;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:63342", maxAge = 3600)
@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @GetMapping
    public ResponseEntity<UserJson> getUser() {
        UserJson user = new UserJson();
        user.setFirstName("Mick");
        user.setLastName("Jagger");
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
}
