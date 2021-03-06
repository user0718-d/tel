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
@ApiModel(value="Host对象", description="")
public class Host implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "主键，记录UNIX服务器的ip地址")
      @TableId(value = "HOST_ID", type = IdType.ID_WORKER_STR)
    private String hostId;

    @ApiModelProperty(value = "主机名")
    @TableField("NAME")
    private String name;

    @ApiModelProperty(value = "主机所在位置")
    @TableField("LOCATION")
    private String location;


}
