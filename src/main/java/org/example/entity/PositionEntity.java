package org.example.entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class PositionEntity {
    private int id;
    private String name;
    private double salary;
    private int companyId;
}
