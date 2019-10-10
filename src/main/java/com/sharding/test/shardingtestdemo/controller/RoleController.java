package com.sharding.test.shardingtestdemo.controller;

import com.alibaba.fastjson.JSON;
import com.sharding.test.shardingtestdemo.dal.entitys.Role;
import com.sharding.test.shardingtestdemo.services.RoleService;
import groovy.util.logging.Log4j2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/role")
public class RoleController {

    private static final Logger logger = LoggerFactory.getLogger(RoleController.class);

    @Autowired
    private RoleService roleService;

    @RequestMapping("/list")
    public List<Role> queryAll() {

        List  repsone =  this.roleService.queryAll();
        logger.info("返回结果{}", JSON.toJSONString(repsone));
        return repsone;

    }

}