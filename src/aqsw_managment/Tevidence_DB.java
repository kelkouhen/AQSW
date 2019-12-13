/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aqsw_managment;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author p075446
 */
@Entity
@Table(name = "tevidence")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "tevidence.findAll", query = "SELECT t FROM tevidence t")
    , @NamedQuery(name = "Tevidence.findByEvidenceId", query = "SELECT t FROM Tevidence t WHERE t.evidenceId = :evidenceId")
    , @NamedQuery(name = "Tevidence.findByEvidenceTitle", query = "SELECT t FROM Tevidence t WHERE t.evidenceTitle = :evidenceTitle")
    , @NamedQuery(name = "Tevidence.findByEvidenceDescription", query = "SELECT t FROM Tevidence t WHERE t.evidenceDescription = :evidenceDescription")
    , @NamedQuery(name = "Tevidence.findByEvidenceStatus", query = "SELECT t FROM Tevidence t WHERE t.evidenceStatus = :evidenceStatus")})
public class Tevidence_DB implements Serializable {

    @JoinTable(name = "trequirement_tevidence", joinColumns = {
        @JoinColumn(name = "pk_tevidence_evidence_id", referencedColumnName = "evidence_id")}, inverseJoinColumns = {
        @JoinColumn(name = "pk_trequirement_requirement_id", referencedColumnName = "requirement_id")})
    @ManyToMany
    private Collection<Trequirement_DB> trequirementCollection;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "evidence_id")
    private String evidenceId;
    @Column(name = "evidence_title")
    private String evidenceTitle;
    @Column(name = "evidence_description")
    private String evidenceDescription;
    @Column(name = "evidence_status")
    private String evidenceStatus;
    @OneToMany(mappedBy = "fkQuestionEvidenceId")
    private Collection<Tquestion_DB> tquestionCollection;

    public Tevidence_DB() {
    }

    public Tevidence_DB(String evidenceId) {
        this.evidenceId = evidenceId;
    }

    public String getEvidenceId() {
        return evidenceId;
    }

    public void setEvidenceId(String evidenceId) {
        this.evidenceId = evidenceId;
    }

    public String getEvidenceTitle() {
        return evidenceTitle;
    }

    public void setEvidenceTitle(String evidenceTitle) {
        this.evidenceTitle = evidenceTitle;
    }

    public String getEvidenceDescription() {
        return evidenceDescription;
    }

    public void setEvidenceDescription(String evidenceDescription) {
        this.evidenceDescription = evidenceDescription;
    }

    public String getEvidenceStatus() {
        return evidenceStatus;
    }

    public void setEvidenceStatus(String evidenceStatus) {
        this.evidenceStatus = evidenceStatus;
    }

    @XmlTransient
    public Collection<Tquestion_DB> getTquestionCollection() {
        return tquestionCollection;
    }

    public void setTquestionCollection(Collection<Tquestion_DB> tquestionCollection) {
        this.tquestionCollection = tquestionCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (evidenceId != null ? evidenceId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tevidence_DB)) {
            return false;
        }
        Tevidence_DB other = (Tevidence_DB) object;
        if ((this.evidenceId == null && other.evidenceId != null) || (this.evidenceId != null && !this.evidenceId.equals(other.evidenceId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "aqsw_managment.Tevidence[ evidenceId=" + evidenceId + " ]";
    }

    @XmlTransient
    public Collection<Trequirement_DB> getTrequirementCollection() {
        return trequirementCollection;
    }

    public void setTrequirementCollection(Collection<Trequirement_DB> trequirementCollection) {
        this.trequirementCollection = trequirementCollection;
    }
    
}
