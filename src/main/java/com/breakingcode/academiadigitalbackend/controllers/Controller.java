package com.breakingcode.academiadigitalbackend.controllers;
import java.util.List;
import com.breakingcode.academiadigitalbackend.entity.Trainee;
import com.breakingcode.academiadigitalbackend.service.ITraineeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controller {
    @Autowired
    private ITraineeService AcademiaDigitalService;
    @RequestMapping(path = "/GetAll", method = RequestMethod.GET)
    public ResponseEntity<?> GetAll() {

        List<Trainee> response = AcademiaDigitalService.getAllTrainees();
        return ResponseEntity.ok(response);
    }


    @RequestMapping(path = "/GetById", method = RequestMethod.GET)
    public ResponseEntity<?> GetById(String uuid) {

        Trainee response = AcademiaDigitalService.GetById(uuid);
        return ResponseEntity.ok(response);
    }


    @RequestMapping(path = "/DeleteById", method = RequestMethod.DELETE)
    public ResponseEntity<?> DeleteById (String uuid) {

        String response = AcademiaDigitalService.deleteById(uuid);
        return ResponseEntity.ok(response);
    }


    @RequestMapping(path = "/PostNewTrainee", method = RequestMethod.POST)
    public ResponseEntity<?> CreateTrainee(Trainee trainee) {

        String  response = AcademiaDigitalService.save(trainee);
        return ResponseEntity.ok(response);
    }
}
