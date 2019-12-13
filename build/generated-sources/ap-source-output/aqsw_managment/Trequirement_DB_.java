package aqsw_managment;

import aqsw_managment.Tevidence_DB;
import aqsw_managment.Toutcome_DB;
import aqsw_managment.Treview;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-12T14:35:02")
@StaticMetamodel(Trequirement_DB.class)
public class Trequirement_DB_ { 

    public static volatile SingularAttribute<Trequirement_DB, String> requirementRisk;
    public static volatile SingularAttribute<Trequirement_DB, String> requirementScmStatus;
    public static volatile SingularAttribute<Trequirement_DB, String> requirementDescription;
    public static volatile SingularAttribute<Trequirement_DB, String> requirementAsilLevel;
    public static volatile SingularAttribute<Trequirement_DB, String> requirementDomaine;
    public static volatile SingularAttribute<Trequirement_DB, String> requirementResponsible;
    public static volatile SingularAttribute<Trequirement_DB, String> requirementType;
    public static volatile SingularAttribute<Trequirement_DB, String> requirementKarteStatus;
    public static volatile SingularAttribute<Trequirement_DB, String> requirementPurpose;
    public static volatile SingularAttribute<Trequirement_DB, Toutcome_DB> fkRequirementOutcomeId;
    public static volatile SingularAttribute<Trequirement_DB, String> requirementTitle;
    public static volatile SingularAttribute<Trequirement_DB, String> requirementScsStatus;
    public static volatile SingularAttribute<Trequirement_DB, Treview> fkRequirementReviewId;
    public static volatile SingularAttribute<Trequirement_DB, String> requirementId;
    public static volatile SingularAttribute<Trequirement_DB, String> requirementStatus;
    public static volatile CollectionAttribute<Trequirement_DB, Tevidence_DB> tevidenceDBCollection;
    public static volatile SingularAttribute<Trequirement_DB, String> requirementVersionType;

}