package com.example.demo;

/**
 * Created by LinyuZhang on 2017/7/13.
 */
import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import com.example.demo.UserLogin;

@Transactional
public interface UserLoginDao extends CrudRepository<UserLogin, Long>{
    UserLogin findByloginName(String loginName);
}
