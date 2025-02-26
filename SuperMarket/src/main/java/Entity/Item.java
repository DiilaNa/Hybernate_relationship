package Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "item")
public class Item {
    @Id
    @Column(name = "item_id")
    private int id;

    @Column(length = 100)
    private String name;

    private int qty;

   @Column(name = "unit_price",precision = 10 , scale = 2)
    private BigDecimal unitPrice;


}
