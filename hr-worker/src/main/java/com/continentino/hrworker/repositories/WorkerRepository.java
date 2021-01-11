package com.continentino.hrworker.repositories;

import com.continentino.hrworker.entities.Worker;

import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker,Long> {
    
}
