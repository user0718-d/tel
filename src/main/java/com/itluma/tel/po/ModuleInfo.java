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
@ApiModel(value="ModuleInfo对象", description="")
public class ModuleInfo implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "模块ID")
      @TableId(value = "MODULE_ID", type = IdType.ID_WORKER_STR)
    private Integer moduleId;

    @ApiModelProperty(value = "模块名称")
    @TableField("NAME")
    private String name;


}
