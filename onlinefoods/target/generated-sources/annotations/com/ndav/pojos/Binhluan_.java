package com.ndav.pojos;

import com.ndav.pojos.Sanpham;
import com.ndav.pojos.User;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-10-21T13:27:33")
@StaticMetamodel(Binhluan.class)
public class Binhluan_ { 

    public static volatile SingularAttribute<Binhluan, Date> ngaybinhluan;
    public static volatile SingularAttribute<Binhluan, User> nguoibinhluan;
    public static volatile SingularAttribute<Binhluan, Integer> id;
    public static volatile SingularAttribute<Binhluan, String> noidung;
    public static volatile SingularAttribute<Binhluan, Sanpham> sanphamid;

}