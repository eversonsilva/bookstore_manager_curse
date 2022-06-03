package com.eversonsilva.bookstoremanager.repository;

import com.eversonsilva.bookstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
