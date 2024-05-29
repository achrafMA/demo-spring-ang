package net.achraf.demospringang;

import net.achraf.demospringang.entities.Payment;
import net.achraf.demospringang.entities.PaymentStatus;
import net.achraf.demospringang.entities.PaymentType;
import net.achraf.demospringang.entities.Student;
import net.achraf.demospringang.repository.PaymentRepository;
import net.achraf.demospringang.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.Random;
import java.util.UUID;

@SpringBootApplication
public class DemoSpringAngApplication {

    public static void main(String[] args) {

        SpringApplication.run(DemoSpringAngApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository, PaymentRepository paymentRepository){
        return args -> {
            studentRepository.save(Student.builder().id(UUID.randomUUID().toString())
                            .firstName("Mohammed").code("112533").programId("II-BDCC")
                    .build());

            studentRepository.save(Student.builder().id(UUID.randomUUID().toString())
                    .firstName("Saaid").code("112643").programId("SDIA")
                    .build());

            studentRepository.save(Student.builder().id(UUID.randomUUID().toString())
                    .firstName("HAMID").code("112536").programId("GE")
                    .build());

            studentRepository.save(Student.builder().id(UUID.randomUUID().toString())
                    .firstName("NISRINE").code("112556").programId("MA")
                    .build());


            PaymentType[] paymentTypes = PaymentType.values();
            Random random = new Random();
            studentRepository.findAll().forEach(st ->{
                for (int i = 0;i<10;i++){
                    int index = random.nextInt(paymentTypes.length);
                    Payment payment = Payment.builder().amount(1000+(int)(Math.random()+20000) )
                            .type(paymentTypes[index])
                            .status(PaymentStatus.CREATED)
                            .date(LocalDate.now())
                            .student(st)
                            .build();
                    paymentRepository.save(payment);
                }
            } );

        };
    }

}
