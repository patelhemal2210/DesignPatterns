package com.hemalpatel.structural.adapter;

import com.hemalpatel.structural.adapter.beans.LightningInput;

public interface LightningSocket {

	default public LightningInput getLightningInput() {
		return new LightningInput("Lightning Stream");
	}
}
