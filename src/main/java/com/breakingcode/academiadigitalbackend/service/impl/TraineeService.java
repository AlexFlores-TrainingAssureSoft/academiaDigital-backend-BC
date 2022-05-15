package com.breakingcode.academiadigitalbackend.service.impl;
import com.breakingcode.academiadigitalbackend.entity.Trainee;
import com.breakingcode.academiadigitalbackend.repository.IRepository;
import com.breakingcode.academiadigitalbackend.service.ITraineeService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TraineeService implements ITraineeService {
    private final IRepository repository;

    public TraineeService(IRepository repository){
        this.repository=repository;
    }
    @Override
    public List<Trainee> getAllTrainees() {

        return this.repository.findAll();
    }

    @Override
    public Trainee GetById(String uuid) {
        return this.repository.findById(uuid);
    }

    @Override
    public String save(Trainee trainee) {
        return this.repository.save(trainee);
    }

    @Override
    public String deleteById(String uuid) {
        return this.repository.deleteById(uuid);
    }

}
