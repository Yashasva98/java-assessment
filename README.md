# Java Backend Assessment - Item Management API

This is a simple Java Spring Boot application that provides a REST API to manage items (add and retrieve). It uses an in-memory list for storage, so data resets when the application restarts.

## Prerequisites
*   **Java 17** (or newer)
*   **Maven** (Optional if using VS Code)
*   OR just **VS Code** with the Java Extension Pack

## How to Run

### Method 1: Using VS Code (Easiest)
1.  Open the `java-assessment` folder in VS Code.
2.  Open the file `src/main/java/com/example/items/ItemsApiApplication.java`.
3.  Click the **Run** button or "Run Java" link above the `main` method.

### Method 2: High-Level (Docker/Cloud)
Since a `Dockerfile` is included, you can deploy this directly to platforms like **Render** or **Railway**.
1.  Push this code to GitHub.
2.  Connect your repo to Render/Railway.
3.  It will build and deploy automatically.

## API Usage

The API runs on `http://localhost:8080`.

### 1. Add an Item
**URL:** `POST /items`
**Body:** JSON
```json
{
  "name": "My Item",
  "description": "Some description here"
}
```

### 2. Get an Item
**URL:** `GET /items/{id}`
**Example:** `http://localhost:8080/items/123-abc-456`

---
*Note: This project is set up for the assessment task.*
