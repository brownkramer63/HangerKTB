package com.Project.entity.Base;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "services")
public class Services extends BaseEntity{

    private String serviceName;
    private LocalDateTime serviceDuration;
    private BigDecimal servicePrice;
    private LocalDateTime serviceStartTime;
    private LocalDateTime serviceEndTime;
    private LocalDateTime serviceTimeRemaining;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;
}
