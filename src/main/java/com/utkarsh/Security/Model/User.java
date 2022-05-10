package com.utkarsh.Security.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
     @Column(nullable = false,updatable = false)
    private String userid;
    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private String password;
    private String profileImgUrl;
    private Date lastLoginDate;
    private Date lastLoginDateDisplay;
    private String[] roles; // Role.admin, Role.user.......
    private String[] authorities; // roles authorities such as User Role{Read, Write authorities}
    private boolean isActive;
    private boolean isNotLocked;



}
