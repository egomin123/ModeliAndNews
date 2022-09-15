package Practika2.ModeliAndNews.Models;

import javax.persistence.*;
import java.util.Set;

@Entity
//@Table(name = "user_table")
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String login;
    private String password;
    private boolean active;


    //    @ElementCollection(targetClass = Role.class, fetch = FetchType.EAGER)
//    @CollectionTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"))
//    @Enumerated(EnumType.STRING)
//    private Set<Role> roles;

    @ElementCollection(targetClass = Role.class, fetch = FetchType.EAGER)
    @CollectionTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"))
    @Enumerated(EnumType.STRING)
    private Set<Role> roles;

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }


}







































//    @ElementCollection(targetClass = Role.class, fetch = FetchType.EAGER)
//    @CollectionTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"))
//    @Enumerated(EnumType.STRING)
//    private Set<Role> roles;


    //    public User(long id, String login, String password, boolean active, Set<Role> roles) {
    //        this.id = id;
    //        this.login = login;
    //        this.password = password;
    //        this.active = active;
    //        this.roles = roles;
    //    }

    //    public User(){
    //    }

    //    public long getId() {
    //        return id;
    //    }
    //
    //    public void setId(long id) {
    //        this.id = id;
    //    }
    //
    //    public String getLogin() {
    //        return login;
    //    }
    //
    //    public void setLogin(String login) {
    //        this.login = login;
    //    }
    //
    //    public String getPassword() {
    //        return password;
    //    }
    //
    //    public void setPassword(String password) {
    //        this.password = password;
    //    }
    //
    //    public boolean isActive() {
    //        return active;
    //    }
    //
    //    public void setActive(boolean active) {
    //        this.active = active;
    //    }
    //
    //    public Set<Role> getRoles() {
    //        return roles;
    //    }
    //
    //    public void setRoles(Set<Role> roles) {
    //        this.roles = roles;
    //    }





