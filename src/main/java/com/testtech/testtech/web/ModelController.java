package com.testtech.testtech.web;

import com.testtech.testtech.dao.ModelRepository;
import com.testtech.testtech.entities.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ModelController {
    @Autowired
    private ModelRepository modelRepository;

    @GetMapping("/model")
    public List<Model> getAll(){
        return modelRepository.findAll();
    }
    @GetMapping("/model/{id}")
    public Model getById(@PathVariable Long id){
        return modelRepository.findById(id).get();
    }
    @PostMapping("/model")
    public Model saveModel(@RequestBody Model model){
        return modelRepository.save(model);
    }

}
