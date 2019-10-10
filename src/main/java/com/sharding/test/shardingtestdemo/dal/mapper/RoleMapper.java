package com.sharding.test.shardingtestdemo.dal.mapper;

import com.sharding.test.shardingtestdemo.dal.entitys.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**

* @Mapper 如果没有在SpringbootLearingApplication添加@MapperScan 注解的话，这里都需要一个这样的注解

*/
@Mapper
public interface RoleMapper {

    /**

     * 查询所有的角色

     *

     * @return

     */

    List<Role> queryAll();

    /**

     * 查询单个

     *

     * @param id

     * @return

     */

    Role selectOne(Integer id);

    /**

     * 新增

     *

     * @param role

     * @return

     */

    int add(Role role);

    /**

     * 修改

     *

     * @param role

     * @return

     */

    int update(Role role);

    /**

     * 删除

     *

     * @param id

     * @return

     */

    int delete(Integer id);

}