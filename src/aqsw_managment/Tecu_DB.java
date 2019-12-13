/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aqsw_managment;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author p075446
 */
@Entity
@Table(name = "tecu")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tecu.findAll", query = "SELECT t FROM Tecu t")
    , @NamedQuery(name = "Tecu.findByEcuId", query = "SELECT t FROM Tecu t WHERE t.ecuId = :ecuId")
    , @NamedQuery(name = "Tecu.findByEcuName", query = "SELECT t FROM Tecu t WHERE t.ecuName = :ecuName")
    , @NamedQuery(name = "Tecu.findByEcuSupplierName", query = "SELECT t FROM Tecu t WHERE t.ecuSupplierName = :ecuSupplierName")
    , @NamedQuery(name = "Tecu.findByEcuAsilLevel", query = "SELECT t FROM Tecu t WHERE t.ecuAsilLevel = :ecuAsilLevel")
    , @NamedQuery(name = "Tecu.findByEcuSsrStatus", query = "SELECT t FROM Tecu t WHERE t.ecuSsrStatus = :ecuSsrStatus")
    , @NamedQuery(name = "Tecu.findByEcuIssrStatus", query = "SELECT t FROM Tecu t WHERE t.ecuIssrStatus = :ecuIssrStatus")
    , @NamedQuery(name = "Tecu.findByEcuEqmDecisionalStatus", query = "SELECT t FROM Tecu t WHERE t.ecuEqmDecisionalStatus = :ecuEqmDecisionalStatus")
    , @NamedQuery(name = "Tecu.findByEcuHwCoca", query = "SELECT t FROM Tecu t WHERE t.ecuHwCoca = :ecuHwCoca")
    , @NamedQuery(name = "Tecu.findByEcuSwCoca", query = "SELECT t FROM Tecu t WHERE t.ecuSwCoca = :ecuSwCoca")
    , @NamedQuery(name = "Tecu.findByEcuNetwork", query = "SELECT t FROM Tecu t WHERE t.ecuNetwork = :ecuNetwork")
    , @NamedQuery(name = "Tecu.findByEcuSqa", query = "SELECT t FROM Tecu t WHERE t.ecuSqa = :ecuSqa")
    , @NamedQuery(name = "Tecu.findByEcuFullName", query = "SELECT t FROM Tecu t WHERE t.ecuFullName = :ecuFullName")
    , @NamedQuery(name = "Tecu.findByEcuIsqa", query = "SELECT t FROM Tecu t WHERE t.ecuIsqa = :ecuIsqa")
    , @NamedQuery(name = "Tecu.findByEcuDomaine", query = "SELECT t FROM Tecu t WHERE t.ecuDomaine = :ecuDomaine")
    , @NamedQuery(name = "Tecu.findByEcuBoxType", query = "SELECT t FROM Tecu t WHERE t.ecuBoxType = :ecuBoxType")})
