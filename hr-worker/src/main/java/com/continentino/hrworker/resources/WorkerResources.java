package com.continentino.hrworker.resources;

import java.util.List;

import com.continentino.hrworker.entities.Worker;
import com.continentino.hrworker.repositories.WorkerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/workes" )
public class WorkerResources {
    
    @Autowired
    private WorkerRepository repository;
    @GetMapping
    public ResponseEntity<List<Worker>> findAll(){
        List<Worker> list = repository.findAll();

        return ResponseEntity.ok(list);
    }

    @GetMapping(value="/{id}")
    public ResponseEntity<Worker> findById(@PathVariable Long id){
        Worker work = repository.findById(id).get();

        return ResponseEntity.ok(work);
    }

}
