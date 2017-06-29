package com.thinking.service;

import java.util.List;

import com.thinking.bean.Users;

/**
 * ���� ������
 * ���ڣ�2017��6��29��
 * ��˾��ArteonWMS
 * �������û�ҵ���߼��ӿ�
 */
public interface UsersServiceI {
	public boolean login(Users user);
	public boolean addUser(Users user);
	public List<Users> findAllUsers();
	public Users findById(int id);
	public boolean update(Users users);
	public int delete(int id);
	public int deleteByWhere(List<Integer> list);
}
