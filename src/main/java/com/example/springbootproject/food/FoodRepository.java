package com.example.springbootproject.food;

import java.util.HashMap;
import java.util.Map;

public class FoodRepository {
    Map<Integer, Food> foodTable = new HashMap<>();

    public Food findFood(int id) {
        return foodTable.get(id);
    }
}
