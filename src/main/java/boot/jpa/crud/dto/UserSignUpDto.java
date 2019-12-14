package boot.jpa.crud.dto;

import boot.jpa.crud.domain.user.User;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserSignUpDto {
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
