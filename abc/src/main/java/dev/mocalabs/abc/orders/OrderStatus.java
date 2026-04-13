package dev.mocalabs.abc.orders;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="order_statuses")
public class OrderStatus {
    @Id
    @GeneratedValue
    @Column(name="status_id")
    private Long id;

    @Column(name="order_status_description", nullable=false)
    private String description;
}
