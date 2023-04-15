package com.wrf.galinfomatch.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wrf.galinfomatch.pojo.Game;
import org.apache.ibatis.annotations.Mapper;

/**
 * @program: GalInfoMatch
 * @description: game_mapper
 * @author: Rifu Wu
 * @create: 2023-04-10 01:42
 **/
@Mapper
public interface GameMapper extends BaseMapper<Game> {
}
