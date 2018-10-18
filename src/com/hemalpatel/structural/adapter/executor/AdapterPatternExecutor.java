package com.hemalpatel.structural.adapter.executor;

import com.hemalpatel.base.BaseExecutor;
import com.hemalpatel.structural.adapter.LightningAdapterImpl;
import com.hemalpatel.structural.adapter.beans.Audio;
import com.hemalpatel.structural.adapter.beans.DigitalAV;

public class AdapterPatternExecutor implements BaseExecutor{

	@Override
	public void run() {
		
		printTitle();
		
		LightningAdapterImpl lightAdapter = new LightningAdapterImpl();
		Audio audioOutput = lightAdapter.getAudio();
		System.out.println("Converted Audio Output : " + audioOutput.getAudioStream());
		
		System.out.println();
		DigitalAV digitalAVOutput = lightAdapter.getDigitalAV();
		System.out.println("Converted Digital AV Output : " + digitalAVOutput.getDigitalAVStream());
		
		printFooter();
	}

	@Override
	public void printTitle() {
		System.out.println("\n*********************************");
		System.out.println("-- Structural Patterns");
		System.out.println("---- Adapter Pattern\n");
	}

	@Override
	public void printFooter() {
		System.out.println("\n-- END OF Adapter Pattern --");
		System.out.println("*********************************\n");		
	}


}
