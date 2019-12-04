package boot.jpa.crud.service;

import boot.jpa.crud.dto.UserFindAllDto;
import boot.jpa.crud.dto.UserFindByIdResponseDto;
import boot.jpa.crud.dto.UserSignUpDTO;
import boot.jpa.crud.user.User;
import boot.jpa.crud.user.UserRepository;
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
    public Long UserSignUpRequest(UserSignUpDTO dto) {
        return userRepository.save(dto.toEntity()).getId();
    }

    @Transactional
    public UserFindByIdResponseDto UserFindByIdResponse(Long id) {
        User user = userRepository.findById(id).orElse(null);
        return new UserFindByIdResponseDto(user);
    }

    @Transactional
    @ReadOnlyProperty
    public List<UserFindAllDto> UserFindAllResponse() {
        return userRepository.findAll().stream()
                .map(UserFindAllDto::new)
                .collect(Collectors.toList());
    }
}
