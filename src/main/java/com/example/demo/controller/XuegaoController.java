package com.example.demo.controller;

import com.example.demo.domain.Xuegao;
import com.example.demo.service.XuegaoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Api(tags = "雪糕管理")
@RestController
@RequestMapping("/xue-gao")
public class XuegaoController {

    @Autowired
    XuegaoService xuegaoService;

    @ApiOperation(value = "获取所有雪糕")
    @GetMapping("/")
    List<Xuegao> getXueGao() {
        return xuegaoService.list();
    }


    @ApiOperation(value = "添加雪糕")
    @ApiImplicitParams(
            @ApiImplicitParam(name = "XueGao", value = "雪糕", paramType = "body",
                    dataType = "XueGao", dataTypeClass = Xuegao.class, required = true)
    )
    @PostMapping("/")
    void addXueGao(@RequestBody Xuegao xuegao) {
        xuegao.setId(null);
        xuegaoService.save(xuegao);
    }

    @ApiOperation(value = "查询")
    @ApiImplicitParams(
            @ApiImplicitParam(name = "name", value = "雪糕名称", paramType = "path",
                    dataType = "String", dataTypeClass = String.class, required = true)
    )
    @GetMapping("/{name}")
    List<Xuegao> search(@PathVariable(value = "name") String name) {
        return xuegaoService.search(name);
    }
}
