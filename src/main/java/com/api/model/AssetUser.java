package com.api.model;

import java.util.ArrayList;
import java.util.List;

public class AssetUser {
	List<AssetsAllocation> assets ;
	User user;
	public List<AssetsAllocation> getAssets() {
		return assets;
	}
	public void setAssets(List<AssetsAllocation> assets) {
		this.assets = assets;
	}
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	@Override
	public String toString() {
		return "AssetUser [assets=" + assets + ", user=" + user + ", getAssets()=" + getAssets() + ", getUser()="
				+ getUser() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
