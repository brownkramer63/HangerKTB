package com.Project.dto;

import com.Project.entity.Base.Profile;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ServicesDTO {
    private String serviceName;
    private LocalDateTime serviceDuration;
    private BigDecimal servicePrice;
    private LocalDateTime serviceStartTime;
    private LocalDateTime serviceEndTime;
    private LocalDateTime serviceTimeRemaining;

    @ManyToOne
    @JoinColumn(name = "profile_id")
    private Profile profile;
}
