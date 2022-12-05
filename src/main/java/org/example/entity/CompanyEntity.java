package org.example.entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class CompanyEntity {
    private int id;
    private String name;
    private String address;
    private long inn;

}
