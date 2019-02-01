package com.rocket.rocket.entity;

import java.io.Serializable;
import java.util.Date;

public class CisInPatReg implements Serializable {
    /**
     * 住院流水号（=注册档案号REG_ID）6+3+6 <br>
     * 数据库字段是：CIS_IN_PAT_REG.VISIT_ID  <br>
     */
    private Long visitId;

    /**
     * 病人ID <br>
     * 数据库字段是：CIS_IN_PAT_REG.PAT_ID  <br>
     */
    private Long patId;

    /**
     * 机构号 <br>
     * 数据库字段是：CIS_IN_PAT_REG.BRANCH_CODE  <br>
     */
    private String branchCode;

    /**
     * 住院号  对应一次住院，有编码规则 （索引）腕带条码 <br>
     * 数据库字段是：CIS_IN_PAT_REG.VISIT_NO  <br>
     */
    private String visitNo;

    /**
     * 住院次数 （累计数） <br>
     * 数据库字段是：CIS_IN_PAT_REG.TIMES  <br>
     */
    private Short times;

    /**
     * 病案号  住院长期复用  （索引） <br>
     * 数据库字段是：CIS_IN_PAT_REG.MR_NO  <br>
     */
    private String mrNo;

    /**
     * 母亲住院流水号(如婴儿对应的母亲) <br>
     * 数据库字段是：CIS_IN_PAT_REG.MASTER_ID  <br>
     */
    private Long masterId;

    /**
     * 当前病区 PUB_WARD.ID <br>
     * 数据库字段是：CIS_IN_PAT_REG.WARD_ID  <br>
     */
    private Integer wardId;

    /**
     * 当前科室 PUB_DEPT.ID <br>
     * 数据库字段是：CIS_IN_PAT_REG.DEPT_ID  <br>
     */
    private Integer deptId;

    /**
     * 床位号 PUB_WARD_BED.ID <br>
     * 数据库字段是：CIS_IN_PAT_REG.BED_ID  <br>
     */
    private Integer bedId;

    /**
     * 电子标识号(射频识别编号) （索引） <br>
     * 数据库字段是：CIS_IN_PAT_REG.EFID  <br>
     */
    private String efid;

    /**
     * 收治医师 <br>
     * 数据库字段是：CIS_IN_PAT_REG.ADMISSION_DOCTOR  <br>
     */
    private Integer admissionDoctor;

    /**
     * 住院医师 <br>
     * 数据库字段是：CIS_IN_PAT_REG.RESIDENT_DOCTOR  <br>
     */
    private Integer residentDoctor;

    /**
     * 主治医师 <br>
     * 数据库字段是：CIS_IN_PAT_REG.ATTENDING_DOCTOR  <br>
     */
    private Integer attendingDoctor;

    /**
     * 主任医师 <br>
     * 数据库字段是：CIS_IN_PAT_REG.CHIEF_DOCTOR  <br>
     */
    private Integer chiefDoctor;

    /**
     * 医疗组 PUB_WORK_GROUP.ID <br>
     * 数据库字段是：CIS_IN_PAT_REG.WORK_GROUP_ID  <br>
     */
    private Integer workGroupId;

    /**
     * 入院病区 PUB_WARD.ID <br>
     * 数据库字段是：CIS_IN_PAT_REG.IN_WARD_ID  <br>
     */
    private Integer inWardId;

    /**
     * 入院科室 PUB_DEPT.ID <br>
     * 数据库字段是：CIS_IN_PAT_REG.IN_DEPT_ID  <br>
     */
    private Integer inDeptId;

    /**
     * 入住病区时间 <br>
     * 数据库字段是：CIS_IN_PAT_REG.WARD_IN_TIME  <br>
     */
    private Date wardInTime;

    /**
     * 离院方式 TYPE='OUT_WAY' <br>
     * 数据库字段是：CIS_IN_PAT_REG.OUT_WAY  <br>
     */
    private Short outWay;

    /**
     * 转院的接收医疗机构名称 <br>
     * 数据库字段是：CIS_IN_PAT_REG.REFERRAL_HOSPITAL  <br>
     */
    private String referralHospital;

    /**
     * 临床出院时间(先临床出院然后再是病区出院) <br>
     * 数据库字段是：CIS_IN_PAT_REG.CLN_OUT_TIME  <br>
     */
    private Date clnOutTime;

