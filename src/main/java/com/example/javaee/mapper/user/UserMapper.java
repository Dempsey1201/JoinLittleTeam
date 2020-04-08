package com.example.javaee.mapper.user;

import com.example.javaee.entity.feelback.FeelBack;
import com.example.javaee.entity.report.Report;
import com.example.javaee.entity.user.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: Yangfn
 * @Description:
 * @Date: 21:44 2019/12/3
 */
@Repository
@Mapper
public interface UserMapper {
    /**
     * 登录
     * @param user
     * @return
     * @throws Exception
     */
    public User login(@Param("user")User user) throws Exception;

    /**
     * 注册
     * @param user
     * @return
     * @throws Exception
     */
    public int addUser(@Param("user")User user)throws Exception;

    /**
     * 更新个人信息
     * @param user
     * @return
     * @throws Exception
     */
    public int updateUser(@Param("user") User user)throws Exception;
    /**
     * 更新密码
     * @param user
     * @return
     * @throws Exception
     */
    public int updatePassword(@Param("user")User user)throws Exception;

    /**
     * 更新密码
     * @param id
     * @return
     * @throws Exception
     */
    public int updateStatus(@Param("id")int id,@Param("status")int status)throws Exception;

    /**
     * 删除
     * @param card
     * @return
     * @throws Exception
     */
    public int deleteUser(@Param("card")String card)throws Exception;

    /**
     * 列出所有user
     * @return
     * @throws Exception
     */
    public List<User> listUser()throws Exception;
    /**
     * 查询
     * @return
     * @throws Exception
     */
    public List<User> queryUser(@Param("card")String card)throws Exception;
    /**
     * 查询
     * @return
     * @throws Exception
     */
    public List<Report> queryReport(@Param("stu_id")int stu_id)throws Exception;

    /**
     * 上传头像
     * @return
     * @throws Exception
     */
    public int uploadHead(@Param("id")int id,@Param("path")String path,@Param("HeadUrl")String HeadUrl)throws Exception;
    /**
     * 增加反馈
     * @param feelBack
     * @return
     * @throws Exception
     */
    public int addFeelBack(@Param("feelBack")FeelBack feelBack)throws Exception;
}
