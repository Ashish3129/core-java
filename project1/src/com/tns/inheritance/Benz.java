package com.tns.inheritance;

public class Benz extends car {
	private String modelName;
	//default constructor
	public Benz() {
		super();
	}
// parameterised constructor
	public Benz(String modelName) {
		super();
		this.modelName = modelName;
	}
	

	// set getters and setters
	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
		
	}
	@Override
	public String toString() {
		return "Benz [modelName=" + modelName + "]";
	}
	


}