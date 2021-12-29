package com.zwm.mywhitejotter.mapper;

import com.zwm.mywhitejotter.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @InterfaceName: UserMapper
 * @Description: TODO
 * @Author: zhangweiming
 * @Date: 21:55 2021/12/29
 * @Version: 1.0
 */
@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    User selectByUsername(String username);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
