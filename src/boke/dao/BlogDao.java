package boke.dao;

import java.util.List;

import boke.po.Blog;


public interface BlogDao {
	
	Blog get(String title); //�ؼ��ּ���

	Blog getById(Integer bid);
	
	void save(Blog blog);

	void update(Blog blog);

	void delete(Blog blog);

	void delete(Integer id);

	List<Blog> findAll();
}
