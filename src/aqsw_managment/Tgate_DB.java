/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aqsw_managment;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author p075446
 */
@Entity
@Table(name = "tgate")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tgate.findAll", query = "SELECT t FROM Tgate t")
    , @NamedQuery(name = "Tgate.findByGateId", query = "SELECT t FROM Tgate t WHERE t.gateId = :gateId")
    , @NamedQuery(name = "Tgate.findByGateName", query = "SELECT t FROM Tgate t WHERE t.gateName = :gateName")
    , @NamedQuery(name = "Tgate.findByGateFullName", query = "SELECT t FROM Tgate t WHERE t.gateFullName = :gateFullName")
    , @NamedQuery(name = "Tgate.findByGateDate", query = "SELECT t FROM Tgate t WHERE t.gateDate = :gateDate")
    , @NamedQuery(name = "Tgate.findByGateDateWeek", query = "SELECT t FROM Tgate t WHERE t.gateDateWeek = :gateDateWeek")
    , @NamedQuery(name = "Tgate.findByFkGateEcuId", query = "SELECT t FROM Tgate t WHERE t.fkGateEcuId = :fkGateEcuId")})
public class Tgate_DB implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "gate_id")
    private Integer gateId;
    @Column(name = "gate_name")
    private String gateName;
    @Column(name = "gate_full_name")
    private String gateFullName;
    @Column(name = "gate_date")
    @Temporal(TemporalType.DATE)
    private Date gateDate;
    @Column(name = "gate_date_week")
    private String gateDateWeek;
    @Column(name = "fk_gate_ecu_id")
    private Integer fkGateEcuId;
    @JoinColumn(name = "gate_id", referencedColumnName = "ecu_id", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Tecu_DB tecu;

    public Tgate_DB() {
    }

    public Tgate_DB(Integer gateId) {
        this.gateId = gateId;
    }

    public Integer getGateId() {
        return gateId;
    }

    public void setGateId(Integer gateId) {
        this.gateId = gateId;
    }

    public String getGateName() {
        return gateName;
    }

    public void setGateName(String gateName) {
        this.gateName = gateName;
    }

    public String getGateFullName() {
        return gateFullName;
    }

    public void setGateFullName(String gateFullName) {
        this.gateFullName = gateFullName;
    }

    public Date getGateDate() {
        return gateDate;
    }

    public void setGateDate(Date gateDate) {
        this.gateDate = gateDate;
    }

    public String getGateDateWeek() {
        return gateDateWeek;
    }

    public void setGateDateWeek(String gateDateWeek) {
        this.gateDateWeek = gateDateWeek;
    }

    public Integer getFkGateEcuId() {
        return fkGateEcuId;
    }

    public void setFkGateEcuId(Integer fkGateEcuId) {
        this.fkGateEcuId = fkGateEcuId;
    }

    public Tecu_DB getTecu() {
        return tecu;
    }

    public void setTecu(Tecu_DB tecu) {
        this.tecu = tecu;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (gateId != null ? gateId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tgate_DB)) {
            return false;
        }
        Tgate_DB other = (Tgate_DB) object;
        if ((this.gateId == null && other.gateId != null) || (this.gateId != null && !this.gateId.equals(other.gateId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "aqsw_managment.Tgate[ gateId=" + gateId + " ]";
    }
    
}
