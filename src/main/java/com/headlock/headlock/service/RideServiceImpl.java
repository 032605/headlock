package com.headlock.headlock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.headlock.headlock.dto.RideDTO;
import com.headlock.headlock.mapper.RideMapper;

@Service
public class RideServiceImpl implements RideService {
	@Autowired
	public RideMapper rideMapper;
	
	public List<RideDTO> ViewRideList() throws Exception{
		System.out.println("SERVICE");
		return rideMapper.ViewRideList();
	}
}
