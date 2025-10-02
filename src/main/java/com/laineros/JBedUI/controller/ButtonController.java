package com.laineros.JBedUI.controller;

import com.laineros.JBedUI.model.ButtonDoc;
import com.laineros.JBedUI.service.ButtonService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/bdui/avito/order/cart")
public class ButtonController {

    private final ButtonService buttonService;

    public ButtonController(ButtonService buttonService) {
        this.buttonService = buttonService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ButtonDoc> getButtonById(@PathVariable String id) {
        Optional<ButtonDoc> button = buttonService.getButtonById(id);
        return button.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
