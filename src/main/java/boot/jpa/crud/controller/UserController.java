package boot.jpa.crud.controller;

import boot.jpa.crud.service.UserService;
import boot.jpa.crud.user.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class UserController {

    private UserService userService;

    @GetMapping("/signup")
    public String join() {
        return "signup";
    }

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("list", userService.userFindAllResponse());
        return "list";
    }
}
