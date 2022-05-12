package com.breakingcode.academiadigitalbackend.service.impl;

import com.breakingcode.academiadigitalbackend.repository.IRepository;
import com.breakingcode.academiadigitalbackend.service.IAcademiaDigitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AcademiaDigitalServiceImpl implements IAcademiaDigitalService {
    @Override
    public List<String> getAllTrainees() {
        List<String> lista = new ArrayList<>();
        lista.add("asl");
        lista.add("Mau");
        return lista;
    }
}
