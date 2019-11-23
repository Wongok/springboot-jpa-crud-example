package boot.jpa.crud.dto;

import boot.jpa.crud.user.User;
import lombok.Getter;

@Getter
public class UserFindByIdResponseDto {

    private Long id;
    private String userName;
    private String userId;
    private String password;

    public UserFindByIdResponseDto(User entity) {
        id = entity.getId();
        userName = entity.getUserName();
        userId = entity.getUserId();
        password = entity.getPassword();
    }
}
