package boot.jpa.crud.controller;

import boot.jpa.crud.user.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class UserController {

    private UserRepository userRepository;

    @GetMapping("/signup")
    public String join() {
        return "signup";
    }
}
