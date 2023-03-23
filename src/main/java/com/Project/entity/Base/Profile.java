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
@Table(name = "profile")
public class Profile extends BaseEntity{

    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String password;
}
