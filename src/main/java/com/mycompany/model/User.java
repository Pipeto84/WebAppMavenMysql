/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model;

import jakarta.persistence.*;
/**
 *
 * @author felipe
 */
@Entity
@Table(name = "users")
public class User {
    
    @Id
    @Column(name = "iduser")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userid;
    @Column(name = "nameuser")
    private String username;
    @Column(name = "emailuser")
    private String useremail;
    
    public User() {
        
    }

    public User(String username, String useremail) {
        this.username = username;
        this.useremail = useremail;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail;
    }

    @Override
    public String toString() {
        return "user{" + "userid=" + userid + ", username=" + username + ", useremail=" + useremail + '}';
    }
    
}
