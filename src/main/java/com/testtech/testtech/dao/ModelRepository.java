package com.testtech.testtech.dao;

import com.testtech.testtech.entities.Model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelRepository extends JpaRepository<Model,Long> {
}
