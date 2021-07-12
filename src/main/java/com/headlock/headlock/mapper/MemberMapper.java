package com.headlock.headlock.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.headlock.headlock.dto.Member;

@Mapper
public interface MemberMapper {
	@Select("SELECT * FROM member WHERE id=#{id}")
	Member getUserProfile(@Param("id") String id);
	
	@Select("SELECT * FROM member")
	List<Member> getUserProfileList();
	
	@Insert("INSERT INTO member VALUES(#{id}, #{name}, #{age}, #{address})")
	int insertUserProfile(@Param("id") String id, @Param("name") String name, @Param("age") int age, @Param("address") String address);

	@Update("UPDATE member SET name=#{name}, age=#{age}, address=#{address} WHERE id=#{id}")
	int updateUserProfile(@Param("id") String id, @Param("name") String name, @Param("age") int age, @Param("address") String address);

	@Delete("DELETE FROM member WHERE id=#{id}")
	int deleteUserProfile(@Param("id") String id);

}
