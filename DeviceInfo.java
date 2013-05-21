//DeviceInfo 2 v1
//Open Source and Free for use for any commercial or personal project.
package com.deviceinfo; //You must edit this to your package name.

import android.os.Build;
import android.os.Environment;
import android.util.Log;

public class DeviceInfo {
	//Variables
	String phone = Build.DEVICE;
	String os = Build.VERSION.RELEASE;
	String data, boot, system, storage, realname, osh, format;
	boolean support, sndinit = false;
	
	//This method is used to identify the device
	public void Identify(){
		
		//devices are separated by maker
		
		//motorola
		//phones
		if(phone.contentEquals("olympus")) //moto atrix
	    	
	    {
	    	realname = "Motorola Atrix 4G";
	    	support = true;

	    	data = "/dev/block/mmcblk0p07";
	    	boot = "/dev/block/mmcblk0p11";
			system = "/dev/block/mmcblk0p12";
			osh = "here goes the webtop partition";
			
			format = "ext3";
			storage = Environment.getExternalStorageDirectory().getAbsolutePath();
		} 
	    else if(phone.contentEquals("edison")) //moto atrix 2
	    {
	    	realname = "Motorola Atrix 2";
	    	support = true;

	    	data = "";
	    	boot = "";
			system = "/dev/block/mmcblk1p21";
			
			format = "ext3";
	    	storage = Environment.getExternalStorageDirectory().getAbsolutePath();
	    } 
	    else if(phone.contentEquals("dinara")) //moto atrix hd
	    {
	    	realname = "Motorola Atrix HD";
	    	support = true;									

	    	data = "/dev/block/mmcblk0p38";
	    	boot = "/dev/block/mmcblk0p31";
			system = "/dev/block/mmcblk0p36";
			storage = Environment.getExternalStorageDirectory().getAbsolutePath();
	    } 
	        else if(phone.contentEquals("smi")) //moto razr i
	    {
	    	realname = "RAZR i";
	    	support = true;
	    	
	    	data = "/dev/block/mmcblk0p17";
	    	boot = "/dev/block/mmcblk0p5";
			system = "/dev/block/mmcblk0p16";
			storage = Environment.getExternalStorageDirectory().getAbsolutePath();
	    } 
	        else if(phone.contentEquals("vanquish")) //moto razr hd
	    {
	    	realname = "Motorola RAZR HD";
	    	support = true;	
	    	
	    	data = "/dev/block/mmcblk0p38";
	    	boot = "/dev/block/mmcblk0p31";
			system = "/dev/block/mmcblk0p36";
			storage = Environment.getExternalStorageDirectory().getAbsolutePath();
	    } 
	            else if(phone.contentEquals("scorpion_mini")) //moto razr m
	    {
	    	realname = "Motorola RAZR M";
	    	support = true;		
	    	
	    	data = "/dev/block/mmcblk0p38";
	    	boot = "/dev/block/mmcblk0p31";
			system = "/dev/block/mmcblk0p36";
			storage = Environment.getExternalStorageDirectory().getAbsolutePath();
	    }
	    else if(phone.contentEquals("spyder")) //moto razr
	    {
	    	realname = "Motorola RAZR";
	    	support = true;
	    	
	    	data = "/dev/block/mccblk1p24";
	    	boot = "/dev/block/mccblk1p14";
			system = "/dev/block/mccblk1p20";
	    	storage = Environment.getExternalStorageDirectory().getAbsolutePath();
	    }
	    else if(phone.contentEquals("maserati")) //moto droid 4
	    {
	    	realname = "Motorola DROID 4";
	    	support = true;
	    	
	    	data = "/dev/block/mccblk1p24";
	    	boot = "/dev/block/mccblk1p14";
			system = "/dev/block/mccblk1p20";
	    	storage = Environment.getExternalStorageDirectory().getAbsolutePath();
	    }
	    else if(phone.contentEquals("targa")) //moto droid bionic
	    {
	    	realname = "Motorola DROID BIONIC";
	    	support = true;
	    	
	    	data = "/dev/block/mccblk1p25";
	    	boot = "/dev/block/mccblk1p15";
			system = "/dev/block/mccblk1p21";
	    	storage = Environment.getExternalStorageDirectory().getAbsolutePath();
	    }    
	    else if(phone.contentEquals("sunfire")) //moto photon 4g
	    {
	    	realname = "Motorola Photon 4G";
	    	support = true;
	    	
	    	data = "/dev/block/mmcblk0p07";
	    	boot = "/dev/block/mmcblk0p11";
			system = "/dev/block/mmcblk0p12";
			osh = "here goes the webtop partition";
	    	storage = Environment.getExternalStorageDirectory().getAbsolutePath();
	    } 
		//moto triumph
	    else if(phone.contentEquals("triumph") || phone.contentEquals("WX435") || phone.contentEquals("fb0")) 
	    {
	    	realname = "Motorola Triumph";
	    	support = true;
	    	
	    	boot = "dev/block/mmcblk0p5";
			system = "/dev/block/mmcblk0p7";
	    	storage = Environment.getExternalStorageDirectory().getAbsolutePath();
	    } 
	    else if(phone.contentEquals("umts_jordan")) //motorola defy
	    {
	    	realname = "Motorola Defy";
	    	sndinit = true;
	    	support = true;
	    	
	    	system = "/dev/block/mmcblk1p21";
	    	storage = Environment.getExternalStorageDirectory().getAbsolutePath();
	    }
	    else if(phone.contentEquals("cdma_droid2we")) //motorola droid 2 global
	    {
	    	realname = "Motorola Droid 2 Global";
	    	sndinit = true;
	    	support = true;
	    	
	    	system = "/dev/block/mmcblk1p21";
	    	storage = Environment.getExternalStorageDirectory().getAbsolutePath();
	    }
	    else if(phone.contentEquals("cdma_solana")) //motorola droid 3
	    {
	    	realname = "Motorola Droid 3";
	    	sndinit = true;
	    	support = true;
	    	
	    	boot = "Not Supported";
	    	system = "/dev/block/mmcblk1p21";
	    	storage = Environment.getExternalStorageDirectory().getAbsolutePath();
	    }
	    // tablets
	    else if(phone.contentEquals("wingray") || phone.contentEquals("stingray")) // moto xoom	
	    {
	    	realname = "Motorola Xoom";
	    	support = true;
	    	
	    	boot = "/dev/block/platform/sdhci-tegra.3/by-name/boot";
	    	system = "/dev/block/platform/sdhci-tegra.3/by-name/system";
	    	data = "/dev/block/platform/sdhci-tegra.3/by-name/data";
	    	storage = Environment.getExternalStorageDirectory().getAbsolutePath();
	    }

		
		//samsung
		// note ii
	    else if(phone.contentEquals("n7000") || phone.contentEquals("N7000") || phone.contentEquals("galaxynote") || phone.contentEquals("GT-N7000")) 
	    {
	    	realname = "Samsung Note II";
	    	support = true;
	    	
	    	boot = "/dev/block/mmcblk0p5";
	    	system = "/dev/block/mmcblk0p9";
	    	storage = Environment.getExternalStorageDirectory().getAbsolutePath();
	    } 
		// note ii intl
	    else if(phone.contentEquals("n7100") || phone.contentEquals("t03g") || phone.contentEquals("GT-N7100")) 
	    {
	    	realname = "International Samsung Note II";
	    	support = true;
	    	
	    	boot = "/dev/block/mmcblk0p8";
	    	system = "/dev/block/mmcblk0p13";
	    	storage = Environment.getExternalStorageDirectory().getAbsolutePath();
	    } 
		// sprint note ii
	    else if(phone.contentEquals("l900") || phone.contentEquals("t0ltespr") || phone.contentEquals("SPH-L900")) 
	    {
	    	realname = "Sprint Samsung Note II";
	    	support = true;
	    	
	    	boot = "/dev/block/mmcblk0p8";
	    	system = "/dev/block/mmcblk0p13";
	    	storage = Environment.getExternalStorageDirectory().getAbsolutePath();
	    }  
		// samsung galaxy siii gsm lte
	    else if(phone.contentEquals("i9305") || phone.contentEquals("m3") || phone.contentEquals("m3xx") || phone.contentEquals("GT-I9305")) 
	    {
	    	realname = "Samsung GS3 GSM LTE";
	    	support = true;
	    	
	    	boot = "/dev/block/mmcblk0p8";
	    	system = "/dev/block/mmcblk0p13";
	    	storage = Environment.getExternalStorageDirectory().getAbsolutePath();
	    } 
		// samsung galaxy siii intl
	    else if(phone.contentEquals("i9300") || phone.contentEquals("m0") || phone.contentEquals("GT-I9300")) 
	    {
	    	realname = "Samsung GS3 International";
	    	support = true;
	    	
	    	boot = "/dev/block/mmcblk0p8";
	    	system = "/dev/block/mmcblk0p13";
	    	storage = Environment.getExternalStorageDirectory().getAbsolutePath();
	    } 
		// samsung galaxy r
	    else if(phone.contentEquals("i9103") || phone.contentEquals("galaxyr") || phone.contentEquals("GT-I903") || phone.contentEquals("GTI9103")) 
	    {
	    	realname = "Samsung Galaxy R";
	    	support = true;
	    	
	    	boot = "/dev/block/mmcblk0p9";
	    	system = "/dev/block/mmcblk0p2";
	    	storage = Environment.getExternalStorageDirectory().getAbsolutePath();
	    }		
		//htc
		
		//lg
		
		//sony
		// sony xperia t
	    else if(phone.contentEquals("mint") || phone.contentEquals("LT30p")) 
	    {
	    	realname = "Sony Xperia T";
	    	support = true;
	    	
	    	boot = "/dev/block/mmcblk0p4";
	    	system = "/dev/block/mmcblk0p12";
	    	storage = Environment.getExternalStorageDirectory().getAbsolutePath();
	    } 
		
		//nexus
		//phones
	    else if(phone.contentEquals("maguro")) // gsm galaxy nexus
	    {
	    	realname = "GSM Galaxy Nexus";
	    	support = true;
	    	
	    	boot = "/dev/block/platform/omap/omap_hsmmc.0/by-name/boot";
	    	system = "/dev/block/platform/omap/omap_hsmmc.0/by-name/system";
	    	data = "/dev/block/platform/omap/omap_hsmmc.0/by-name/userdata";
	    	storage = Environment.getExternalStorageDirectory().getAbsolutePath();
	    } 
	    else if(phone.contentEquals("mako")) // gsm lg nexus 4
	    {
	    	realname = "LG Nexus 4";
	    	support = true;
	    	
	    	boot = "/dev/block/platform/msm_sdcc.1/by-name/boot";
	    	system = "/dev/block/platform/msm_sdcc.1/by-name/system";
	    	data = "/dev/block/platform/msm_sdcc.1/by-name/data";
	    	storage = Environment.getExternalStorageDirectory().getAbsolutePath();
	    } 
	    else if(phone.contentEquals("tilapia")) // gsm asus nexus 7
	    {
	    	realname = "ATT Asus Nexus 7";
	    	support = true;
	    	
	    	boot = "/dev/block/platform/sdhci-tegra.3/by-name/LNX";;
	    	system = "/dev/block/platform/sdhci-tegra.3/by-name/APP";
	    	storage = Environment.getExternalStorageDirectory().getAbsolutePath();
	    }
				
		//
	    else
	    	{
	    	realname = "Not Available";
	    	support = false;
	    	storage = Environment.getExternalStorageDirectory().getAbsolutePath();
	    	}
		Log.v("devinfo", "Device: " + phone + ", Support:" + support);
	}
	
	//Returns values about the device. IE: boot partition, device name, device storage.
	public  String[] getInfo(){
	
		String[] arr = new String[8];
		arr[0] = phone;
		arr[1] = os;
		arr[2] = boot;
		arr[3] = system;
		arr[4] = data;
		arr[5] = storage;
		arr[6] = realname;
		arr[7] = osh;
		
		Log.v("devinfo", "Returning Info array");
		
		return arr;
		
	}
	//Returns values about the format use for storage. IE: ext3, ext4 
	public  String[] getFormat(){
	
		String[] arr1 = new String[1];
		arr1[0] = format;

		Log.v("devinfo", "Returning Format array");
		
		return arr1;
		
	}
	
	//Return values about support. IE: the app functions with the device, the device may be a 2nd init device
	public boolean[] getSupport(){
		
		boolean[] supp = new boolean[2];
		supp[0] = support;
		supp[1] = sndinit;
		
		Log.v("devinfo", "Returning Support array");
		
		return supp;
		
	}
}
