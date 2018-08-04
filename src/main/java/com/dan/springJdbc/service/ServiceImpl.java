package com.dan.springJdbc.service;

import com.dan.springJdbc.dao.JdbcTemplateImpl;
import com.dan.springJdbc.entity.MemoGroup;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.stereotype.Component;

@Component
@Data
public class ServiceImpl implements Service {
    @Autowired
    private JdbcTemplateImpl jdbcTemplate;
    @Override
    public int addMemoGroup(MemoGroup memoGroup) {
        return jdbcTemplate.addMemoGroup(memoGroup);
    }

    @Override
    public int updateMemoGroup(MemoGroup memoGroup) {
        return jdbcTemplate.updateMemoGroup(memoGroup);
    }

    @Override
    public int deleteMemoGroup(int id) {
        return jdbcTemplate.deleteMemoGroup(id);
    }

    @Override
    public void queryMemoGroup(int id) {
      jdbcTemplate.queryMemoGroup(id);
    }
}
