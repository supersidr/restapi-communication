package ru.netology.user.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.netology.user.Entity.User;
import ru.netology.user.Repository.UserRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }
}