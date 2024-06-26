# Spring Cellular Billing Reports

## Description
This application generates billing reports for an imaginary cell phone company called Spring Cellular. It uses Spring Boot, Spring Batch, PostgreSQL, and Java to efficiently process and generate comprehensive billing reports.

## Technologies
- **Spring Boot 3**
- **Spring Batch**
- **PostgreSQL**
- **Java 21**

## Prerequisites
- Docker and Docker Compose installed on your machine.
- Java Development Kit (JDK) 21 installed.

## Initialize the Database
1. Ensure Docker is running
2. Use Docker Compose to start the PostgreSQL container:
    - `docker-compose up -d`
3. Enter the PostgreSQL container:
    - `docker exec -it [container_name] psql -U postgres`
4. Paste the content from `create-tables.sql` located in `src/resources`
5. Confirm if the tables were created:
    - `\d`
6. Exit from the container
    - `\q`