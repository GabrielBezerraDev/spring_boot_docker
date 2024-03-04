package com.bezerra.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bezerra.test.model.Snack;

@Repository
public interface SnackRepository extends JpaRepository<Snack,Long>{}
