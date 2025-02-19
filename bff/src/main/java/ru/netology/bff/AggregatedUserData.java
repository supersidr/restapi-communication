package ru.netology.bff;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.netology.bff.model.Order;
import ru.netology.bff.model.User;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AggregatedUserData {
    private User user;
    private List<Order> orders;
}

