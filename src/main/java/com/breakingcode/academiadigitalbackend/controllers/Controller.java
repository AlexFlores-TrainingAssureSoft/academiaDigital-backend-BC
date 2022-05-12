package com.breakingcode.academiadigitalbackend.controllers;
import java.util.List;

import com.breakingcode.academiadigitalbackend.service.IAcademiaDigitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/GetAll")
public class Controller {
    @Autowired
    private IAcademiaDigitalService AcademiaDigitalService;

    @GetMapping
    @RequestMapping(value = "consultar", method = RequestMethod.GET)
    public ResponseEntity<?> Consultar() {

        List<String> Response = this.AcademiaDigitalService.getAllTrainees();

        return ResponseEntity.ok(Response);
    }

}
