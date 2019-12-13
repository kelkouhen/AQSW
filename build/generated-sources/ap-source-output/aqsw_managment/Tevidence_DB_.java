package aqsw_managment;

import aqsw_managment.Tquestion_DB;
import aqsw_managment.Trequirement_DB;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-12T14:35:02")
@StaticMetamodel(Tevidence_DB.class)
public class Tevidence_DB_ { 

    public static volatile CollectionAttribute<Tevidence_DB, Tquestion_DB> tquestionCollection;
    public static volatile SingularAttribute<Tevidence_DB, String> evidenceTitle;
    public static volatile SingularAttribute<Tevidence_DB, String> evidenceId;
    public static volatile SingularAttribute<Tevidence_DB, String> evidenceDescription;
    public static volatile SingularAttribute<Tevidence_DB, String> evidenceStatus;
    public static volatile CollectionAttribute<Tevidence_DB, Trequirement_DB> trequirementCollection;

}