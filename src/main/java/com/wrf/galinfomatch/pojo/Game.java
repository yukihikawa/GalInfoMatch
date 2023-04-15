package com.wrf.galinfomatch.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;
import java.lang.annotation.Documented;
import java.util.Date;

/**
 * @program: GalInfoMatch
 * @description: 游戏信息类
 * @author: Rifu Wu
 * @create: 2023-04-10 01:25
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(indexName = "game")
public class Game implements Serializable {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String uuid;
    private String name;
    private String company;
    private Integer years;
    private String folderName;
    private String exeName;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Shanghai")
    private Date createTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Shanghai")
    private Date modifyTime;


}