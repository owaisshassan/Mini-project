package com.owaiss.dto;

import lombok.*;
import com.owaiss.model.*;

import java.util.Set;

import java.util.HashSet;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserResponseDTO {

    private Integer id;

    private String name;

    private String mobileNumber;

    private String email;

    private Set<Address> address = new HashSet<>();

    private Cart cart;

}
