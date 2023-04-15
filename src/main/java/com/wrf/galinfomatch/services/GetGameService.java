package com.wrf.galinfomatch.services;

import java.util.Map;

/**
 * @program: GalInfoMatch
 * @description: 获取游戏信息
 * @author: Rifu Wu
 * @create: 2023-04-12 00:46
 **/
public interface GetGameService {
    public Map<String, String> getGame(String uuid);
}