    /**
     * 病区出院时间(也作医生预约) <br>
     * 数据库字段是：CIS_IN_PAT_REG.WARD_OUT_TIME  <br>
     */
    private Date wardOutTime;

    /**
     * 结帐时间 <br>
     * 数据库字段是：CIS_IN_PAT_REG.CHECK_OUT_TIME  <br>
     */
    private Date checkOutTime;

    /**
     * 入院途径 TYPE='IN_WAY' (1=门诊入院/2=急诊入院/3=院外转入/4=院内分娩/9=其它) <br>
     * 数据库字段是：CIS_IN_PAT_REG.IN_WAY  <br>
     */
    private Short inWay;

    /**
     * 入院诊断ID PUB_DIAGNOSE.ID <br>
     * 数据库字段是：CIS_IN_PAT_REG.IN_DIAG_ID  <br>
     */
    private Integer inDiagId;

    /**
     * 入院诊断代码 ICD10 <br>
     * 数据库字段是：CIS_IN_PAT_REG.IN_DIAG_CODE  <br>
     */
    private String inDiagCode;

    /**
     * 入院诊断名称（多个，逗号分割） <br>
     * 数据库字段是：CIS_IN_PAT_REG.IN_DIAG_NAME  <br>
     */
    private String inDiagName;

    /**
     * 饮食医嘱 <br>
     * 数据库字段是：CIS_IN_PAT_REG.DIET_ORDER_ID  <br>
     */
    private Integer dietOrderId;

    /**
     * 护理等级(0=特级/1=一级/2=二级/3=三级) <br>
     * 数据库字段是：CIS_IN_PAT_REG.CARE_LEVEL  <br>
     */
    private Short careLevel;

    /**
     * 危急等级(0=一般病人/1=重危病人/2=急救病人) <br>
     * 数据库字段是：CIS_IN_PAT_REG.EME_LEVEL  <br>
     */
    private Short emeLevel;

    /**
     * 病人性质 ACC_DIC_FEE_NATURE.ID <br>
     * 数据库字段是：CIS_IN_PAT_REG.FEE_NATURE  <br>
     */
    private Integer feeNature;

    /**
     * 保险号,医疗证号 <br>
     * 数据库字段是：CIS_IN_PAT_REG.INSURANCE_NO  <br>
     */
    private String insuranceNo;

    /**
     * 就诊卡类型 CARD_DIC_TYPE.ID <br>
     * 数据库字段是：CIS_IN_PAT_REG.CARD_TYPE  <br>
     */
    private Short cardType;

    /**
     * 就诊卡号 <br>
     * 数据库字段是：CIS_IN_PAT_REG.CARD_DATA  <br>
     */
    private String cardData;

    /**
     * 是否要出院审批(0=否/1=是) <br>
     * 数据库字段是：CIS_IN_PAT_REG.IS_OUT_APPROVAL  <br>
     */
    private Short isOutApproval;

    /**
     * 住院状态(1=登记/2=入院前检查/3=病区入院/4=科室入院/5=临床出院/6=病区出院/7=结帐出院) <br>
     * 数据库字段是：CIS_IN_PAT_REG.STATE  <br>
     */
    private Short state;

    /**
     * 是否作废 （检索需要过滤）(0=否/1=是) <br>
     * 数据库字段是：CIS_IN_PAT_REG.IS_INVALID  <br>
     */
    private Short isInvalid;

    /**
     * 撤销人员 <br>
     * 数据库字段是：CIS_IN_PAT_REG.INVALID_EMPID  <br>
     */
    private Integer invalidEmpid;

    /**
     * 撤销时间 <br>
     * 数据库字段是：CIS_IN_PAT_REG.INVALID_TIME  <br>
     */
    private Date invalidTime;

    /**
     * 撤销原因 <br>
     * 数据库字段是：CIS_IN_PAT_REG.INVALID_REASON  <br>
     */
    private String invalidReason;

    /**
     * 当前病人状态流水 CIS_IN_PAT_REG_STATE.VISIT_STATE_SN <br>
     * 数据库字段是：CIS_IN_PAT_REG.STATE_SN  <br>
     */
    private Long stateSn;

    /**
     * 当前医疗阶段 CIS_ORDER_PHASE.PHASE_FLAG <br>
     * 数据库字段是：CIS_IN_PAT_REG.PHASE_SEQ  <br>
     */
    private Short phaseSeq;

    /**
     * 责任护士 <br>
     * 数据库字段是：CIS_IN_PAT_REG.PRIMARY_NURSE  <br>
     */
    private Integer primaryNurse;

