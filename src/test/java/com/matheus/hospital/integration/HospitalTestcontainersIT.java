package com.matheus.hospital.integration;

import org.junit.jupiter.api.Test;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Testcontainers
public class HospitalTestcontainersIT {

    @Container
    public static MySQLContainer<?> mysql = new MySQLContainer<>("mysql:8.0")
            .withDatabaseName("hospital_testdb")
            .withUsername("test")
            .withPassword("test");

    @Test
    void mysqlContainerIsRunning() {
        assertTrue(mysql.isRunning());
    }
}
