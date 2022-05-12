package com.breakingcode.academiadigitalbackend.service.impl;

import com.breakingcode.academiadigitalbackend.repository.IRepository;
import com.breakingcode.academiadigitalbackend.service.IAcademiaDigitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AcademiaDigitalServiceImpl implements IAcademiaDigitalService {

    @Autowired
    private IRepository repository;

    @Override
    public List<String> getAllTrainees() {
        return null;
    }
}
