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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author p075446
 */
@Entity
@Table(name = "trequirement")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Trequirement_1.findAll", query = "SELECT t FROM Trequirement_1 t")
    , @NamedQuery(name = "Trequirement_1.findByRequirementId", query = "SELECT t FROM Trequirement_1 t WHERE t.requirementId = :requirementId")
    , @NamedQuery(name = "Trequirement_1.findByRequirementTitle", query = "SELECT t FROM Trequirement_1 t WHERE t.requirementTitle = :requirementTitle")
    , @NamedQuery(name = "Trequirement_1.findByRequirementVersionType", query = "SELECT t FROM Trequirement_1 t WHERE t.requirementVersionType = :requirementVersionType")
    , @NamedQuery(name = "Trequirement_1.findByRequirementType", query = "SELECT t FROM Trequirement_1 t WHERE t.requirementType = :requirementType")
    , @NamedQuery(name = "Trequirement_1.findByRequirementDescription", query = "SELECT t FROM Trequirement_1 t WHERE t.requirementDescription = :requirementDescription")
    , @NamedQuery(name = "Trequirement_1.findByRequirementPurpose", query = "SELECT t FROM Trequirement_1 t WHERE t.requirementPurpose = :requirementPurpose")
    , @NamedQuery(name = "Trequirement_1.findByRequirementRisk", query = "SELECT t FROM Trequirement_1 t WHERE t.requirementRisk = :requirementRisk")
    , @NamedQuery(name = "Trequirement_1.findByRequirementDomaine", query = "SELECT t FROM Trequirement_1 t WHERE t.requirementDomaine = :requirementDomaine")
    , @NamedQuery(name = "Trequirement_1.findByRequirementAsilLevel", query = "SELECT t FROM Trequirement_1 t WHERE t.requirementAsilLevel = :requirementAsilLevel")
    , @NamedQuery(name = "Trequirement_1.findByRequirementScmStatus", query = "SELECT t FROM Trequirement_1 t WHERE t.requirementScmStatus = :requirementScmStatus")
    , @NamedQuery(name = "Trequirement_1.findByRequirementScsStatus", query = "SELECT t FROM Trequirement_1 t WHERE t.requirementScsStatus = :requirementScsStatus")
    , @NamedQuery(name = "Trequirement_1.findByRequirementKarteStatus", query = "SELECT t FROM Trequirement_1 t WHERE t.requirementKarteStatus = :requirementKarteStatus")
    , @NamedQuery(name = "Trequirement_1.findByRequirementResponsible", query = "SELECT t FROM Trequirement_1 t WHERE t.requirementResponsible = :requirementResponsible")
    , @NamedQuery(name = "Trequirement_1.findByRequirementStatus", query = "SELECT t FROM Trequirement_1 t WHERE t.requirementStatus = :requirementStatus")})
