package com.docflow.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.docflow.backend.model.Document;

public interface DocumentRepository extends JpaRepository<Document, Long> {

}
