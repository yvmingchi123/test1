package cn.bdqn.bdqnproject.distributorch.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author 杨幸运
 * @create 2020/12/5
 */
@Mapper
@Repository
public interface TestMapper {

    String test(Integer id);
}
