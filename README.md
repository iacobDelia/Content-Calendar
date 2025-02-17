# Content calendar
## About
Java Spring CRUD application for managing ideas and other miscellaneous type of content, using a postgresql database that runs in docker.

## Usage
Once the server is running, it accepts GET, POST, PUT and DELETE requests at the address `http://localhost:8080/api/content`. POST requests should have the following format:
```html
POST http://localhost:8080/api/content
Content-Type: application/json

{
  "id": 1,
  "title": "dummyTitle",
  "description": "dummyDesc",
  "status": "IDEA",
  "contentType": "ARTICLE",
  "dateCreated": "2025-02-15T13:11:59.0531568",
  "dateUpdated": null,
  "url": ""
}
```
The application also has a filtering functionality by using the url `http://localhost:8080/api/content/{keyword}` or `/filter/status/{status}`.
