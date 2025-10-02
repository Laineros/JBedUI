package com.laineros.JBedUI.service;

import com.laineros.JBedUI.model.ButtonDoc;
import com.laineros.JBedUI.repository.ButtonRepository;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ButtonService {
    private final ButtonRepository repo;

    public ButtonService(ButtonRepository repo) {
        this.repo = repo;
    }

    public Optional<ButtonDoc> getButtonById(String id) {
        return repo.findById(new ObjectId(id));
    }
}
