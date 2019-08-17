package com.sw.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Setter
@Getter
@Table(name = "user")
public class User implements Serializable {
    private static final long serialVersionUID = 3821821461407041423L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "用户名")
    private String name;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createDate;

//    定义它（用户）与部门Department的多对一（多个用户对应一个部门）关系
    @ManyToOne
//    在数据库表中用字段did来表示部门的id
    @JoinColumn(name = "did")
//    防止关系对象的递归访问错误
    @JsonBackReference
    private Department department;

//    多对多关系，cascade：级联为空；FetchType.EAGER,急加载，实体数据从数据库直接加载
    @ManyToMany(cascade = {},fetch = FetchType.EAGER)
    @JoinTable(name = "user_role",
        joinColumns = {@JoinColumn(name = "user_id")},
            inverseJoinColumns = {@JoinColumn(name = "role_id")}
    )
    private List<Role> roles;

    public User() {}
}
