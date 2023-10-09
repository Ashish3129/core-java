package com.tns.inheritance;

public class MercedesAclass extends Benz{
	private long maxspeed;
	// default constructor
	public MercedesAclass() {
		super();
	}
	// parameterised constructor

	public MercedesAclass(long maxspeed) {
		super();
		this.maxspeed = maxspeed;
	}


	// set getters and setters

	public long getMaxspeed() {
		return maxspeed;
	}

	public void setMaxspeed(long maxspeed) {
		this.maxspeed = maxspeed;
	}
	
	

	public MercedesAclass(String modelName) {
		super(modelName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "MercedesAclass [maxspeed=" + maxspeed + ", getModelName()=" + getModelName() + ", getCompanyName()="
				+ getCompanyName() + "]";
	}

	
	

	

	
	}