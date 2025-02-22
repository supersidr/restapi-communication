package ru.netology.bff;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.netology.contracts.dto.Order;
import ru.netology.contracts.dto.User;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AggregatedUserData {
    private User user;
    private List<Order> orders;
}

