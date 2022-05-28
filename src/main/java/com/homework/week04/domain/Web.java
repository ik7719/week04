package com.homework.week04.domain;

import lombok.Getter;
import org.springframework.web.bind.annotation.RequestBody;

import javax.persistence.*;

@Entity
@Getter
public class Web
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String nickname;

    @Column(nullable = false)
    private String password;

    public boolean checkPassword(WebRequestDto webRequestDto)
    {
        password.equals(WebRequestDto.getPassword(webRequestDto));
        return true;
    }
}
