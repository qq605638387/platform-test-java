package com.jc.test11.platform.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.jc.platform.common.supers.AbstractEntity;
import com.jc.test11.platform.vo.ApprovalEntityVO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;
import java.math.*;

/**
 * ClassName ApprovalEntityEntity.java
 * Description 普通审批菜单
 *
 * @author 平台管理员
 * @version 7.0
 * @date 2020-09-10 08:27:11
 */
@Data
@TableName("approval_entity")
@EqualsAndHashCode(of = { "id" }, callSuper = false)
public class ApprovalEntityEntity extends AbstractEntity<ApprovalEntityVO> implements Serializable
{
	private static final long serialVersionUID = 1L;

     @TableField(value = ("id"))
     private Long id;
     @TableField(value = ("tenant_id"))
     private Long tenantId;
     @TableField(value = ("group_id"))
     private Long groupId;
     @TableField(value = ("org_id"))
     private Long orgId;
     @TableField(value = ("dept_id"))
     private Long deptId;
     @TableField(value = ("workflow_state"))
     private String workflowState;
     @TableField(value = ("content1"))
     private String content1;
     @TableField(value = ("cs_code"))
     private String csCode;
     @TableField(value = ("content2"))
     private String content2;
     @TableField(value = ("cs_name"))
     private String csName;
     @TableField(value = ("deleted"))
     private Boolean deleted;
     @TableField(value = ("process_instance_id"))
     private String processInstanceId;
     @TableField(value = ("create_id"))
     private Long createId;
     @TableField(value = ("create_name"))
     private String createName;
     @TableField(value = ("create_time"))
     private Date createTime;
     @TableField(value = ("modify_id"))
     private Long modifyId;
     @TableField(value = ("modify_name"))
     private String modifyName;
     @TableField(value = ("modify_time"))
     private Date modifyTime;
     @TableField(value = ("extension"))
     private String extension;

	/**
	 * 生成vo对象
	 *
	 * @return vo对象
	 */
	public ApprovalEntityVO copyToVO()
	{
		ApprovalEntityVO vo = new ApprovalEntityVO();
        vo.setId(this.id);
        vo.setTenantId(this.tenantId);
        vo.setGroupId(this.groupId);
        vo.setOrgId(this.orgId);
        vo.setDeptId(this.deptId);
        vo.setWorkflowState(this.workflowState);
        vo.setContent1(this.content1);
        vo.setCsCode(this.csCode);
        vo.setContent2(this.content2);
        vo.setCsName(this.csName);
        vo.setDeleted(this.deleted);
        vo.setProcessInstanceId(this.processInstanceId);
        vo.setCreateId(this.createId);
        vo.setCreateName(this.createName);
        vo.setCreateTime(this.createTime);
        vo.setModifyId(this.modifyId);
        vo.setModifyName(this.modifyName);
        vo.setModifyTime(this.modifyTime);
        vo.setExtension(this.extension);
		return vo;
	}

	/**
	 * 从vo对象更新属性
	 *
	 * @param vo vo对象
	 */
	public void copyFormVO(ApprovalEntityVO vo)
	{
        this.setId(vo.getId());
        this.setTenantId(vo.getTenantId());
        this.setGroupId(vo.getGroupId());
        this.setOrgId(vo.getOrgId());
        this.setDeptId(vo.getDeptId());
        this.setWorkflowState(vo.getWorkflowState());
        this.setContent1(vo.getContent1());
        this.setCsCode(vo.getCsCode());
        this.setContent2(vo.getContent2());
        this.setCsName(vo.getCsName());
        this.setDeleted(vo.getDeleted());
        this.setProcessInstanceId(vo.getProcessInstanceId());
        this.setCreateId(vo.getCreateId());
        this.setCreateName(vo.getCreateName());
        this.setCreateTime(vo.getCreateTime());
        this.setModifyId(vo.getModifyId());
        this.setModifyName(vo.getModifyName());
        this.setModifyTime(vo.getModifyTime());
        this.setExtension(vo.getExtension());
	}
}
