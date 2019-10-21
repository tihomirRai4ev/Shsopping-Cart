package com.demo.repository;

import com.demo.model.OrderProduct;
import com.demo.model.OrderProductPK;
import org.springframework.data.repository.CrudRepository;

public interface OrderProductRepository extends CrudRepository<OrderProduct, OrderProductPK> {
}