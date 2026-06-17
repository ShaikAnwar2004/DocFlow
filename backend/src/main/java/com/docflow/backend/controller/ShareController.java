package com.docflow.backend.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.docflow.backend.model.DocumentShare;
import com.docflow.backend.repository.DocumentShareRepository;

@RestController
@RequestMapping("/api/share")
@CrossOrigin("*")
public class ShareController {

    private final DocumentShareRepository repository;

    public ShareController(DocumentShareRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public DocumentShare share(
            @RequestBody DocumentShare share) {

        return repository.save(share);
    }
}
