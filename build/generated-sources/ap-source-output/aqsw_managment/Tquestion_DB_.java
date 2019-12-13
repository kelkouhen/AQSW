package aqsw_managment;

import aqsw_managment.Tevidence_DB;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-12T14:35:02")
@StaticMetamodel(Tquestion_DB.class)
public class Tquestion_DB_ { 

    public static volatile SingularAttribute<Tquestion_DB, String> questionFullQuestion;
    public static volatile SingularAttribute<Tquestion_DB, String> questionId;
    public static volatile SingularAttribute<Tquestion_DB, Tevidence_DB> fkQuestionEvidenceId;
    public static volatile SingularAttribute<Tquestion_DB, String> questionStatus;
    public static volatile SingularAttribute<Tquestion_DB, String> questionNotes;

}