    /**
     * 比例分类  ACC_DIC_RATE_TYPE.ID <br>
     * 数据库字段是：CIS_IN_PAT_REG.RATIO_CLASSIFY  <br>
     */
    private Integer ratioClassify;

    /**
     * 是否家床(0=否/1=是) <br>
     * 数据库字段是：CIS_IN_PAT_REG.IS_HOME_BED  <br>
     */
    private Short isHomeBed;

    /**
     * 备注 <br>
     * 数据库字段是：CIS_IN_PAT_REG.REMARK  <br>
     */
    private String remark;

    /**
     * 医疗付费方式,多种方式逗号分隔 TYPE='MEDICAL_PAYMENT' <br>
     * 数据库字段是：CIS_IN_PAT_REG.PAYMENT  <br>
     */
    private String payment;

    /**
     * DCD <br>
     * 数据库字段是：CIS_IN_PAT_REG.DCD  <br>
     */
    private Long dcd;

    /**
     * 人员分类 <br>
     * 数据库字段是：CIS_IN_PAT_REG.PEOPLE_CLASS  <br>
     */
    private String peopleClass;

    /**
     * 住院日期 <br>
     * 数据库字段是：CIS_IN_PAT_REG.IN_PAT_DAY  <br>
     */
    private Date inPatDay;

    /**
     * 出院日期 <br>
     * 数据库字段是：CIS_IN_PAT_REG.OUT_PAT_DAY  <br>
     */
    private Date outPatDay;

    /**
     * 登记人员 <br>
     * 数据库字段是：CIS_IN_PAT_REG.REG_EMPID  <br>
     */
    private Integer regEmpid;

    /**
     * 入院登记时间 <br>
     * 数据库字段是：CIS_IN_PAT_REG.REG_TIME  <br>
     */
    private Date regTime;

    /**
     * 修改人员 <br>
     * 数据库字段是：CIS_IN_PAT_REG.MODIFY_EMPID  <br>
     */
    private Integer modifyEmpid;

    /**
     * 修改时间 <br>
     * 数据库字段是：CIS_IN_PAT_REG.MODIFY_TIME  <br>
     */
    private Date modifyTime;

    /**
     * 治疗方式（住院原因） TYPE='IN_REASON' <br>
     * 数据库字段是：CIS_IN_PAT_REG.IN_REASON  <br>
     */
    private String inReason;

    private Integer ruleId;

    /**
     * 获取住院流水号（=注册档案号REG_ID）6+3+6
     * @return CIS_IN_PAT_REG.VISIT_ID
     */
    public Long getVisitId() {
        return visitId;
    }

    /**
     * 设置住院流水号（=注册档案号REG_ID）6+3+6
     * @param visitId 住院流水号（=注册档案号REG_ID）6+3+6
     */
    public void setVisitId(Long visitId) {
        this.visitId = visitId;
    }

    /**
     * 获取病人ID
     * @return CIS_IN_PAT_REG.PAT_ID
     */
    public Long getPatId() {
        return patId;
    }

    /**
     * 设置病人ID
     * @param patId 病人ID
     */
    public void setPatId(Long patId) {
        this.patId = patId;
    }

    /**
     * 获取机构号
     * @return CIS_IN_PAT_REG.BRANCH_CODE
     */
    public String getBranchCode() {
        return branchCode;
    }

    /**
     * 设置机构号
     * @param branchCode 机构号
     */
    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    /**
     * 获取住院号  对应一次住院，有编码规则 （索引）腕带条码
     * @return CIS_IN_PAT_REG.VISIT_NO
     */
    public String getVisitNo() {
        return visitNo;
    }

    /**
     * 设置住院号  对应一次住院，有编码规则 （索引）腕带条码
     * @param visitNo 住院号  对应一次住院，有编码规则 （索引）腕带条码
     */
    public void setVisitNo(String visitNo) {
        this.visitNo = visitNo;
    }

    /**
     * 获取住院次数 （累计数）
     * @return CIS_IN_PAT_REG.TIMES
     */
    public Short getTimes() {
        return times;
    }

    /**
     * 设置住院次数 （累计数）
     * @param times 住院次数 （累计数）
     */
    public void setTimes(Short times) {
        this.times = times;
    }

    /**
     * 获取病案号  住院长期复用  （索引）
     * @return CIS_IN_PAT_REG.MR_NO
     */
    public String getMrNo() {
        return mrNo;
    }

