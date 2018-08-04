package com.dan.springJdbc.service;

import com.dan.springJdbc.entity.MemoGroup;

public interface Service {
    int addMemoGroup(MemoGroup memoGroup);
    int updateMemoGroup(MemoGroup memoGroup);
    int deleteMemoGroup(int id);
    void queryMemoGroup(int id);
}
