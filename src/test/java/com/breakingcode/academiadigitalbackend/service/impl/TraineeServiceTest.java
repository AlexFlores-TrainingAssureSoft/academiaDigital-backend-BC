package com.breakingcode.academiadigitalbackend.service.impl;
import com.breakingcode.academiadigitalbackend.entity.Modules;
import com.breakingcode.academiadigitalbackend.entity.Trainee;
import com.breakingcode.academiadigitalbackend.repository.IRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

public class TraineeServiceTest {
    @Mock
    private IRepository repository;

    @InjectMocks
    private TraineeService traineeService;
    private List<Trainee> traineesList = new ArrayList<>(Arrays.asList(
            new Trainee("Alex","Flores", "Alex@gmail.com","calle siempre viva","5123654","Carlos","4","buen chango"),
            new Trainee("Mauri","Gamarra", "Mauri@gmail.com","calle siempre viva2","54412654","Rodri","4","aplicado"),
            new Trainee("Melisa","Chiri", "Melisa@gmail.com","calle siempre viva3","5422654","Jorge","4","aplicada"),
            new Trainee("Jose","Medina", "Jose@gmail.com","calle siempre viva4","5411654","Jose","4","buen chango")));
    Trainee testTrainee = new Trainee("Melisa","Chiri", "Melisa@gmail.com","calle siempre viva3","5422654","Jorge","4","aplicada");

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);

    }

    @org.junit.Test
    public void getAllTrainees_should_return_list() {
        when(repository.getAll()).thenReturn(traineesList);
        assertNotNull(traineeService.getAllTrainees());
    }

    @org.junit.Test
    public void getAllTrainees_should_return_empty() {
        when(repository.getAll()).thenReturn(new ArrayList<Trainee>());
        Assert.assertEquals(0, traineeService.getAllTrainees().size());
    }

    @Test
    public void getById_should_return_trainee() {
        when(repository.getById("0280aafd-5cdd-4b76-b326-387fd525c16d")).thenReturn(testTrainee);
        assertNotNull(traineeService.getById("0280aafd-5cdd-4b76-b326-387fd525c16d"));
    }

    @Test
    public void postTrainee_should_return_OK() {
        when(repository.postTrainee(testTrainee)).thenReturn("OK");
        Assert.assertEquals("OK",traineeService.postTrainee(testTrainee));
    }

    @Test
    public void deleteById_if_success_should_return_ok() {
        when(repository.deleteById("0280aafd-5cdd-4b76-b326-387fd525c16d")).thenReturn("OK");
        Assert.assertEquals("OK",traineeService.deleteById("0280aafd-5cdd-4b76-b326-387fd525c16d"));

    }

    @Test
    public void deleteById_if_not_success_should_return_doesntExist() {
        when(repository.deleteById("0380aafd-5cdd-4b76-b326-387fd525c16d")).thenReturn("This id doesn's exist");
        Assert.assertEquals("This id doesn's exist",traineeService.deleteById("0380aafd-5cdd-4b76-b326-387fd525c16d"));
    }
}
