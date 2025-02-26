package Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Table(name = "orderDetailsID")
@Embeddable

public class OrderDetailID {
  /*  @Column(name = "orderDetail_ID")*/
    private String OrderID;

  /*  @Column(name = "item_id")*/
    private String ItemID;

}
