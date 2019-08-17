package com.sw.entity;

//使用lombok类的setter和getter注解生成
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Setter
@Getter
@Table(name = "department")
public class Department implements Serializable{
    private static final long serialVersionUID = 825091247339658239L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  String name;

    public Department() {}

}
