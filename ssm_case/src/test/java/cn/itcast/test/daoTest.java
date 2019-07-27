package cn.itcast.test;

import cn.itcast.dao.AccountDao;
import cn.itcast.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class daoTest {

    @Test
    public void run1() throws IOException {
        //加载配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //创建sqlsession对象
        SqlSession session = factory.openSession();
        //获取代理对象
        AccountDao dao = session.getMapper(AccountDao.class);
        //调用查询方法
        List<Account> list = dao.findAll();
        for (Account account : list) {
            System.out.println(account);
        }
        //释放资源
        session.close();
        in.close();
    }

    @Test
    public void run2() throws IOException {
        //加载配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //创建sqlsession对象
        SqlSession session = factory.openSession();
        //获取代理对象
        AccountDao dao = session.getMapper(AccountDao.class);
        //调用查询方法
        Account account = new Account();
        account.setName("我是谁");
        account.setMoney(2000d);
        dao.saveAccount(account);
        session.commit();
        //释放资源
        session.close();
        in.close();
    }
}
