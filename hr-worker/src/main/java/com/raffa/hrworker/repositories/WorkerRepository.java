package com.raffa.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raffa.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
	
}
