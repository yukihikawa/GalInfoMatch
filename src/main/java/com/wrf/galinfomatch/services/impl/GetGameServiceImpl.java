package com.wrf.galinfomatch.services.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wrf.galinfomatch.mapper.GameMapper;
import com.wrf.galinfomatch.pojo.Game;
import com.wrf.galinfomatch.services.GetGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: GalInfoMatch
 * @description: 获取游戏信息 实现
 * @author: Rifu Wu
 * @create: 2023-04-12 16:08
 **/
@Service
public class GetGameServiceImpl implements GetGameService {
    private final GameMapper gameMapper;

    public GetGameServiceImpl(GameMapper gameMapper) {
        this.gameMapper = gameMapper;
    }


    @Override
    public Map<String, String> getGame(String uuid) {
        QueryWrapper<Game> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("uuid", uuid);
        Game game = gameMapper.selectOne(queryWrapper);
        Map<String, String> result = new HashMap<>();
        result.put("error_message", "success");
        result.put("Game", game.toString());
        return result;
    }
}