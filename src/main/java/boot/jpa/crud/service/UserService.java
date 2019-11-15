package boot.jpa.crud.service;

import boot.jpa.crud.dto.UserSignUpDTO;
import boot.jpa.crud.user.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@AllArgsConstructor
public class UserService {

    private UserRepository userRepository;

    @Transactional
    public Long UserSignUpRequest(UserSignUpDTO dto) {
        return userRepository.save(dto.toEntity()).getId();
    }


}
