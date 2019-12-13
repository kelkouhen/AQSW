/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aqsw_managment;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author p075446
 */
@Entity
@Table(name = "tquestion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tquestion.findAll", query = "SELECT t FROM Tquestion t")
    , @NamedQuery(name = "Tquestion.findByQuestionId", query = "SELECT t FROM Tquestion t WHERE t.questionId = :questionId")
    , @NamedQuery(name = "Tquestion.findByQuestionFullQuestion", query = "SELECT t FROM Tquestion t WHERE t.questionFullQuestion = :questionFullQuestion")
    , @NamedQuery(name = "Tquestion.findByQuestionNotes", query = "SELECT t FROM Tquestion t WHERE t.questionNotes = :questionNotes")
    , @NamedQuery(name = "Tquestion.findByQuestionStatus", query = "SELECT t FROM Tquestion t WHERE t.questionStatus = :questionStatus")})
public class Tquestion_DB implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "question_id")
    private String questionId;
    @Column(name = "question_full_question")
    private String questionFullQuestion;
    @Column(name = "question_notes")
    private String questionNotes;
    @Column(name = "question_status")
    private String questionStatus;
    @JoinColumn(name = "fk_question_evidence_id", referencedColumnName = "evidence_id")
    @ManyToOne
    private Tevidence_DB fkQuestionEvidenceId;

    public Tquestion_DB() {
    }

    public Tquestion_DB(String questionId, String questionFullName, String questionNote, String questionSt) {
        this.questionId = questionId;
        this.questionFullQuestion = questionFullName;
        this.questionNotes = questionNote;
        this.questionStatus = questionSt;
    }
    
    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    public String getQuestionFullQuestion() {
        return questionFullQuestion;
    }

    public void setQuestionFullQuestion(String questionFullQuestion) {
        this.questionFullQuestion = questionFullQuestion;
    }

    public String getQuestionNotes() {
        return questionNotes;
    }

    public void setQuestionNotes(String questionNotes) {
        this.questionNotes = questionNotes;
    }

    public String getQuestionStatus() {
        return questionStatus;
    }

    public void setQuestionStatus(String questionStatus) {
        this.questionStatus = questionStatus;
    }

    public Tevidence_DB getFkQuestionEvidenceId() {
        return fkQuestionEvidenceId;
    }

    public void setFkQuestionEvidenceId(Tevidence_DB fkQuestionEvidenceId) {
        this.fkQuestionEvidenceId = fkQuestionEvidenceId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (questionId != null ? questionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tquestion_DB)) {
            return false;
        }
        Tquestion_DB other = (Tquestion_DB) object;
        if ((this.questionId == null && other.questionId != null) || (this.questionId != null && !this.questionId.equals(other.questionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "aqsw_managment.Tquestion[ questionId=" + questionId + " ]";
    }
    
}
