package Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
/*@Data*/
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;


    @OneToMany(mappedBy = "customer",cascade=CascadeType.ALL )
    private List<Order> orders;


}
