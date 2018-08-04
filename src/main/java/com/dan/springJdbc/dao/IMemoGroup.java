package com.dan.springJdbc.dao;

import com.dan.springJdbc.entity.MemoGroup;

public interface IMemoGroup {
    /**
     * 创建一个便签组
     */
    int addMemoGroup(MemoGroup memoGroup);
    /**
     * 更新便签组
     */
    int updateMemoGroup(MemoGroup memoGroup);
    /**
     * 删除便签组
     */
    int deleteMemoGroup(int id);
    /**
     * 查询便签组
     */
    void queryMemoGroup(int id);
}
