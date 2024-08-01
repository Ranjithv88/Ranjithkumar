# Help Documentation

## User Management CRUD Application

This document provides guidance on using and troubleshooting the User Management CRUD Application.

### Getting Started

1. **Prerequisites**
    - Ensure you have the following installed:
        - JDK 8 or higher
        - MySQL Server
        - Maven
        - An IDE (e.g., IntelliJ IDEA, Eclipse)

2. **Database Setup**
    - Create a MySQL database named `user_management`:
      ```sql
      CREATE DATABASE user_management;
      ```

3. **Configuration**
    - Open `src/main/resources/application.properties` and configure the database connection:
      ```properties
      spring.datasource.url=jdbc:mysql://localhost:3306/user_management
      spring.datasource.username=<your-username>
      spring.datasource.password=<your-password>
      spring.jpa.hibernate.ddl-auto=update
      ```

### Application Features

- **User Registration:** Fill out the form to register a new user.
- **User List:** View all registered users with options to edit or delete.
- **Image Upload:** Upload a profile image when creating or updating a user.

### API Endpoints

| HTTP Method | Endpoint                            | Description                                   |
|-------------|-------------------------------------|-----------------------------------------------|
| GET         | `/users`                            | Retrieve a list of all users.                |
| GET         | `/users/showNewUserForm`           | Show form for adding a new user.             |
| POST        | `/users/saveUser`                  | Save a new user or update an existing user.  |
| GET         | `/users/showFormForUpdate/{id}`    | Show form to edit an existing user by ID.    |
| GET         | `/users/deleteUser/{id}`           | Delete a user by ID.                          |

### Common Issues

1. **Database Connection Issues**
    - Ensure that MySQL is running and the connection properties in `application.properties` are correct.

### Troubleshooting Steps

- **Check Logs:** Review the application logs for any error messages.
- **Verify Database Records:** Use a MySQL client to check if users and images are correctly stored.
- **Browser Console:** Inspect the browser console for any loading errors related to images or resources.

### Frequently Asked Questions (FAQ)

- **How do I change the default image upload directory?**
  Update the `uploadDir` variable in the `saveImage` method of `UserController`.

- **How do I reset the database?**
  Drop the existing database and recreate it using:
  ```sql
  DROP DATABASE user_management;
  CREATE DATABASE user_management;
