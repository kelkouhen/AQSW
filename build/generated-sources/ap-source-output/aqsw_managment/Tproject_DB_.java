package aqsw_managment;

import aqsw_managment.Tecu_DB;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-12T14:35:02")
@StaticMetamodel(Tproject_DB.class)
public class Tproject_DB_ { 

    public static volatile CollectionAttribute<Tproject_DB, Tecu_DB> tecuCollection;
    public static volatile SingularAttribute<Tproject_DB, String> projectDecisionalStatus;
    public static volatile SingularAttribute<Tproject_DB, String> projectrelatedMilestone;
    public static volatile SingularAttribute<Tproject_DB, Integer> fkProjectEcuId;
    public static volatile SingularAttribute<Tproject_DB, String> projectArchitecture;
    public static volatile SingularAttribute<Tproject_DB, String> projectName;
    public static volatile SingularAttribute<Tproject_DB, Integer> projectId;

}