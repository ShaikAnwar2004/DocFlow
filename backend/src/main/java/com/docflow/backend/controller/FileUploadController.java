package com.docflow.backend.controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.docflow.backend.model.Document;
import com.docflow.backend.repository.DocumentRepository;

@RestController
@RequestMapping("/api/upload")
@CrossOrigin("*")
public class FileUploadController {

    private final DocumentRepository repository;

    public FileUploadController(DocumentRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Document uploadFile(
            @RequestParam("file") MultipartFile file)
            throws IOException {

        String content = new String(file.getBytes());

        Document document = new Document();
        document.setTitle(file.getOriginalFilename());
        document.setContent(content);
        document.setOwnerId(1L);

        return repository.save(document);
    }
}
