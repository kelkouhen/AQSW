package aqsw_managment;

import aqsw_managment.Tgate_DB;
import aqsw_managment.Toutcome_DB;
import aqsw_managment.Tproject_DB;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-12T14:35:02")
@StaticMetamodel(Tecu_DB.class)
public class Tecu_DB_ { 

    public static volatile SingularAttribute<Tecu_DB, String> ecuNetwork;
    public static volatile SingularAttribute<Tecu_DB, Tproject_DB> fkEcuProjectId;
    public static volatile SingularAttribute<Tecu_DB, String> ecuFullName;
    public static volatile SingularAttribute<Tecu_DB, String> ecuSsrStatus;
    public static volatile SingularAttribute<Tecu_DB, String> ecuHwCoca;
    public static volatile SingularAttribute<Tecu_DB, String> ecuIsqa;
    public static volatile SingularAttribute<Tecu_DB, String> ecuIssrStatus;
    public static volatile SingularAttribute<Tecu_DB, Integer> ecuId;
    public static volatile SingularAttribute<Tecu_DB, String> ecuBoxType;
    public static volatile SingularAttribute<Tecu_DB, Tgate_DB> tgate;
    public static volatile CollectionAttribute<Tecu_DB, Toutcome_DB> toutcomeCollection;
    public static volatile SingularAttribute<Tecu_DB, String> ecuAsilLevel;
    public static volatile SingularAttribute<Tecu_DB, String> ecuSqa;
    public static volatile SingularAttribute<Tecu_DB, String> ecuDomaine;
    public static volatile SingularAttribute<Tecu_DB, String> ecuSupplierName;
    public static volatile SingularAttribute<Tecu_DB, String> ecuEqmDecisionalStatus;
    public static volatile SingularAttribute<Tecu_DB, String> ecuName;
    public static volatile SingularAttribute<Tecu_DB, String> ecuSwCoca;

}