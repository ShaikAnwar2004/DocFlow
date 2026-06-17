package com.docflow.backend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.docflow.backend.model.Document;
import com.docflow.backend.repository.DocumentRepository;

@RestController
@RequestMapping("/api/documents")
@CrossOrigin("*")
public class DocumentController {

    private final DocumentRepository repository;

    public DocumentController(DocumentRepository repository) {
        this.repository = repository;
    }

    // Get all documents
    @GetMapping
    public List<Document> getAllDocuments() {
        return repository.findAll();
    }

    // Create document
    @PostMapping
    public Document createDocument(@RequestBody Document document) {
        return repository.save(document);
    }

    // Get document by id
    @GetMapping("/{id}")
    public Document getDocument(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    // Update document
    @PutMapping("/{id}")
    public Document updateDocument(
            @PathVariable Long id,
            @RequestBody Document updatedDoc) {

        Document doc = repository.findById(id).orElseThrow();

        doc.setTitle(updatedDoc.getTitle());
        doc.setContent(updatedDoc.getContent());

        return repository.save(doc);
    }

    // Delete document
    @DeleteMapping("/{id}")
    public void deleteDocument(@PathVariable Long id) {
        repository.deleteById(id);
    }
}