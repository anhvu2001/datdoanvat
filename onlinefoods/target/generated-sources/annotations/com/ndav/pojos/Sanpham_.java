package com.ndav.pojos;

import com.ndav.pojos.Loaisanpham;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-10-21T13:27:33")
@StaticMetamodel(Sanpham.class)
public class Sanpham_ { 

    public static volatile SingularAttribute<Sanpham, Long> giaSp;
    public static volatile SingularAttribute<Sanpham, Date> ngaytao;
    public static volatile SingularAttribute<Sanpham, Date> ngaycapnhat;
    public static volatile SingularAttribute<Sanpham, Integer> khoiluong;
    public static volatile SingularAttribute<Sanpham, Boolean> active;
    public static volatile SingularAttribute<Sanpham, String> tensanpham;
    public static volatile SingularAttribute<Sanpham, String> anh;
    public static volatile SingularAttribute<Sanpham, Integer> id;
    public static volatile SingularAttribute<Sanpham, Loaisanpham> loaisanpham;
    public static volatile SingularAttribute<Sanpham, String> mota;

}