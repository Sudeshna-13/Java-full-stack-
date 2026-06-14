package com.example.h2db;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {}

/* JpaRepository <Student, Long>
JpaRepository is a Spring Data JPA interface that has already has all common CRUD methods built in.
By extending it, your StudentRepository automatically gets method like:
save(Student s) -->  insert/update a student
findAll() --> get all students
findById(Long id) --> get one student
deleteById(Long id) --> delete one student
You dont need to write SQL or implement these methods yourself - Spring generates them at runtime.
 */

/* 2. <Student, Long>
The first type parameter (Student) tells JPA which entity this repository manages.
--> It's tied to your Student table
The second type parameter (Long) tells JPA the type of the primary key(id).
--> Since your Student entity has private Long id;, you specify Long
 */

/* 3. public interface StudentRepository
It's an interface , not a class.
You don't write any code inside - Spring boot automatically creates a working implementation at runtime.
 */