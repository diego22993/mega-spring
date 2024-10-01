package com.diegola.springboot.app.models;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Customer {
    private Integer id;
    private String name;
    private String telphone;
    private String email;
    private String address;
}