public class Tecu_DB implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ecu_id")
    private Integer ecuId;
    @Column(name = "ecu_name")
    private String ecuName;
    @Column(name = "ecu_supplier_name")
    private String ecuSupplierName;
    @Column(name = "ecu_asil_level")
    private String ecuAsilLevel;
    @Column(name = "ecu_ssr_status")
    private String ecuSsrStatus;
    @Column(name = "ecu_issr_status")
    private String ecuIssrStatus;
    @Column(name = "ecu_eqm_decisional_status")
    private String ecuEqmDecisionalStatus;
    @Column(name = "ecu_hw_coca")
    private String ecuHwCoca;
    @Column(name = "ecu_sw_coca")
    private String ecuSwCoca;
    @Column(name = "ecu_network")
    private String ecuNetwork;
    @Column(name = "ecu_sqa")
    private String ecuSqa;
    @Column(name = "ecu_full_name")
    private String ecuFullName;
    @Column(name = "ecu_isqa")
    private String ecuIsqa;
    @Column(name = "ecu_domaine")
    private String ecuDomaine;
    @Column(name = "ecu_box_type")
    private String ecuBoxType;
    @JoinColumn(name = "fk_ecu_project_id", referencedColumnName = "project_id")
    @ManyToOne
    private Tproject_DB fkEcuProjectId;
    @OneToMany(mappedBy = "fkOutcomeEcuId")
    private Collection<Toutcome_DB> toutcomeCollection;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "tecu")
    private Tgate_DB tgate;

    public Tecu_DB() {
    }

    public Tecu_DB(Integer ecuId) {
        this.ecuId = ecuId;
    }

    public Integer getEcuId() {
        return ecuId;
    }

    public void setEcuId(Integer ecuId) {
        this.ecuId = ecuId;
    }

    public String getEcuName() {
        return ecuName;
    }

    public void setEcuName(String ecuName) {
        this.ecuName = ecuName;
    }

    public String getEcuSupplierName() {
        return ecuSupplierName;
    }

    public void setEcuSupplierName(String ecuSupplierName) {
        this.ecuSupplierName = ecuSupplierName;
    }

    public String getEcuAsilLevel() {
        return ecuAsilLevel;
    }

    public void setEcuAsilLevel(String ecuAsilLevel) {
        this.ecuAsilLevel = ecuAsilLevel;
    }

    public String getEcuSsrStatus() {
        return ecuSsrStatus;
    }

    public void setEcuSsrStatus(String ecuSsrStatus) {
        this.ecuSsrStatus = ecuSsrStatus;
    }

    public String getEcuIssrStatus() {
        return ecuIssrStatus;
    }

    public void setEcuIssrStatus(String ecuIssrStatus) {
        this.ecuIssrStatus = ecuIssrStatus;
    }

    public String getEcuEqmDecisionalStatus() {
        return ecuEqmDecisionalStatus;
    }

    public void setEcuEqmDecisionalStatus(String ecuEqmDecisionalStatus) {
        this.ecuEqmDecisionalStatus = ecuEqmDecisionalStatus;
    }

    public String getEcuHwCoca() {
        return ecuHwCoca;
    }

    public void setEcuHwCoca(String ecuHwCoca) {
        this.ecuHwCoca = ecuHwCoca;
    }

    public String getEcuSwCoca() {
        return ecuSwCoca;
    }

    public void setEcuSwCoca(String ecuSwCoca) {
        this.ecuSwCoca = ecuSwCoca;
    }

    public String getEcuNetwork() {
        return ecuNetwork;
    }

    public void setEcuNetwork(String ecuNetwork) {
        this.ecuNetwork = ecuNetwork;
    }

    public String getEcuSqa() {
        return ecuSqa;
    }

    public void setEcuSqa(String ecuSqa) {
        this.ecuSqa = ecuSqa;
    }

    public String getEcuFullName() {
        return ecuFullName;
    }

    public void setEcuFullName(String ecuFullName) {
        this.ecuFullName = ecuFullName;
    }

    public String getEcuIsqa() {
        return ecuIsqa;
    }

    public void setEcuIsqa(String ecuIsqa) {
        this.ecuIsqa = ecuIsqa;
    }

    public String getEcuDomaine() {
        return ecuDomaine;
    }

    public void setEcuDomaine(String ecuDomaine) {
        this.ecuDomaine = ecuDomaine;
    }

    public String getEcuBoxType() {
        return ecuBoxType;
    }

    public void setEcuBoxType(String ecuBoxType) {
        this.ecuBoxType = ecuBoxType;
    }

    public Tproject_DB getFkEcuProjectId() {
        return fkEcuProjectId;
    }

    public void setFkEcuProjectId(Tproject_DB fkEcuProjectId) {
        this.fkEcuProjectId = fkEcuProjectId;
    }

    @XmlTransient
    public Collection<Toutcome_DB> getToutcomeCollection() {
        return toutcomeCollection;
    }

    public void setToutcomeCollection(Collection<Toutcome_DB> toutcomeCollection) {
        this.toutcomeCollection = toutcomeCollection;
    }

    public Tgate_DB getTgate() {
        return tgate;
    }

    public void setTgate(Tgate_DB tgate) {
        this.tgate = tgate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ecuId != null ? ecuId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tecu_DB)) {
            return false;
        }
        Tecu_DB other = (Tecu_DB) object;
        if ((this.ecuId == null && other.ecuId != null) || (this.ecuId != null && !this.ecuId.equals(other.ecuId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "aqsw_managment.Tecu[ ecuId=" + ecuId + " ]";
    }
    
}
