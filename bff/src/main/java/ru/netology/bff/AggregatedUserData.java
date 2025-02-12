package ru.netology.bff;

import ru.netology.bff.dto.Order;
import ru.netology.bff.dto.User;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AggregatedUserData {
    private User user;
    private List<Order> orders;
}