public class Trequirement_DB implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "requirement_id")
    private String requirementId;
    @Column(name = "requirement_title")
    private String requirementTitle;
    @Column(name = "requirement_version_type")
    private String requirementVersionType;
    @Column(name = "requirement_type")
    private String requirementType;
    @Column(name = "requirement_description")
    private String requirementDescription;
    @Column(name = "requirement_purpose")
    private String requirementPurpose;
    @Column(name = "requirement_risk")
    private String requirementRisk;
    @Column(name = "requirement_domaine")
    private String requirementDomaine;
    @Column(name = "requirement_asil_level")
    private String requirementAsilLevel;
    @Column(name = "requirement_scm_status")
    private String requirementScmStatus;
    @Column(name = "requirement_scs_status")
    private String requirementScsStatus;
    @Column(name = "requirement_karte_status")
    private String requirementKarteStatus;
    @Column(name = "requirement_responsible")
    private String requirementResponsible;
    @Column(name = "requirement_status")
    private String requirementStatus;
    @ManyToMany(mappedBy = "trequirementCollection")
    private Collection<Tevidence_DB> tevidenceDBCollection;
    @JoinColumn(name = "fk_requirement_outcome_id", referencedColumnName = "outcome_id")
    @ManyToOne
    private Toutcome_DB fkRequirementOutcomeId;
    @JoinColumn(name = "fk_requirement_review_id", referencedColumnName = "review_id")
    @ManyToOne
    private Treview fkRequirementReviewId;

    public Trequirement_DB() {
    }

    public Trequirement_DB(String requirementId) {
        this.requirementId = requirementId;
    }

    public String getRequirementId() {
        return requirementId;
    }

    public void setRequirementId(String requirementId) {
        this.requirementId = requirementId;
    }

    public String getRequirementTitle() {
        return requirementTitle;
    }

    public void setRequirementTitle(String requirementTitle) {
        this.requirementTitle = requirementTitle;
    }

    public String getRequirementVersionType() {
        return requirementVersionType;
    }

    public void setRequirementVersionType(String requirementVersionType) {
        this.requirementVersionType = requirementVersionType;
    }

    public String getRequirementType() {
        return requirementType;
    }

    public void setRequirementType(String requirementType) {
        this.requirementType = requirementType;
    }

    public String getRequirementDescription() {
        return requirementDescription;
    }

    public void setRequirementDescription(String requirementDescription) {
        this.requirementDescription = requirementDescription;
    }

    public String getRequirementPurpose() {
        return requirementPurpose;
    }

    public void setRequirementPurpose(String requirementPurpose) {
        this.requirementPurpose = requirementPurpose;
    }

    public String getRequirementRisk() {
        return requirementRisk;
    }

    public void setRequirementRisk(String requirementRisk) {
        this.requirementRisk = requirementRisk;
    }

    public String getRequirementDomaine() {
        return requirementDomaine;
    }

    public void setRequirementDomaine(String requirementDomaine) {
        this.requirementDomaine = requirementDomaine;
    }

    public String getRequirementAsilLevel() {
        return requirementAsilLevel;
    }

    public void setRequirementAsilLevel(String requirementAsilLevel) {
        this.requirementAsilLevel = requirementAsilLevel;
    }

    public String getRequirementScmStatus() {
        return requirementScmStatus;
    }

    public void setRequirementScmStatus(String requirementScmStatus) {
        this.requirementScmStatus = requirementScmStatus;
    }

    public String getRequirementScsStatus() {
        return requirementScsStatus;
    }

    public void setRequirementScsStatus(String requirementScsStatus) {
        this.requirementScsStatus = requirementScsStatus;
    }

    public String getRequirementKarteStatus() {
        return requirementKarteStatus;
    }

    public void setRequirementKarteStatus(String requirementKarteStatus) {
        this.requirementKarteStatus = requirementKarteStatus;
    }

    public String getRequirementResponsible() {
        return requirementResponsible;
    }

    public void setRequirementResponsible(String requirementResponsible) {
        this.requirementResponsible = requirementResponsible;
    }

    public String getRequirementStatus() {
        return requirementStatus;
    }

    public void setRequirementStatus(String requirementStatus) {
        this.requirementStatus = requirementStatus;
    }

    @XmlTransient
    public Collection<Tevidence_DB> getTevidenceDBCollection() {
        return tevidenceDBCollection;
    }

    public void setTevidenceDBCollection(Collection<Tevidence_DB> tevidenceDBCollection) {
        this.tevidenceDBCollection = tevidenceDBCollection;
    }

    public Toutcome_DB getFkRequirementOutcomeId() {
        return fkRequirementOutcomeId;
    }

    public void setFkRequirementOutcomeId(Toutcome_DB fkRequirementOutcomeId) {
        this.fkRequirementOutcomeId = fkRequirementOutcomeId;
    }

    public Treview getFkRequirementReviewId() {
        return fkRequirementReviewId;
    }

    public void setFkRequirementReviewId(Treview fkRequirementReviewId) {
        this.fkRequirementReviewId = fkRequirementReviewId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (requirementId != null ? requirementId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Trequirement_DB)) {
            return false;
        }
        Trequirement_DB other = (Trequirement_DB) object;
        if ((this.requirementId == null && other.requirementId != null) || (this.requirementId != null && !this.requirementId.equals(other.requirementId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "aqsw_managment.Trequirement_1[ requirementId=" + requirementId + " ]";
    }
    
}
