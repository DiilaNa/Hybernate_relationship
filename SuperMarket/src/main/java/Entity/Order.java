package Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "orders")
public class Order {
    @Id
    @Column(name = "order_id")
    private int Id;

    private Date date;

    @ManyToOne
    @JoinColumn(name = "cust_id")
    private Customer customer;

    @OneToMany
    private List<OrderDetail> orderDetail;
}
