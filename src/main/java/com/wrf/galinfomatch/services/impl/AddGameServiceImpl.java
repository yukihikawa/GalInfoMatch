package com.wrf.galinfomatch.services.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wrf.galinfomatch.mapper.GameMapper;
import com.wrf.galinfomatch.pojo.Game;
import com.wrf.galinfomatch.services.AddGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: GalInfoMatch
 * @description: 添加游戏实现
 * @author: Rifu Wu
 * @create: 2023-04-10 16:14
 **/
@Service
public class AddGameServiceImpl implements AddGameService {

    private final GameMapper gameMapper;

    public AddGameServiceImpl(GameMapper gameMapper) {
        this.gameMapper = gameMapper;
    }

    @Override
    public Map<String, String> addGame(String uuid, String name, String company, int years, String folderName, String exeName) {

        Map<String, String> message = new HashMap<>();
        if(uuid == null){
            message.put("error_message", "uuid不能为空");
            return message;
        }
        if(name == null){
            message.put("error_message", "name不能为空");
            return message;
        }
        QueryWrapper<Game> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("uuid", uuid);
        List<Game> games = gameMapper.selectList(queryWrapper);
        if(games.size() != 0){
            message.put("error_message", "游戏已存在");
            return message;
        }

        Date now = new Date();
        Game game = new Game(null, uuid, name, company, years, folderName, exeName, now, now);



        gameMapper.insert(game);
        message.put("error_message", "success");
        return null;

    }
}