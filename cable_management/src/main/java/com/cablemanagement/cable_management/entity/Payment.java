package com.cablemanagement.cable_management.entity;

import java.sql.Date;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "payment")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long Id;

    @Nonnull
    @Column(name = "amount_paid")
    private Long AmountPaid;

    @NonNull
    @Column(name = "payment_date")
    private Date paymentDate;

    @NonNull
    @Column(name = "total_due")
    private Long totalDue;

    @OneToOne(mappedBy = "payment", optional = false)
    private Customer user;

}
