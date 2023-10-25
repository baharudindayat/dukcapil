package com.dukcapil.dukcapil.repository;

import com.dukcapil.dukcapil.model.Ktp;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface KtpRepository extends JpaRepository<Ktp, Long> {
    Optional<Ktp> findByNik(String nik);
}