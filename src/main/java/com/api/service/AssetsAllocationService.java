package com.api.service;

import java.util.HashMap;
import java.util.List;

import com.api.model.Assets;
import com.api.model.AssetsAllocation;

public interface AssetsAllocationService {
	
	public List<AssetsAllocation> getAllAssetsAllocations();
	
	public void addAssetsAllocation(AssetsAllocation assets);
	
	public AssetsAllocation getAssetsAllocations(int assetsId);
	
	public AssetsAllocation updateAssetsAllocations(AssetsAllocation assets);
	
	public void deleteAssetsAllocations(Integer assetsAllocationsId);
	
}

