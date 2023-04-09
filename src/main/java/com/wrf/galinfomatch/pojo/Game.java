package com.wrf.galinfomatch.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: GalInfoMatch
 * @description: 游戏信息类
 * @author: Rifu Wu
 * @create: 2023-04-10 01:25
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Game {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private Integer uuid;
    private String name;
    private String company;
    private Integer years;
    private String folderName;
    private String exeName;


}