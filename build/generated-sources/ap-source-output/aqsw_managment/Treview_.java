package aqsw_managment;

import aqsw_managment.Trequirement_DB;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-12T14:35:02")
@StaticMetamodel(Treview.class)
public class Treview_ { 

    public static volatile SingularAttribute<Treview, String> reviewRelatedGate;
    public static volatile SingularAttribute<Treview, Date> reviewDate;
    public static volatile SingularAttribute<Treview, String> reviewFullName;
    public static volatile SingularAttribute<Treview, String> reviewName;
    public static volatile SingularAttribute<Treview, Integer> reviewId;
    public static volatile CollectionAttribute<Treview, Trequirement_DB> trequirementCollection;

}