package cn.bdqn.bdqnproject.distributorch.service.impl;

import cn.bdqn.bdqnproject.distributorch.dao.TestMapper;
import cn.bdqn.bdqnproject.distributorch.service.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 杨幸运
 * @create 2020/12/5
 */
@Service
public class TestServiceImpl implements TestService {

    @Resource
    private TestMapper testMapper;

    @Override
    public String test(Integer id) {
        System.out.println("测试成功！");
        return testMapper.test(id);
    }
}
