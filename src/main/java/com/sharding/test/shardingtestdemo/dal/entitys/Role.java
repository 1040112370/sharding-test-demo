package com.sharding.test.shardingtestdemo.dal.entitys;

public class Role {

    /**

     * 主健ID (无默认值)

     */

    private Integer id;

    /**

     * 角色名称(必填项)  (默认值为: )

     */

    private String name;

    public Integer getId() {

        return id;

    }

    public void setId(Integer id) {

        this.id = id;

    }

    public String getName() {

        return name;

    }

    public void setName(String name) {

        this.name = name;

    }

}