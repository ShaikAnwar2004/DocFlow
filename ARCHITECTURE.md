# Architecture Note

## Overview

DocFlow is a lightweight collaborative document editor inspired by Google Docs. The application follows a client-server architecture with a React frontend, Spring Boot backend, and MySQL database.

---

## System Architecture

### Frontend

Technology:

* React
* Vite
* Axios
* React Router DOM
* Tiptap Rich Text Editor

Responsibilities:

* Document creation and editing
* Rich text formatting
* File upload interface
* Document listing and navigation
* Sharing interface

The frontend communicates with the backend using REST APIs.

---

### Backend

Technology:

* Spring Boot
* Spring Data JPA
* Maven

Responsibilities:

* CRUD operations for documents
* File upload processing
* Document sharing logic
* Database persistence
* API request handling

REST Controllers:

* DocumentController
* FileUploadController
* ShareController

---

### Database

Technology:

* MySQL

Tables:

#### document

Stores document information.

Fields:

* id
* title
* content
* ownerId

#### document_share

Stores document sharing information.

Fields:

* id
* documentId
* sharedWith

---

## API Design

### Document APIs

* GET /api/documents
* POST /api/documents
* GET /api/documents/{id}
* PUT /api/documents/{id}
* DELETE /api/documents/{id}

### File Upload API

* POST /api/upload

### Sharing API

* POST /api/share

---

## Design Decisions

### Rich Text Editing

Tiptap was selected because it provides:

* Rich text formatting
* HTML content generation
* Simple React integration
* Extensibility

### Persistence

MySQL was chosen to ensure:

* Reliable storage
* Structured document management
* Easy future scalability

### Sharing Model

A lightweight sharing model was implemented to demonstrate:

* Document ownership
* Shared access
* Multi-user collaboration concepts

This approach keeps implementation simple while satisfying assignment requirements.

---

## Testing

JUnit tests were added to validate backend functionality and ensure build stability.

Testing performed:

* API verification using Postman
* File upload validation
* Database persistence verification
* JUnit automated test execution

---

## Prioritization

Given the assignment time constraints, the following areas were prioritized:

1. Document CRUD functionality
2. Rich text editing experience
3. Database persistence
4. File upload workflow
5. Document sharing model

The following were intentionally deprioritized:

* Real-time collaboration
* Authentication system
* Version history
* PDF export
* Commenting system

These features would be added in future iterations.

---

## Future Enhancements

* Real-time collaborative editing
* Version history tracking
* Role-based permissions
* PDF export
* Commenting and suggestions
* Authentication and authorization
* Cloud storage integration

---

## Conclusion

The implemented solution delivers the core requirements of a collaborative document editor while maintaining a clean architecture, scalable design, and clear separation of concerns between frontend, backend, and database layers.
