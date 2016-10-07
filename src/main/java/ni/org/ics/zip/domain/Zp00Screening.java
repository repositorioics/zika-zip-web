package ni.org.ics.zip.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by FIRSTICT on 10/6/2016.
 * V1.0
 */
@Entity
@Table(name = "zp00_screening", catalog = "zika_zip")
public class Zp00Screening {

    String recordId;
    String numScreening;
    Date scrVisitDate;
    String scrRemain;
    Integer scrAge;
    Boolean scrAge15;
    String scrPregnant;
    Integer scrPreWeeks;
    Integer scrPreDays;
    Boolean scrPregant13;
    Boolean scrZikaOther;
    Boolean scrMeetCriteria;
    Boolean scrConsentObta;
    String scrObDobDay;
    String scrObDobMon;
    Integer scrObDobYear;
    Integer scrObAge;
    String scrObAssent;
    String scrConsentA;
    String scrConsentB;
    String scrConsentC;
    String scrConsentD;
    String scrConsentE;
    String scrConsentF;
    String scrPreviousZip;
    String scrPreviousStudyId;
    Boolean scrPreStudyNa;
    String scrReasonNot;
    String scrReasonOther;
    String scrIdCompleting;
    Date scrDateCompleted;
    String scrIdReviewer;
    Date scrDateReviewed;
    String scrIdDataEntry;
    Date scrDateEntered;

    @Id
    @Column(name = "record_id", nullable = false)
    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    @Column(name = "num_screening", nullable = false)
    public String getNumScreening() {
        return numScreening;
    }

    public void setNumScreening(String numScreening) {
        this.numScreening = numScreening;
    }

    @Column(name = "scr_visit_date", nullable = false)
    public Date getScrVisitDate() {
        return scrVisitDate;
    }

    public void setScrVisitDate(Date scrVisitDate) {
        this.scrVisitDate = scrVisitDate;
    }

    @Column(name = "scr_remain", nullable = false, length = 2)
    public String getScrRemain() {
        return scrRemain;
    }

    public void setScrRemain(String scrRemain) {
        this.scrRemain = scrRemain;
    }

    @Column(name = "scr_age", nullable = true)
    public Integer getScrAge() {
        return scrAge;
    }

    public void setScrAge(Integer scrAge) {
        this.scrAge = scrAge;
    }

    @Column(name = "scr_age_15", nullable = true)
    public Boolean getScrAge15() {
        return scrAge15;
    }

    public void setScrAge15(Boolean scrAge15) {
        this.scrAge15 = scrAge15;
    }

    @Column(name = "scr_pregnant", nullable = true, length = 2)
    public String getScrPregnant() {
        return scrPregnant;
    }

    public void setScrPregnant(String scrPregnant) {
        this.scrPregnant = scrPregnant;
    }

    @Column(name = "scr_pre_weeks", nullable = true)
    public Integer getScrPreWeeks() {
        return scrPreWeeks;
    }

    public void setScrPreWeeks(Integer scrPreWeeks) {
        this.scrPreWeeks = scrPreWeeks;
    }

    @Column(name = "scr_pre_days", nullable = true)
    public Integer getScrPreDays() {
        return scrPreDays;
    }

    public void setScrPreDays(Integer scrPreDays) {
        this.scrPreDays = scrPreDays;
    }

    @Column(name = "scr_pregant_13", nullable = true)
    public Boolean getScrPregant13() {
        return scrPregant13;
    }

    public void setScrPregant13(Boolean scrPregant13) {
        this.scrPregant13 = scrPregant13;
    }

    @Column(name = "scr_zika_other", nullable = true)
    public Boolean getScrZikaOther() {
        return scrZikaOther;
    }

    public void setScrZikaOther(Boolean scrZikaOther) {
        this.scrZikaOther = scrZikaOther;
    }

    @Column(name = "scr_meet_criteria", nullable = true)
    public Boolean getScrMeetCriteria() {
        return scrMeetCriteria;
    }

    public void setScrMeetCriteria(Boolean scrMeetCriteria) {
        this.scrMeetCriteria = scrMeetCriteria;
    }

    @Column(name = "scr_consent_obta", nullable = true)
    public Boolean getScrConsentObta() {
        return scrConsentObta;
    }

    public void setScrConsentObta(Boolean scrConsentObta) {
        this.scrConsentObta = scrConsentObta;
    }

    @Column(name = "scr_ob_dob_day", nullable = true, length = 2)
    public String getScrObDobDay() {
        return scrObDobDay;
    }

    public void setScrObDobDay(String scrObDobDay) {
        this.scrObDobDay = scrObDobDay;
    }

    @Column(name = "scr_ob_dob_mon", nullable = true, length = 2)
    public String getScrObDobMon() {
        return scrObDobMon;
    }

    public void setScrObDobMon(String scrObDobMon) {
        this.scrObDobMon = scrObDobMon;
    }

    @Column(name = "scr_ob_dob_year", nullable = true)
    public Integer getScrObDobYear() {
        return scrObDobYear;
    }

