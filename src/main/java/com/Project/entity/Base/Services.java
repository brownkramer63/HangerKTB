package com.Project.entity.Base;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "services")
public class Services extends BaseEntity{

    private String serviceName;
    private String serviceDuration;
    private String servicePrice;
    private String serviceStartTime;
    private String serviceEndTime;
    private String serviceTimeRemaining;
}