    /**
     * 设置病案号  住院长期复用  （索引）
     * @param mrNo 病案号  住院长期复用  （索引）
     */
    public void setMrNo(String mrNo) {
        this.mrNo = mrNo;
    }

    /**
     * 获取母亲住院流水号(如婴儿对应的母亲)
     * @return CIS_IN_PAT_REG.MASTER_ID
     */
    public Long getMasterId() {
        return masterId;
    }

    /**
     * 设置母亲住院流水号(如婴儿对应的母亲)
     * @param masterId 母亲住院流水号(如婴儿对应的母亲)
     */
    public void setMasterId(Long masterId) {
        this.masterId = masterId;
    }

    /**
     * 获取当前病区 PUB_WARD.ID
     * @return CIS_IN_PAT_REG.WARD_ID
     */
    public Integer getWardId() {
        return wardId;
    }

    /**
     * 设置当前病区 PUB_WARD.ID
     * @param wardId 当前病区 PUB_WARD.ID
     */
    public void setWardId(Integer wardId) {
        this.wardId = wardId;
    }

    /**
     * 获取当前科室 PUB_DEPT.ID
     * @return CIS_IN_PAT_REG.DEPT_ID
     */
    public Integer getDeptId() {
        return deptId;
    }

    /**
     * 设置当前科室 PUB_DEPT.ID
     * @param deptId 当前科室 PUB_DEPT.ID
     */
    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    /**
     * 获取床位号 PUB_WARD_BED.ID
     * @return CIS_IN_PAT_REG.BED_ID
     */
    public Integer getBedId() {
        return bedId;
    }

    /**
     * 设置床位号 PUB_WARD_BED.ID
     * @param bedId 床位号 PUB_WARD_BED.ID
     */
    public void setBedId(Integer bedId) {
        this.bedId = bedId;
    }

    /**
     * 获取电子标识号(射频识别编号) （索引）
     * @return CIS_IN_PAT_REG.EFID
     */
    public String getEfid() {
        return efid;
    }

    /**
     * 设置电子标识号(射频识别编号) （索引）
     * @param efid 电子标识号(射频识别编号) （索引）
     */
    public void setEfid(String efid) {
        this.efid = efid;
    }

    /**
     * 获取收治医师
     * @return CIS_IN_PAT_REG.ADMISSION_DOCTOR
     */
    public Integer getAdmissionDoctor() {
        return admissionDoctor;
    }

    /**
     * 设置收治医师
     * @param admissionDoctor 收治医师
     */
    public void setAdmissionDoctor(Integer admissionDoctor) {
        this.admissionDoctor = admissionDoctor;
    }

    /**
     * 获取住院医师
     * @return CIS_IN_PAT_REG.RESIDENT_DOCTOR
     */
    public Integer getResidentDoctor() {
        return residentDoctor;
    }

    /**
     * 设置住院医师
     * @param residentDoctor 住院医师
     */
    public void setResidentDoctor(Integer residentDoctor) {
        this.residentDoctor = residentDoctor;
    }

    /**
     * 获取主治医师
     * @return CIS_IN_PAT_REG.ATTENDING_DOCTOR
     */
    public Integer getAttendingDoctor() {
        return attendingDoctor;
    }

    /**
     * 设置主治医师
     * @param attendingDoctor 主治医师
     */
    public void setAttendingDoctor(Integer attendingDoctor) {
        this.attendingDoctor = attendingDoctor;
    }

    /**
     * 获取主任医师
     * @return CIS_IN_PAT_REG.CHIEF_DOCTOR
     */
    public Integer getChiefDoctor() {
        return chiefDoctor;
    }

    /**
     * 设置主任医师
     * @param chiefDoctor 主任医师
     */
    public void setChiefDoctor(Integer chiefDoctor) {
        this.chiefDoctor = chiefDoctor;
    }

    /**
     * 获取医疗组 PUB_WORK_GROUP.ID
     * @return CIS_IN_PAT_REG.WORK_GROUP_ID
     */
    public Integer getWorkGroupId() {
        return workGroupId;
    }

    /**
     * 设置医疗组 PUB_WORK_GROUP.ID
     * @param workGroupId 医疗组 PUB_WORK_GROUP.ID
     */
    public void setWorkGroupId(Integer workGroupId) {
        this.workGroupId = workGroupId;
    }

