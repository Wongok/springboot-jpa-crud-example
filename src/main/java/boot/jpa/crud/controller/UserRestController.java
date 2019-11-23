package boot.jpa.crud.controller;

import boot.jpa.crud.dto.UserFindByIdResponseDto;
import boot.jpa.crud.dto.UserSignUpDTO;
import boot.jpa.crud.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class UserRestController {

    private UserService userService;

    @PostMapping("/signup")
    public Long UserSignUpRequest(@RequestBody UserSignUpDTO dto) {
        return userService.UserSignUpRequest(dto);
    }

    @PostMapping("/find")
    public UserFindByIdResponseDto UserFindByIdResponse(@RequestBody Long id) {
        return userService.UserFindByIdResponse(id);
    }
}
