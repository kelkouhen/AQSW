package aqsw_managment;

import aqsw_managment.Tecu_DB;
import aqsw_managment.Trequirement_DB;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-12T14:35:02")
@StaticMetamodel(Toutcome_DB.class)
public class Toutcome_DB_ { 

    public static volatile SingularAttribute<Toutcome_DB, Tecu_DB> fkOutcomeEcuId;
    public static volatile SingularAttribute<Toutcome_DB, String> outcomeName;
    public static volatile SingularAttribute<Toutcome_DB, String> outcomeStatus;
    public static volatile SingularAttribute<Toutcome_DB, String> outcomeId;
    public static volatile CollectionAttribute<Toutcome_DB, Trequirement_DB> trequirementCollection;

}