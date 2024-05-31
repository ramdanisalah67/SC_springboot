package com.example.test_app.Repository;

import com.example.test_app.Models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
