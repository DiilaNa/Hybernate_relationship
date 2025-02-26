package Entity;

import jakarta.persistence.*;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Entity/*
@Data*/
@Getter
@Setter

@Table(name = "orders")

public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

   private String orderDate;

    @ManyToOne
    private Customer customer;


}
