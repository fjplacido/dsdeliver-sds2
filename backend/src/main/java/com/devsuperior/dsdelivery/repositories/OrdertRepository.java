package com.devsuperior.dsdelivery.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsdelivery.entities.Order;

public interface OrdertRepository extends JpaRepository<Order, Long> {

}
