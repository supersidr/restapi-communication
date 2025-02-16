package ru.netology.user.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import ru.netology.user.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class UserService {
    private final Map<Long, User> users;

    public UserService() {
        List<User> userList = new ArrayList<>();
        userList.add(new User(1L, "Игорь Сидоров", "Москва", "+7(999)9999999", "1@1.com"));
        userList.add(new User(2L, "Иван Волков", "Санкт-Петербунг", "+7(888)8888888", "2@2.com"));
        userList.add(new User(3L, "Леонид Захаров", "Екатеринбург", "+7(666)6666666", "3@3.com"));

        this.users = userList.stream().collect(Collectors.toMap(User::getId, Function.identity()));
    }

    public Optional<User> getUserById(@PathVariable Long userId) {
        return Optional.ofNullable(users.get(userId));
    }

    public List<User> getAllUsers() {
        return List.copyOf(users.values());
    }
}