package com.example.springbootproject.food;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoodController {
    FoodService foodService;

    FoodController(FoodService foodService) {
        this.foodService = foodService;
    }
    // 메뉴 상세 조회
    // URL: /foods/{id}

    @GetMapping("/foods/{id}")
    public Food findFood(@PathVariable int id) {
        return foodService.findFood(id);
    }
}
