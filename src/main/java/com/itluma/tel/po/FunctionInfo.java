package com.itluma.tel.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author 看个锤子，赶紧敲代码！！！
 * @since 2020-08-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="FunctionInfo对象", description="")
public class FunctionInfo implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "功能ID")
      @TableId(value = "FUNCTION_ID", type = IdType.ID_WORKER_STR)
    private Integer functionId;

    @ApiModelProperty(value = "功能编号")
    @TableField("FUNCTION_CODE")
    private String functionCode;

    @ApiModelProperty(value = "所属的模块ID，关联模块表")
    @TableField("MODULE_ID")
    private Integer moduleId;

    @ApiModelProperty(value = "功能名称")
    @TableField("NAME")
    private String name;

    @ApiModelProperty(value = "功能对应的URL地址")
    @TableField("URL")
    private String url;


}
