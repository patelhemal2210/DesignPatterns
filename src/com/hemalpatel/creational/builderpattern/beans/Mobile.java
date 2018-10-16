package com.hemalpatel.creational.builderpattern.beans;

public class Mobile {

	private String processor;
	private String operatingSystem;
	private String memory;
	
	/**
	 * Optional Parameter
	 */
	
	private boolean isWaterProof;
	private boolean isDustProof;
	
	private Mobile(MobileBuilder builder) {
		this.processor = builder.processor;
		this.operatingSystem = builder.operatingSystem;
		this.memory = builder.memory;
		this.isWaterProof = builder.isWaterProof;
		this.isDustProof = builder.isDustProof;
	}

	public String getProcessor() {
		return processor;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public String getMemory() {
		return memory;
	}

	public boolean isWaterProof() {
		return isWaterProof;
	}

	public boolean isDustProof() {
		return isDustProof;
	}
	
	public static class MobileBuilder {
		private String processor;
		private String operatingSystem;
		private String memory;
		
		/**
		 * Optional Parameter
		 */
		
		private boolean isWaterProof;
		private boolean isDustProof;
		
		public MobileBuilder(String aProcessor, String aOperatingSystem, String aMemory) {
			this.processor = aProcessor;
			this.operatingSystem = aOperatingSystem;
			this.memory = aMemory;	
		}
		
		public MobileBuilder setWaterProofEnabled(boolean aIsWaterProof) {
			this.isWaterProof = aIsWaterProof;
			return this;
		}
		
		public MobileBuilder setDustProofEnabled(boolean aIsDustProof) {
			this.isDustProof = aIsDustProof;
			return this;
		}
		
		public Mobile build() {
			return new Mobile(this);
		}
		
		
	}

	public String printDetails() {
		return "Processor : " + getProcessor() + "\nOperating System : " + getOperatingSystem() + "\nMemory : " + getMemory() + "\nWater Proof : " + isWaterProof() + "\nDust Proof : " + isDustProof() ;
	}
	
}
