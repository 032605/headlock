package com.headlock.headlock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.headlock.headlock.dto.RideDTO;
import com.headlock.headlock.service.RideService;

@Controller
public class RideController {
	@Autowired
	private RideService rideService;
	
	@RequestMapping("/")
	public String Showmap(Model model) throws Exception {
		
		List<RideDTO> rideDTO = (List<RideDTO>) rideService.ViewRideList();
		
		model.addAttribute("ride",rideDTO);
		
		System.out.println(rideDTO.size()  + "사이즈 ");
		
		/*
		for(int i=0;i<rideDTO.size();i++) {
			System.out.println("db 확인 :::   " + rideDTO.get(i).getRideDatetime());
		}
		*/
		return "map";
	}
	
	@RequestMapping("/map")
	public String Domap(Model model) throws Exception {
		
		List<RideDTO> rideDTO = (List<RideDTO>) rideService.ViewRideList();
		
		model.addAttribute("ride",rideDTO);
		
		
		return "map_test";
	}

}