package com.elite.wragger.web.controller;

import com.google.common.collect.Maps;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by wjc133
 * Date: 15/12/10
 * Time: 16:30
 */
@Api(tags = {"user-api","user-info"},description = "有关用户的操作")
@Controller
@RequestMapping(value = "user")
public class TestController {

    @ApiOperation(value = "获取用户信息",notes = "通过传入的用户id返回用户实体对象")
    @RequestMapping(value = "info",method = RequestMethod.GET)
    @ResponseBody
    public Map getInfo(@RequestParam String id) {
        Map<String, String> map = Maps.newHashMap();
        if (id.equals("1")) {
            map.put("name", "wjc133");
            map.put("part", "erd");
        }else {
            map.put("name", "hi");
            map.put("part", "world");
        }
        return map;
    }
}
