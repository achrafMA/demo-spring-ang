package net.achraf.demospringang.repository;

import jdk.jshell.Snippet;
import net.achraf.demospringang.entities.Payment;
import net.achraf.demospringang.entities.PaymentStatus;
import net.achraf.demospringang.entities.PaymentType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PaymentRepository extends JpaRepository<Payment,Long> {
    List<Payment> findByStudentCode(String code);
    List<Payment> findByStatus(PaymentStatus status);
    List<Payment> findByType(PaymentType type);

}
