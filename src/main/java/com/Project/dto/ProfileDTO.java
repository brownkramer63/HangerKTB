package com.Project.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProfileDTO {

    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String password;
}
