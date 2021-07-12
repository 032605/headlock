package com.headlock.headlock.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.headlock.headlock.dto.Member;
import com.headlock.headlock.mapper.MemberMapper;

@RequestMapping("/member")
@RestController
public class MemberController {

	private MemberMapper mapper;
	
	public MemberController(MemberMapper mapper) {
		this.mapper = mapper;
	}
		
	@GetMapping("/{id}")
	public Member getUserProfile(@PathVariable("id") String id) {
		return mapper.getUserProfile(id);
	}
	
	@GetMapping("/all")
	public List<Member> getUserProfileList() {
		return mapper.getUserProfileList();
	}
	
	@PutMapping("/insert")
	public void putUserProfile(@RequestParam("id") String id, @RequestParam("name") String name, @RequestParam("age") int age, @RequestParam("address") String address) {
		mapper.insertUserProfile(id, name, age, address);
	}
	
	@PostMapping("/{id}")
	public void postUserProfile(@PathVariable("id") String id, @RequestParam("name") String name, @RequestParam("age") int age, @RequestParam("address") String address) {
		mapper.updateUserProfile(id, name, age, address);
	}
	
	@DeleteMapping("/{id}")
	public void deleteUserProfile(@PathVariable("id") String id) {
		mapper.deleteUserProfile(id);
	}

}