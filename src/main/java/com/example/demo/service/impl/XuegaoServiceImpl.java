package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.service.XuegaoService;
import com.example.demo.domain.Xuegao;
import com.example.demo.mapper.XuegaoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 61580
 * @description 针对表【xuegao】的数据库操作Service实现
 * @createDate 2022-10-13 19:36:41
 */
@Service
public class XuegaoServiceImpl extends ServiceImpl<XuegaoMapper, Xuegao>
        implements XuegaoService {

    @Autowired
    XuegaoMapper xuegaoMapper;

    @Override
    public List<Xuegao> search(String name) {
        QueryWrapper<Xuegao> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("name", name);
        List<Xuegao> list = xuegaoMapper.selectList(queryWrapper);
        return list;
    }
}




