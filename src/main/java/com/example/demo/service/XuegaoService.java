package com.example.demo.service;

import com.example.demo.domain.Xuegao;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author 61580
* @description 针对表【xuegao】的数据库操作Service
* @createDate 2022-10-13 19:36:41
*/
public interface XuegaoService extends IService<Xuegao> {
    public List<Xuegao> search(String name);
}
