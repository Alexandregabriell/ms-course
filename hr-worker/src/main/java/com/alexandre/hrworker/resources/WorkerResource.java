package com.alexandre.hrworker.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alexandre.hrworker.entities.Worker;
import com.alexandre.hrworker.repositories.WorkerRepository;

@RestController
@RequestMapping(path = "/workers")
public class WorkerResource {
	
	@Autowired
	private WorkerRepository workerRepository;
	
	@GetMapping
	ResponseEntity<List<Worker>> findAll() {
		List<Worker> list = workerRepository.findAll();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping("{id}")
	ResponseEntity<Worker> findById(@PathVariable Long id) {
		Worker worker = workerRepository.findById(id).get();
		return ResponseEntity.ok(worker);
	}
}
