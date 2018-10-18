package com.hemalpatel.structural.adapter;

import com.hemalpatel.structural.adapter.beans.Audio;
import com.hemalpatel.structural.adapter.beans.DigitalAV;
import com.hemalpatel.structural.adapter.beans.LightningInput;

public class LightningAdapterImpl implements LightningSocket, LightningAdapter {

	@Override
	public Audio getAudio() {
		LightningInput inputStream = getLightningInput();
		return convertLightningToAudio(inputStream);
	}

	@Override
	public DigitalAV getDigitalAV() {
		LightningInput inputStream = getLightningInput();
		return convertLightningToDigitalAV(inputStream);
	}
	
	private Audio convertLightningToAudio(LightningInput input) {
		String audioStream = "Audio Stream";
		/***
		 * Converting process happens here
		 */
		Audio audioOutput = new Audio(audioStream);
		System.out.println("Converting '" + input.getLightningInputStream() + "' To '" + audioOutput.getAudioStream() + "'");
		return audioOutput;
	}
	
	private DigitalAV convertLightningToDigitalAV(LightningInput input) {
		String digitalAVStream = "Digital AV Stream";
		/***
		 * Converting process happens here
		 */
		DigitalAV digitalAVOutput = new DigitalAV(digitalAVStream);
		System.out.println("Converting '" + input.getLightningInputStream() + "' To '" + digitalAVOutput.getDigitalAVStream() + "'");
		return digitalAVOutput;
	}
}
