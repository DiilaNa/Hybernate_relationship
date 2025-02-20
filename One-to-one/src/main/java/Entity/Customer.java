package Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Customer_table")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //    AUTO - hibernate decided auto
//    IDENTY - databases genarate auto
//    For custom value dont juse @GeneratedValue
//    Auto hari IDENTY hari danawanm eka int ekak wiya yuthuyi
    private int id;
    private String name;

    @OneToOne
    @JoinColumn(name = "nic_number")
    private IDCard idCard;

}
