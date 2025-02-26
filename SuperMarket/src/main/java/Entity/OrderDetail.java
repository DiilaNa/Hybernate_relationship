package Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "orderDetails")

public class OrderDetail {
    @EmbeddedId
    private OrderDetailID ID;

    @ManyToOne
    @MapsId("OrderID")
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne
    @MapsId("ItemID")
    @JoinColumn(name = "item_id")
    private Item item;

    private int qty;
    @Column(name = "unit_price",precision = 10,scale = 2)
    private BigDecimal unitPrice;
}
