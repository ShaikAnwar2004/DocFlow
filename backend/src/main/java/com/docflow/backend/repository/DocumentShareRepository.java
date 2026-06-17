package com.docflow.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.docflow.backend.model.DocumentShare;

public interface DocumentShareRepository
        extends JpaRepository<DocumentShare, Long> {
}