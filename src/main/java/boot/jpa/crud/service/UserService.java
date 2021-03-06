package boot.jpa.crud.service;

import boot.jpa.crud.dto.UserFindAllDto;
import boot.jpa.crud.dto.UserFindByIdResponseDto;
import boot.jpa.crud.dto.UserSignUpDto;
import boot.jpa.crud.dto.UserUpdateRequestDto;
import boot.jpa.crud.domain.user.User;
import boot.jpa.crud.domain.user.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UserService {

    private UserRepository userRepository;

    @Transactional
    public Long userSignUpRequest(UserSignUpDto dto) {
        return userRepository.save(dto.toEntity()).getId();
    }

    @Transactional
    public UserFindByIdResponseDto userFindByIdResponse(Long id) {
        User user = userRepository.findById(id).orElse(null);
        return new UserFindByIdResponseDto(user);
    }

    @Transactional
    @ReadOnlyProperty
    public List<UserFindAllDto> userFindAllResponse() {
        return userRepository.findAll().stream()
                .map(UserFindAllDto::new)
                .collect(Collectors.toList());
    }

    @Transactional
    public Long userUpdateRequest(UserUpdateRequestDto dto){
        return userRepository.save(dto.toEntity()).getId();
    }

    @Transactional
    public void userDeleteRequest(Long id) {
        userRepository.deleteById(id);
    }
}
