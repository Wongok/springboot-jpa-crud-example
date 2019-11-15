package boot.jpa.crud.dto;

import boot.jpa.crud.user.User;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserSignUpDTO {

    private String userName;
    private String userId;
    private String password;

    public User toEntity() {
        return User.builder()
                .userName(userName)
                .userId(userId)
                .password(password)
                .build();
    }
}
