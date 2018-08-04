package com.dan.springJdbc.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Data
public class MemoGroup {
    private Integer id;

    private String name;

    private Date createdTime;

    private Date modifyTime;
}
