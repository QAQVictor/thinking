package com.thinking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thinking.bean.Users;
import com.thinking.mapper.UsersMapper;

/**
 * ���� ������ ���ڣ�2017��6��29�� ��˾��ArteonWMS �������û�ҵ���߼�ʵ��
 */
@Service
public class UsersServiceImpl implements UsersServiceI {
	@Autowired
	private UsersMapper um;

	public boolean login(Users user) {
		// �û���¼
		if (um.selectByUserName(user) != null) {
			return true;
		} else {
			return false;
		}
	}

	public boolean addUser(Users user) {
		// ����û�
		if (um.insert(user) > 0) {
			return true;
		} else {
			return false;
		}
	}

	public List<Users> findAllUsers() {
		// ���������û�
		List<Users> usersList = um.selectAll();
		if (usersList != null) {
			for (Users user : usersList) {
				System.out.println(user.getUserName());
			}
			return usersList;
		} else {
			return null;
		}
	}

	public Users findById(int id) {
		// �����û�id����
		System.out.println(um.selectByPrimaryKey(id).getUserName());
		return um.selectByPrimaryKey(id);

	}

	public boolean update(Users user) {
		// �����û�����
		if (um.updateByPrimaryKey(user) > 0) {
			System.out.println(um.selectByPrimaryKey(user.getUserId()));
			return true;
		}
		return false;
	}

	public int delete(int id) {
		// ɾ���û�
		return um.deleteByPrimaryKey(id);
	}
	public int deleteByWhere(List<Integer> list) {
		// ����ɾ���û�������ɾ����Ŀ
		return um.deleteByWhere(list);
	}
}
