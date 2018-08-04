package com.dan.springJdbc.dao;

import com.dan.springJdbc.entity.MemoGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class JdbcTemplateImpl implements IMemoGroup {

    @Autowired
    private  JdbcTemplate jdbcTemplate;

//    public JdbcTemplateImpl(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }

    /**
     * 添加便签组
     */
    @Override
    public int addMemoGroup(MemoGroup memoGroup){
      int effect= this.jdbcTemplate.update("insert into memo_group (id, name, created_time) values (?,?,?);"
       ,memoGroup.getId(),memoGroup.getName(),memoGroup.getCreatedTime());
            return effect;
    }

    /**
     * 更新便签组
     * @return
     */
    @Override
    public int updateMemoGroup(MemoGroup memoGroup) {
       int effect= this.jdbcTemplate.update("update memo_group set name=? where id=?;",memoGroup.getName(),memoGroup.getId());
       return effect;
    }

    /**
     * 删除便签组
     * @return
     */
    @Override
    public int deleteMemoGroup(int id) {
        int effect=this.jdbcTemplate.update("delete from memo_group where id=?;",id);
        return effect;
    }

    /**
     * 根据id查询便签组信息
     * @return
     */
    @Override
    public void queryMemoGroup(int id) {
      this.jdbcTemplate.query("select (id, name, created_time, modify_time) from memo_group where id=?; "
              , new RowMapper<MemoGroup>() {

                  @Override
                  public MemoGroup mapRow(ResultSet resultSet, int i) throws SQLException {
                      MemoGroup memoGroup=new MemoGroup();
                      memoGroup.setName(resultSet.getString("name"));
                      memoGroup.setId(resultSet.getInt("id"));
                      memoGroup.setCreatedTime(resultSet.getTime(" created_time"));
                      memoGroup.setModifyTime(resultSet.getTime("modify_time"));
                      System.out.println(memoGroup);
                      return memoGroup;
                  }
              },id
      );
    }

}
