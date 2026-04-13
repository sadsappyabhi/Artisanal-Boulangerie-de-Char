package dev.mocalabs.abc.orders;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@IdClass(OrderLineItemID.class)
@Table(name="order_line_items")
public class OrderLineItem implements Serializable {
    @Id
    @Column(name="order_id")
    private Long orderId;

    @Id
    @Column(name="menu_item_id")
    private Long menuItemId;

    @Column(name="quantity")
    private Long quantity;
}
