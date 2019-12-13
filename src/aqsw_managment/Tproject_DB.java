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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "tproject")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tproject.findAll", query = "SELECT t FROM Tproject t")
    , @NamedQuery(name = "Tproject.findByProjectId", query = "SELECT t FROM Tproject t WHERE t.projectId = :projectId")
    , @NamedQuery(name = "Tproject.findByProjectName", query = "SELECT t FROM Tproject t WHERE t.projectName = :projectName")
    , @NamedQuery(name = "Tproject.findByProjectArchitecture", query = "SELECT t FROM Tproject t WHERE t.projectArchitecture = :projectArchitecture")
    , @NamedQuery(name = "Tproject.findByProjectrelatedMilestone", query = "SELECT t FROM Tproject t WHERE t.projectrelatedMilestone = :projectrelatedMilestone")
    , @NamedQuery(name = "Tproject.findByProjectDecisionalStatus", query = "SELECT t FROM Tproject t WHERE t.projectDecisionalStatus = :projectDecisionalStatus")
    , @NamedQuery(name = "Tproject.findByFkProjectEcuId", query = "SELECT t FROM Tproject t WHERE t.fkProjectEcuId = :fkProjectEcuId")})
public class Tproject_DB implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "project_id")
    private Integer projectId;
    @Basic(optional = false)
    @Column(name = "project_name")
    private String projectName;
    @Column(name = "project_architecture")
    private String projectArchitecture;
    @Column(name = "project_relatedMilestone")
    private String projectrelatedMilestone;
    @Column(name = "project_decisional_status")
    private String projectDecisionalStatus;
    @Basic(optional = false)
    @Column(name = "fk_project_ecu_id")
    private int fkProjectEcuId;
    @OneToMany(mappedBy = "fkEcuProjectId")
    private Collection<Tecu_DB> tecuCollection;

    public Tproject_DB() {
    }

    public Tproject_DB(Integer projectId) {
        this.projectId = projectId;
    }

    public Tproject_DB(Integer projectId, String projectName, int fkProjectEcuId) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.fkProjectEcuId = fkProjectEcuId;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectArchitecture() {
        return projectArchitecture;
    }

    public void setProjectArchitecture(String projectArchitecture) {
        this.projectArchitecture = projectArchitecture;
    }

    public String getProjectrelatedMilestone() {
        return projectrelatedMilestone;
    }

    public void setProjectrelatedMilestone(String projectrelatedMilestone) {
        this.projectrelatedMilestone = projectrelatedMilestone;
    }

    public String getProjectDecisionalStatus() {
        return projectDecisionalStatus;
    }

    public void setProjectDecisionalStatus(String projectDecisionalStatus) {
        this.projectDecisionalStatus = projectDecisionalStatus;
    }

    public int getFkProjectEcuId() {
        return fkProjectEcuId;
    }

    public void setFkProjectEcuId(int fkProjectEcuId) {
        this.fkProjectEcuId = fkProjectEcuId;
    }

    @XmlTransient
    public Collection<Tecu_DB> getTecuCollection() {
        return tecuCollection;
    }

    public void setTecuCollection(Collection<Tecu_DB> tecuCollection) {
        this.tecuCollection = tecuCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (projectId != null ? projectId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tproject_DB)) {
            return false;
        }
        Tproject_DB other = (Tproject_DB) object;
        if ((this.projectId == null && other.projectId != null) || (this.projectId != null && !this.projectId.equals(other.projectId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "aqsw_managment.Tproject[ projectId=" + projectId + " ]";
    }
    
}
