package com.thinking.mapper;

import java.util.List;

import com.thinking.bean.Users;

/**
 * ���� ������
 * ���ڣ�2017��6��29��
 * ��˾��ArteonWMS
 * ������UsersMapper�ӿ�
 */
public interface UsersMapper {
	//����idɾ���û�
    int deleteByPrimaryKey(Integer userid);
    //����û�
    int insert(Users record);

    int insertSelective(Users record);
    //����id�����û�
    Users selectByPrimaryKey(Integer userid);
    
    int updateByPrimaryKeySelective(Users record);
    //�����û���Ϣ
    int updateByPrimaryKey(Users record);
    //�����û��������û�
    int selectByUserName(Users user);
    //���������û�
    List<Users> selectAll();
    
    int deleteByWhere(List<Integer>list);
}