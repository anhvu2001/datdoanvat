package com.ndav.pojos;

import com.ndav.pojos.Donhang;
import com.ndav.pojos.Sanpham;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-10-21T13:27:33")
@StaticMetamodel(Chitietdh.class)
public class Chitietdh_ { 

    public static volatile SingularAttribute<Chitietdh, Long> tongtienSp;
    public static volatile SingularAttribute<Chitietdh, Boolean> active;
    public static volatile SingularAttribute<Chitietdh, Integer> id;
    public static volatile SingularAttribute<Chitietdh, Integer> soluong;
    public static volatile SingularAttribute<Chitietdh, Sanpham> sanphamid;
    public static volatile SingularAttribute<Chitietdh, Donhang> donhangid;

}