package com.homework.week04.domain;

import javax.persistence.*;

@Entity
public class Web
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String nickname;

    @Column(nullable = false)
    private String password;
}
