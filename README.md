# DocFlow

A lightweight collaborative document editor inspired by Google Docs. This application allows users to create, edit, save, upload, and share documents through a simple full-stack web application.

## Features

### Document Management

* Create new documents
* Rename existing documents
* Edit document content
* Save and reopen documents
* Persistent storage using MySQL

### Rich Text Editing

* Bold formatting
* Italic formatting
* Underline formatting
* Headings
* Bullet lists

### File Upload

* Upload `.txt` files
* Automatically convert uploaded files into editable documents

### Sharing

* Share documents with other users
* Document owner model
* Shared document tracking

### Persistence

* MySQL database storage
* Data remains available after application restart
* Document content and metadata stored permanently

---

## Tech Stack

### Frontend

* React
* Vite
* Axios
* React Router DOM
* Tiptap Rich Text Editor

### Backend

* Spring Boot
* Spring Data JPA
* Maven

### Database

* MySQL

### Testing

* JUnit 5

---

## Project Structure

```text
DocFlow
├── frontend
│   ├── src
│   │   ├── components
│   │   ├── pages
│   │   └── services
│   └── package.json
│
├── backend
│   ├── src
│   │   ├── controller
│   │   ├── model
│   │   ├── repository
│   │   └── resources
│   └── pom.xml
│
├── README.md
├── ARCHITECTURE.md
├── AI_WORKFLOW.md
└── SUBMISSION.md
```

---

## Setup Instructions

### Prerequisites

* Java 21+
* Node.js 18+
* MySQL 8+
* Maven

---

## Database Setup

Create a database:

```sql
CREATE DATABASE docflow;
```

Update:

```properties
backend/src/main/resources/application.properties
```

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/docflow
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## Run Backend

Navigate to backend directory:

```bash
cd backend
```

Start Spring Boot:

```bash
.\mvnw spring-boot:run
```

Backend runs at:

```text
http://localhost:8080
```

---

## Run Frontend

Navigate to frontend directory:

```bash
cd frontend
```

Install dependencies:

```bash
npm install
```

Start development server:

```bash
npm run dev
```

Frontend runs at:

```text
http://localhost:5173
```

---

## API Endpoints

### Documents

| Method | Endpoint            | Description        |
| ------ | ------------------- | ------------------ |
| GET    | /api/documents      | Get all documents  |
| POST   | /api/documents      | Create document    |
| GET    | /api/documents/{id} | Get document by ID |
| PUT    | /api/documents/{id} | Update document    |
| DELETE | /api/documents/{id} | Delete document    |

### File Upload

| Method | Endpoint    | Description      |
| ------ | ----------- | ---------------- |
| POST   | /api/upload | Upload text file |

### Sharing

| Method | Endpoint   | Description      |
| ------ | ---------- | ---------------- |
| POST   | /api/share | Share a document |

---

## Testing

Run backend tests:

```bash
.\mvnw test
```

Expected result:

```text
BUILD SUCCESS
```

---

## Future Improvements

* Real-time collaboration
* Version history
* Export to PDF
* Role-based permissions
* Comments and suggestions
* Authentication and authorization

---

## Author

**Shaik Anwar Basha**

GitHub: https://github.com/ShaikAnwar2004

Portfolio: https://myportfolio-delta-eight-14.vercel.app


