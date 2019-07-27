package cn.itcast.dao;

import cn.itcast.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AccountDao {
    /**
     * 保存账户
     * @param account
     */
    @Insert("insert into account(name,money) values(#{name},#{money})")
    public void saveAccount(Account account);

    /**
     * 查询所有账户
     * @return
     */
    @Select("select * from account")
    public List<Account> findAll();
}
