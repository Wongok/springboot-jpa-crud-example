package boot.jpa.crud.controller;

import boot.jpa.crud.dto.UserFindByIdResponseDto;
import boot.jpa.crud.dto.UserSignUpDto;
import boot.jpa.crud.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class UserRestController {

    private UserService userService;

    @PostMapping("/signup")
    public Long UserSignUpRequest(@RequestBody UserSignUpDto dto) {
        return userService.userSignUpRequest(dto);
    }

    @PostMapping("/find")
    public UserFindByIdResponseDto UserFindByIdResponse(@RequestBody Long id) {
        return userService.userFindByIdResponse(id);
    }

    @DeleteMapping("/delete")
    public Long UserDeleteByIdRequest(@RequestBody Long id) {
        userService.userDeleteRequest(id);
        return id;
    }
}