    public void setScrObDobYear(Integer scrObDobYear) {
        this.scrObDobYear = scrObDobYear;
    }

    @Column(name = "scr_ob_age", nullable = true)
    public Integer getScrObAge() {
        return scrObAge;
    }

    public void setScrObAge(Integer scrObAge) {
        this.scrObAge = scrObAge;
    }

    @Column(name = "scr_ob_assent", nullable = true, length = 2)
    public String getScrObAssent() {
        return scrObAssent;
    }

    public void setScrObAssent(String scrObAssent) {
        this.scrObAssent = scrObAssent;
    }

    @Column(name = "scr_consent_a", nullable = true, length = 2)
    public String getScrConsentA() {
        return scrConsentA;
    }

    public void setScrConsentA(String scrConsentA) {
        this.scrConsentA = scrConsentA;
    }

    @Column(name = "scr_consent_b", nullable = true, length = 2)
    public String getScrConsentB() {
        return scrConsentB;
    }

    public void setScrConsentB(String scrConsentB) {
        this.scrConsentB = scrConsentB;
    }

    @Column(name = "scr_consent_c", nullable = true, length = 2)
    public String getScrConsentC() {
        return scrConsentC;
    }

    public void setScrConsentC(String scrConsentC) {
        this.scrConsentC = scrConsentC;
    }

    @Column(name = "scr_consent_d", nullable = true, length = 2)
    public String getScrConsentD() {
        return scrConsentD;
    }

    public void setScrConsentD(String scrConsentD) {
        this.scrConsentD = scrConsentD;
    }

    @Column(name = "scr_consent_e", nullable = true, length = 2)
    public String getScrConsentE() {
        return scrConsentE;
    }

    public void setScrConsentE(String scrConsentE) {
        this.scrConsentE = scrConsentE;
    }

    @Column(name = "scr_consent_f", nullable = true, length = 2)
    public String getScrConsentF() {
        return scrConsentF;
    }

    public void setScrConsentF(String scrConsentF) {
        this.scrConsentF = scrConsentF;
    }

    @Column(name = "scr_previous_zip", nullable = true, length = 2)
    public String getScrPreviousZip() {
        return scrPreviousZip;
    }

    public void setScrPreviousZip(String scrPreviousZip) {
        this.scrPreviousZip = scrPreviousZip;
    }

    @Column(name = "scr_previous_studyid", nullable = true)
    public String getScrPreviousStudyId() {
        return scrPreviousStudyId;
    }

    public void setScrPreviousStudyId(String scrPreviousStudyId) {
        this.scrPreviousStudyId = scrPreviousStudyId;
    }

    @Column(name = "scr_prestudyna", nullable = true)
    public Boolean getScrPreStudyNa() {
        return scrPreStudyNa;
    }

    public void setScrPreStudyNa(Boolean scrPreStudyNa) {
        this.scrPreStudyNa = scrPreStudyNa;
    }

    @Column(name = "scr_reason_not", nullable = true, length = 2)
    public String getScrReasonNot() {
        return scrReasonNot;
    }

    public void setScrReasonNot(String scrReasonNot) {
        this.scrReasonNot = scrReasonNot;
    }

    @Column(name = "scr_reason_other", nullable = true)
    public String getScrReasonOther() {
        return scrReasonOther;
    }

    public void setScrReasonOther(String scrReasonOther) {
        this.scrReasonOther = scrReasonOther;
    }

    @Column(name = "scr_id_completing", nullable = false)
    public String getScrIdCompleting() {
        return scrIdCompleting;
    }

    public void setScrIdCompleting(String scrIdCompleting) {
        this.scrIdCompleting = scrIdCompleting;
    }

    @Column(name = "scr_date_completed", nullable = false)
    public Date getScrDateCompleted() {
        return scrDateCompleted;
    }

    public void setScrDateCompleted(Date scrDateCompleted) {
        this.scrDateCompleted = scrDateCompleted;
    }

    @Column(name = "scr_id_reviewer", nullable = false)
    public String getScrIdReviewer() {
        return scrIdReviewer;
    }

    public void setScrIdReviewer(String scrIdReviewer) {
        this.scrIdReviewer = scrIdReviewer;
    }

    @Column(name = "scr_date_reviewed", nullable = false)
    public Date getScrDateReviewed() {
        return scrDateReviewed;
    }

    public void setScrDateReviewed(Date scrDateReviewed) {
        this.scrDateReviewed = scrDateReviewed;
    }

    @Column(name = "scr_id_data_entry", nullable = false)
    public String getScrIdDataEntry() {
        return scrIdDataEntry;
    }

    public void setScrIdDataEntry(String scrIdDataEntry) {
        this.scrIdDataEntry = scrIdDataEntry;
    }

    @Column(name = "scr_date_entered", nullable = false)
    public Date getScrDateEntered() {
        return scrDateEntered;
    }

    public void setScrDateEntered(Date scrDateEntered) {
        this.scrDateEntered = scrDateEntered;
    }
}
