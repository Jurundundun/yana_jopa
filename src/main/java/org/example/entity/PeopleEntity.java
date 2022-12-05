package org.example.entity;

import lombok.*;

import javax.xml.crypto.Data;

@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class PeopleEntity {
    private int id;
    private String initials;
    private Data birthDate;
    private Data startDate;
    private int positionId;
 }