    /**
     * 获取入院病区 PUB_WARD.ID
     * @return CIS_IN_PAT_REG.IN_WARD_ID
     */
    public Integer getInWardId() {
        return inWardId;
    }

    /**
     * 设置入院病区 PUB_WARD.ID
     * @param inWardId 入院病区 PUB_WARD.ID
     */
    public void setInWardId(Integer inWardId) {
        this.inWardId = inWardId;
    }

    /**
     * 获取入院科室 PUB_DEPT.ID
     * @return CIS_IN_PAT_REG.IN_DEPT_ID
     */
    public Integer getInDeptId() {
        return inDeptId;
    }

    /**
     * 设置入院科室 PUB_DEPT.ID
     * @param inDeptId 入院科室 PUB_DEPT.ID
     */
    public void setInDeptId(Integer inDeptId) {
        this.inDeptId = inDeptId;
    }

    /**
     * 获取入住病区时间
     * @return CIS_IN_PAT_REG.WARD_IN_TIME
     */
    public Date getWardInTime() {
        return wardInTime;
    }

    /**
     * 设置入住病区时间
     * @param wardInTime 入住病区时间
     */
    public void setWardInTime(Date wardInTime) {
        this.wardInTime = wardInTime;
    }

    /**
     * 获取离院方式 TYPE='OUT_WAY'
     * @return CIS_IN_PAT_REG.OUT_WAY
     */
    public Short getOutWay() {
        return outWay;
    }

    /**
     * 设置离院方式 TYPE='OUT_WAY'
     * @param outWay 离院方式 TYPE='OUT_WAY'
     */
    public void setOutWay(Short outWay) {
        this.outWay = outWay;
    }

    /**
     * 获取转院的接收医疗机构名称
     * @return CIS_IN_PAT_REG.REFERRAL_HOSPITAL
     */
    public String getReferralHospital() {
        return referralHospital;
    }

    /**
     * 设置转院的接收医疗机构名称
     * @param referralHospital 转院的接收医疗机构名称
     */
    public void setReferralHospital(String referralHospital) {
        this.referralHospital = referralHospital;
    }

    /**
     * 获取临床出院时间(先临床出院然后再是病区出院)
     * @return CIS_IN_PAT_REG.CLN_OUT_TIME
     */
    public Date getClnOutTime() {
        return clnOutTime;
    }

    /**
     * 设置临床出院时间(先临床出院然后再是病区出院)
     * @param clnOutTime 临床出院时间(先临床出院然后再是病区出院)
     */
    public void setClnOutTime(Date clnOutTime) {
        this.clnOutTime = clnOutTime;
    }

    /**
     * 获取病区出院时间(也作医生预约)
     * @return CIS_IN_PAT_REG.WARD_OUT_TIME
     */
    public Date getWardOutTime() {
        return wardOutTime;
    }

    /**
     * 设置病区出院时间(也作医生预约)
     * @param wardOutTime 病区出院时间(也作医生预约)
     */
    public void setWardOutTime(Date wardOutTime) {
        this.wardOutTime = wardOutTime;
    }

    /**
     * 获取结帐时间
     * @return CIS_IN_PAT_REG.CHECK_OUT_TIME
     */
    public Date getCheckOutTime() {
        return checkOutTime;
    }

    /**
     * 设置结帐时间
     * @param checkOutTime 结帐时间
     */
    public void setCheckOutTime(Date checkOutTime) {
        this.checkOutTime = checkOutTime;
    }

    /**
     * 获取入院途径 TYPE='IN_WAY' (1=门诊入院/2=急诊入院/3=院外转入/4=院内分娩/9=其它)
     * @return CIS_IN_PAT_REG.IN_WAY
     */
    public Short getInWay() {
        return inWay;
    }

    /**
     * 设置入院途径 TYPE='IN_WAY' (1=门诊入院/2=急诊入院/3=院外转入/4=院内分娩/9=其它)
     * @param inWay 入院途径 TYPE='IN_WAY' (1=门诊入院/2=急诊入院/3=院外转入/4=院内分娩/9=其它)
     */
    public void setInWay(Short inWay) {
        this.inWay = inWay;
    }

    /**
     * 获取入院诊断ID PUB_DIAGNOSE.ID
     * @return CIS_IN_PAT_REG.IN_DIAG_ID
     */
    public Integer getInDiagId() {
        return inDiagId;
    }

