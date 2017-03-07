package boke.dao.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import boke.po.User;

public interface UserManager {

	/**
	 * 管理员登�?	 * @param username 管理员用户名
	 * @param password 管理员密�?	 * @return
	 */
	//�û���¼
	boolean login(String username,String password,HttpSession session);
	
	//通过ID去找user
	public User getUserByName(String name,HttpSession session);
	
	//�û�ע��
	void insert(String username,String author,String password);
	//�û��޸�
	void update(String username,String author,String password);
	
	//�ж��û��Ƿ����
	boolean existUser(String username);
	
	//�ҵ��Լ�����Ϣ
	public User findblog(String username);
		
	//getuser
	public User getUser(HttpSession session);
	
	public Integer getAuthor(String author);
	
	public void setSession(String username,HttpSession session);
	
	public List<User> alluser();
	
	public User fbByname(String author);
	
}
