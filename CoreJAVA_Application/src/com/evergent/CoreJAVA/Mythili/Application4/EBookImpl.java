package com.evergent.CoreJAVA.Mythili.Application4;
//Extends Class of the EBook Abstract Class 

public class EBookImpl extends EBook {
	 EBookImpl(String title, int sizeInMB) {
	        super(title, sizeInMB);
	    }

	    @Override
	    void download() {
	        System.out.println("Downloading " + title + " (" + sizeInMB + "MB)...");
	        System.out.println("Download complete.");
	    }
}