    /**
     * 设置入院诊断ID PUB_DIAGNOSE.ID
     * @param inDiagId 入院诊断ID PUB_DIAGNOSE.ID
     */
    public void setInDiagId(Integer inDiagId) {
        this.inDiagId = inDiagId;
    }

    /**
     * 获取入院诊断代码 ICD10
     * @return CIS_IN_PAT_REG.IN_DIAG_CODE
     */
    public String getInDiagCode() {
        return inDiagCode;
    }

    /**
     * 设置入院诊断代码 ICD10
     * @param inDiagCode 入院诊断代码 ICD10
     */
    public void setInDiagCode(String inDiagCode) {
        this.inDiagCode = inDiagCode;
    }

    /**
     * 获取入院诊断名称（多个，逗号分割）
     * @return CIS_IN_PAT_REG.IN_DIAG_NAME
     */
    public String getInDiagName() {
        return inDiagName;
    }

    /**
     * 设置入院诊断名称（多个，逗号分割）
     * @param inDiagName 入院诊断名称（多个，逗号分割）
     */
    public void setInDiagName(String inDiagName) {
        this.inDiagName = inDiagName;
    }

    /**
     * 获取饮食医嘱
     * @return CIS_IN_PAT_REG.DIET_ORDER_ID
     */
    public Integer getDietOrderId() {
        return dietOrderId;
    }

    /**
     * 设置饮食医嘱
     * @param dietOrderId 饮食医嘱
     */
    public void setDietOrderId(Integer dietOrderId) {
        this.dietOrderId = dietOrderId;
    }

    /**
     * 获取护理等级(0=特级/1=一级/2=二级/3=三级)
     * @return CIS_IN_PAT_REG.CARE_LEVEL
     */
    public Short getCareLevel() {
        return careLevel;
    }

    /**
     * 设置护理等级(0=特级/1=一级/2=二级/3=三级)
     * @param careLevel 护理等级(0=特级/1=一级/2=二级/3=三级)
     */
    public void setCareLevel(Short careLevel) {
        this.careLevel = careLevel;
    }

    /**
     * 获取危急等级(0=一般病人/1=重危病人/2=急救病人)
     * @return CIS_IN_PAT_REG.EME_LEVEL
     */
    public Short getEmeLevel() {
        return emeLevel;
    }

    /**
     * 设置危急等级(0=一般病人/1=重危病人/2=急救病人)
     * @param emeLevel 危急等级(0=一般病人/1=重危病人/2=急救病人)
     */
    public void setEmeLevel(Short emeLevel) {
        this.emeLevel = emeLevel;
    }

    /**
     * 获取病人性质 ACC_DIC_FEE_NATURE.ID
     * @return CIS_IN_PAT_REG.FEE_NATURE
     */
    public Integer getFeeNature() {
        return feeNature;
    }

    /**
     * 设置病人性质 ACC_DIC_FEE_NATURE.ID
     * @param feeNature 病人性质 ACC_DIC_FEE_NATURE.ID
     */
    public void setFeeNature(Integer feeNature) {
        this.feeNature = feeNature;
    }

    /**
     * 获取保险号,医疗证号
     * @return CIS_IN_PAT_REG.INSURANCE_NO
     */
    public String getInsuranceNo() {
        return insuranceNo;
    }

    /**
     * 设置保险号,医疗证号
     * @param insuranceNo 保险号,医疗证号
     */
    public void setInsuranceNo(String insuranceNo) {
        this.insuranceNo = insuranceNo;
    }

    /**
     * 获取就诊卡类型 CARD_DIC_TYPE.ID
     * @return CIS_IN_PAT_REG.CARD_TYPE
     */
    public Short getCardType() {
        return cardType;
    }

    /**
     * 设置就诊卡类型 CARD_DIC_TYPE.ID
     * @param cardType 就诊卡类型 CARD_DIC_TYPE.ID
     */
    public void setCardType(Short cardType) {
        this.cardType = cardType;
    }

    /**
     * 获取就诊卡号
     * @return CIS_IN_PAT_REG.CARD_DATA
     */
    public String getCardData() {
        return cardData;
    }

    /**
     * 设置就诊卡号
     * @param cardData 就诊卡号
     */
    public void setCardData(String cardData) {
        this.cardData = cardData;
    }

    /**
     * 获取是否要出院审批(0=否/1=是)
     * @return CIS_IN_PAT_REG.IS_OUT_APPROVAL
     */
    public Short getIsOutApproval() {
        return isOutApproval;
    }

