package aqsw_managment;

import aqsw_managment.Tecu_DB;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-12T14:35:02")
@StaticMetamodel(Tgate_DB.class)
public class Tgate_DB_ { 

    public static volatile SingularAttribute<Tgate_DB, String> gateFullName;
    public static volatile SingularAttribute<Tgate_DB, String> gateDateWeek;
    public static volatile SingularAttribute<Tgate_DB, Tecu_DB> tecu;
    public static volatile SingularAttribute<Tgate_DB, Integer> gateId;
    public static volatile SingularAttribute<Tgate_DB, Integer> fkGateEcuId;
    public static volatile SingularAttribute<Tgate_DB, String> gateName;
    public static volatile SingularAttribute<Tgate_DB, Date> gateDate;

}