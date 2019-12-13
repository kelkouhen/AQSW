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
import javax.persistence.ManyToOne;
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
@Table(name = "toutcome")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Toutcome.findAll", query = "SELECT t FROM Toutcome t")
    , @NamedQuery(name = "Toutcome.findByOutcomeId", query = "SELECT t FROM Toutcome t WHERE t.outcomeId = :outcomeId")
    , @NamedQuery(name = "Toutcome.findByOutcomeName", query = "SELECT t FROM Toutcome t WHERE t.outcomeName = :outcomeName")
    , @NamedQuery(name = "Toutcome.findByOutcomeStatus", query = "SELECT t FROM Toutcome t WHERE t.outcomeStatus = :outcomeStatus")})
public class Toutcome_DB implements Serializable {

    @OneToMany(mappedBy = "fkRequirementOutcomeId")
    private Collection<Trequirement_DB> trequirementCollection;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "outcome_id")
    private String outcomeId;
    @Column(name = "outcome_name")
    private String outcomeName;
    @Column(name = "outcome_status")
    private String outcomeStatus;
    @JoinColumn(name = "fk_outcome_ecu_id", referencedColumnName = "ecu_id")
    @ManyToOne
    private Tecu_DB fkOutcomeEcuId;

    public Toutcome_DB() {
    }

    public Toutcome_DB(String outcomeId) {
        this.outcomeId = outcomeId;
    }

    public String getOutcomeId() {
        return outcomeId;
    }

    public void setOutcomeId(String outcomeId) {
        this.outcomeId = outcomeId;
    }

    public String getOutcomeName() {
        return outcomeName;
    }

    public void setOutcomeName(String outcomeName) {
        this.outcomeName = outcomeName;
    }

    public String getOutcomeStatus() {
        return outcomeStatus;
    }

    public void setOutcomeStatus(String outcomeStatus) {
        this.outcomeStatus = outcomeStatus;
    }

    public Tecu_DB getFkOutcomeEcuId() {
        return fkOutcomeEcuId;
    }

    public void setFkOutcomeEcuId(Tecu_DB fkOutcomeEcuId) {
        this.fkOutcomeEcuId = fkOutcomeEcuId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (outcomeId != null ? outcomeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Toutcome_DB)) {
            return false;
        }
        Toutcome_DB other = (Toutcome_DB) object;
        if ((this.outcomeId == null && other.outcomeId != null) || (this.outcomeId != null && !this.outcomeId.equals(other.outcomeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "aqsw_managment.Toutcome[ outcomeId=" + outcomeId + " ]";
    }

    @XmlTransient
    public Collection<Trequirement_DB> getTrequirementCollection() {
        return trequirementCollection;
    }

    public void setTrequirementCollection(Collection<Trequirement_DB> trequirementCollection) {
        this.trequirementCollection = trequirementCollection;
    }
    
}