    /**
     * 设置是否要出院审批(0=否/1=是)
     * @param isOutApproval 是否要出院审批(0=否/1=是)
     */
    public void setIsOutApproval(Short isOutApproval) {
        this.isOutApproval = isOutApproval;
    }

    /**
     * 获取住院状态(1=登记/2=入院前检查/3=病区入院/4=科室入院/5=临床出院/6=病区出院/7=结帐出院)
     * @return CIS_IN_PAT_REG.STATE
     */
    public Short getState() {
        return state;
    }

    /**
     * 设置住院状态(1=登记/2=入院前检查/3=病区入院/4=科室入院/5=临床出院/6=病区出院/7=结帐出院)
     * @param state 住院状态(1=登记/2=入院前检查/3=病区入院/4=科室入院/5=临床出院/6=病区出院/7=结帐出院)
     */
    public void setState(Short state) {
        this.state = state;
    }

    /**
     * 获取是否作废 （检索需要过滤）(0=否/1=是)
     * @return CIS_IN_PAT_REG.IS_INVALID
     */
    public Short getIsInvalid() {
        return isInvalid;
    }

    /**
     * 设置是否作废 （检索需要过滤）(0=否/1=是)
     * @param isInvalid 是否作废 （检索需要过滤）(0=否/1=是)
     */
    public void setIsInvalid(Short isInvalid) {
        this.isInvalid = isInvalid;
    }

    /**
     * 获取撤销人员
     * @return CIS_IN_PAT_REG.INVALID_EMPID
     */
    public Integer getInvalidEmpid() {
        return invalidEmpid;
    }

    /**
     * 设置撤销人员
     * @param invalidEmpid 撤销人员
     */
    public void setInvalidEmpid(Integer invalidEmpid) {
        this.invalidEmpid = invalidEmpid;
    }

    /**
     * 获取撤销时间
     * @return CIS_IN_PAT_REG.INVALID_TIME
     */
    public Date getInvalidTime() {
        return invalidTime;
    }

    /**
     * 设置撤销时间
     * @param invalidTime 撤销时间
     */
    public void setInvalidTime(Date invalidTime) {
        this.invalidTime = invalidTime;
    }

    /**
     * 获取撤销原因
     * @return CIS_IN_PAT_REG.INVALID_REASON
     */
    public String getInvalidReason() {
        return invalidReason;
    }

    /**
     * 设置撤销原因
     * @param invalidReason 撤销原因
     */
    public void setInvalidReason(String invalidReason) {
        this.invalidReason = invalidReason;
    }

    /**
     * 获取当前病人状态流水 CIS_IN_PAT_REG_STATE.VISIT_STATE_SN
     * @return CIS_IN_PAT_REG.STATE_SN
     */
    public Long getStateSn() {
        return stateSn;
    }

    /**
     * 设置当前病人状态流水 CIS_IN_PAT_REG_STATE.VISIT_STATE_SN
     * @param stateSn 当前病人状态流水 CIS_IN_PAT_REG_STATE.VISIT_STATE_SN
     */
    public void setStateSn(Long stateSn) {
        this.stateSn = stateSn;
    }

    /**
     * 获取当前医疗阶段 CIS_ORDER_PHASE.PHASE_FLAG
     * @return CIS_IN_PAT_REG.PHASE_SEQ
     */
    public Short getPhaseSeq() {
        return phaseSeq;
    }

    /**
     * 设置当前医疗阶段 CIS_ORDER_PHASE.PHASE_FLAG
     * @param phaseSeq 当前医疗阶段 CIS_ORDER_PHASE.PHASE_FLAG
     */
    public void setPhaseSeq(Short phaseSeq) {
        this.phaseSeq = phaseSeq;
    }

    /**
     * 获取责任护士
     * @return CIS_IN_PAT_REG.PRIMARY_NURSE
     */
    public Integer getPrimaryNurse() {
        return primaryNurse;
    }

    /**
     * 设置责任护士
     * @param primaryNurse 责任护士
     */
    public void setPrimaryNurse(Integer primaryNurse) {
        this.primaryNurse = primaryNurse;
    }

    /**
     * 获取比例分类  ACC_DIC_RATE_TYPE.ID
     * @return CIS_IN_PAT_REG.RATIO_CLASSIFY
     */
    public Integer getRatioClassify() {
        return ratioClassify;
    }

