package com.example.taco_cloud.data;

import com.example.taco_cloud.TacoOrder;

public interface OrderRepository {
    TacoOrder save(TacoOrder tacoOrder);
}
