/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aqsw_managment;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author p075446
 */
@Entity
@Table(name = "treview")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Treview.findAll", query = "SELECT t FROM Treview t")
    , @NamedQuery(name = "Treview.findByReviewId", query = "SELECT t FROM Treview t WHERE t.reviewId = :reviewId")
    , @NamedQuery(name = "Treview.findByReviewName", query = "SELECT t FROM Treview t WHERE t.reviewName = :reviewName")
    , @NamedQuery(name = "Treview.findByReviewDate", query = "SELECT t FROM Treview t WHERE t.reviewDate = :reviewDate")
    , @NamedQuery(name = "Treview.findByReviewFullName", query = "SELECT t FROM Treview t WHERE t.reviewFullName = :reviewFullName")
    , @NamedQuery(name = "Treview.findByReviewRelatedGate", query = "SELECT t FROM Treview t WHERE t.reviewRelatedGate = :reviewRelatedGate")})
public class Treview implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "review_id")
    private Integer reviewId;
    @Column(name = "review_name")
    private String reviewName;
    @Column(name = "review_date")
    @Temporal(TemporalType.DATE)
    private Date reviewDate;
    @Column(name = "review_full_name")
    private String reviewFullName;
    @Column(name = "review_related_gate")
    private String reviewRelatedGate;
    @OneToMany(mappedBy = "fkRequirementReviewId")
    private Collection<Trequirement_DB> trequirementCollection;

    public Treview() {
    }

    public Treview(Integer reviewId) {
        this.reviewId = reviewId;
    }

    public Integer getReviewId() {
        return reviewId;
    }

    public void setReviewId(Integer reviewId) {
        this.reviewId = reviewId;
    }

    public String getReviewName() {
        return reviewName;
    }

    public void setReviewName(String reviewName) {
        this.reviewName = reviewName;
    }

    public Date getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(Date reviewDate) {
        this.reviewDate = reviewDate;
    }

    public String getReviewFullName() {
        return reviewFullName;
    }

    public void setReviewFullName(String reviewFullName) {
        this.reviewFullName = reviewFullName;
    }

    public String getReviewRelatedGate() {
        return reviewRelatedGate;
    }

    public void setReviewRelatedGate(String reviewRelatedGate) {
        this.reviewRelatedGate = reviewRelatedGate;
    }

    @XmlTransient
    public Collection<Trequirement_DB> getTrequirementCollection() {
        return trequirementCollection;
    }

    public void setTrequirementCollection(Collection<Trequirement_DB> trequirementCollection) {
        this.trequirementCollection = trequirementCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (reviewId != null ? reviewId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Treview)) {
            return false;
        }
        Treview other = (Treview) object;
        if ((this.reviewId == null && other.reviewId != null) || (this.reviewId != null && !this.reviewId.equals(other.reviewId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "aqsw_managment.Treview[ reviewId=" + reviewId + " ]";
    }
    
}
