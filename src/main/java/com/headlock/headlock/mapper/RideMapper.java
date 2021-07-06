package com.headlock.headlock.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.headlock.headlock.dto.RideDTO;

@Mapper
public interface RideMapper {

	public List<RideDTO> ViewRideList() throws Exception;
}
