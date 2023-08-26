package com.example.taco_cloud.data;

import com.example.taco_cloud.TacoOrder;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<TacoOrder, String> {}
