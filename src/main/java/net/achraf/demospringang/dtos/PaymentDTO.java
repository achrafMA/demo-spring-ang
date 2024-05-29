package net.achraf.demospringang.dtos;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.*;
import net.achraf.demospringang.entities.PaymentStatus;
import net.achraf.demospringang.entities.PaymentType;
import net.achraf.demospringang.entities.Student;

import java.time.LocalDate;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder

public class PaymentDTO {

    private  Long id;
    private LocalDate date;
    private double amount;
    private PaymentType type;
    private PaymentStatus status;
}
