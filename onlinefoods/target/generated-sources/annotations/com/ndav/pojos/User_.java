package com.ndav.pojos;

import com.ndav.pojos.Binhluan;
import com.ndav.pojos.Donhang;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-10-21T13:27:33")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, String> lastName;
    public static volatile SetAttribute<User, Donhang> donhangSet;
    public static volatile SingularAttribute<User, String> avatar;
    public static volatile SingularAttribute<User, Boolean> isActive;
    public static volatile SingularAttribute<User, String> sodienthoai;
    public static volatile SingularAttribute<User, String> firstName;
    public static volatile SingularAttribute<User, String> diachi;
    public static volatile SingularAttribute<User, String> password;
    public static volatile SetAttribute<User, Binhluan> binhluanSet;
    public static volatile SingularAttribute<User, Integer> id;
    public static volatile SingularAttribute<User, String> userRole;
    public static volatile SingularAttribute<User, String> email;
    public static volatile SingularAttribute<User, String> username;

}