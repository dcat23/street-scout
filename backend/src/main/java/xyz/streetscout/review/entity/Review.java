package xyz.streetscout.review.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import xyz.streetscout.customer.entity.Customer;
import xyz.streetscout.vendor.entity.Vendor;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "reviews")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @OneToOne(fetch = FetchType.EAGER)
    private Customer reviewer;

    @ManyToOne(fetch = FetchType.LAZY)
    private Vendor vendor;

    @Column(name = "rating", nullable = false)
    private Integer rating;

    @Column(name = "text")
    private String text;

    @CreationTimestamp
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "is_enabled", nullable = false)
    private boolean isEnabled = true;

}