    /**
     * 设置比例分类  ACC_DIC_RATE_TYPE.ID
     * @param ratioClassify 比例分类  ACC_DIC_RATE_TYPE.ID
     */
    public void setRatioClassify(Integer ratioClassify) {
        this.ratioClassify = ratioClassify;
    }

    /**
     * 获取是否家床(0=否/1=是)
     * @return CIS_IN_PAT_REG.IS_HOME_BED
     */
    public Short getIsHomeBed() {
        return isHomeBed;
    }

    /**
     * 设置是否家床(0=否/1=是)
     * @param isHomeBed 是否家床(0=否/1=是)
     */
    public void setIsHomeBed(Short isHomeBed) {
        this.isHomeBed = isHomeBed;
    }

    /**
     * 获取备注
     * @return CIS_IN_PAT_REG.REMARK
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取医疗付费方式,多种方式逗号分隔 TYPE='MEDICAL_PAYMENT'
     * @return CIS_IN_PAT_REG.PAYMENT
     */
    public String getPayment() {
        return payment;
    }

    /**
     * 设置医疗付费方式,多种方式逗号分隔 TYPE='MEDICAL_PAYMENT'
     * @param payment 医疗付费方式,多种方式逗号分隔 TYPE='MEDICAL_PAYMENT'
     */
    public void setPayment(String payment) {
        this.payment = payment;
    }

    /**
     * 获取DCD
     * @return CIS_IN_PAT_REG.DCD
     */
    public Long getDcd() {
        return dcd;
    }

    /**
     * 设置DCD
     * @param dcd DCD
     */
    public void setDcd(Long dcd) {
        this.dcd = dcd;
    }

    /**
     * 获取人员分类
     * @return CIS_IN_PAT_REG.PEOPLE_CLASS
     */
    public String getPeopleClass() {
        return peopleClass;
    }

    /**
     * 设置人员分类
     * @param peopleClass 人员分类
     */
    public void setPeopleClass(String peopleClass) {
        this.peopleClass = peopleClass;
    }

    /**
     * 获取住院日期
     * @return CIS_IN_PAT_REG.IN_PAT_DAY
     */
    public Date getInPatDay() {
        return inPatDay;
    }

    /**
     * 设置住院日期
     * @param inPatDay 住院日期
     */
    public void setInPatDay(Date inPatDay) {
        this.inPatDay = inPatDay;
    }

    /**
     * 获取出院日期
     * @return CIS_IN_PAT_REG.OUT_PAT_DAY
     */
    public Date getOutPatDay() {
        return outPatDay;
    }

    /**
     * 设置出院日期
     * @param outPatDay 出院日期
     */
    public void setOutPatDay(Date outPatDay) {
        this.outPatDay = outPatDay;
    }

    /**
     * 获取登记人员
     * @return CIS_IN_PAT_REG.REG_EMPID
     */
    public Integer getRegEmpid() {
        return regEmpid;
    }

    /**
     * 设置登记人员
     * @param regEmpid 登记人员
     */
    public void setRegEmpid(Integer regEmpid) {
        this.regEmpid = regEmpid;
    }

    /**
     * 获取入院登记时间
     * @return CIS_IN_PAT_REG.REG_TIME
     */
    public Date getRegTime() {
        return regTime;
    }

    /**
     * 设置入院登记时间
     * @param regTime 入院登记时间
     */
    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    /**
     * 获取修改人员
     * @return CIS_IN_PAT_REG.MODIFY_EMPID
     */
    public Integer getModifyEmpid() {
        return modifyEmpid;
    }

    /**
     * 设置修改人员
     * @param modifyEmpid 修改人员
     */
    public void setModifyEmpid(Integer modifyEmpid) {
        this.modifyEmpid = modifyEmpid;
    }

    /**
     * 获取修改时间
     * @return CIS_IN_PAT_REG.MODIFY_TIME
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * 设置修改时间
     * @param modifyTime 修改时间
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * 获取治疗方式（住院原因） TYPE='IN_REASON'
     * @return CIS_IN_PAT_REG.IN_REASON
     */
    public String getInReason() {
        return inReason;
    }

    /**
     * 设置治疗方式（住院原因） TYPE='IN_REASON'
     * @param inReason 治疗方式（住院原因） TYPE='IN_REASON'
     */
    public void setInReason(String inReason) {
        this.inReason = inReason;
    }

    public Integer getRuleId() {
        return ruleId;
    }

    public void setRuleId(Integer ruleId) {
        this.ruleId = ruleId;
    }
}