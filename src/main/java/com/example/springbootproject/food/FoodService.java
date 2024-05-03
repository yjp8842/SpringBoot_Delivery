package com.example.springbootproject.food;

import org.springframework.stereotype.Service;

@Service
public class FoodService {
    FoodRepository foodRepository;

    FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    public Food findFood(int id) {
        return foodRepository.findFood(id);
    }
}
