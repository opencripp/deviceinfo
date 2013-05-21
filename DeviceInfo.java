//DeviceInfo 2 v1
//Open Source and Free for use for any commercial or personal project.
package com.deviceinfo; //You must edit this to your package name.

import android.os.Build;
import android.os.Environment;
import android.util.Log;

public class DeviceInfo {
  //all values
	String phone = Build.DEVICE;
	String os = Build.VERSION.RELEASE;
	String data, boot, system, storage, realname;
	boolean support, sndinit;
	
	//identify and load the values for the app
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
			
			storage = Environment.getExternalStorageDirectory().getAbsolutePath();
		} 
	    else if(phone.contentEquals("edison")) //moto atrix 2
	    {
	    	realname = "Motorola Atrix 2";
	    	support = true;

	    	data = "";
	    	boot = "";
			system = "/dev/block/mmcblk1p21";
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
	    	storage = Environment.getExternalStorageDirectory().getAbsolutePath();
	    } 
	    else if(phone.contentEquals("triumph")) //moto triumph
	    {
	    	realname = "Motorola Triumph";
	    	support = true;
	    	boot = "dev/block/mmcblk0p5";
			system = "/dev/block/mmcblk0p7";
	    	storage = Environment.getExternalStorageDirectory().getAbsolutePath();
	    } 
	    else if(phone.contentEquals("WX435")) //moto triumph WX435
	    {
	    	realname = "Motorola Triumph";
	    	support = true;
	    	boot = "dev/block/mmcblk0p5";
			system = "/dev/block/mmcblk0p7";
	    	storage = Environment.getExternalStorageDirectory().getAbsolutePath();
	    } 
	    else if(phone.contentEquals("fb0")) //moto triumph fb0
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
	    else if(phone.contentEquals("wingray")) // moto xoom	
	    {
	    	realname = "Motorola Xoom";
	    	support = true;
	    	boot = "/dev/block/platform/sdhci-tegra.3/by-name/boot";
	    	system = "/dev/block/platform/sdhci-tegra.3/by-name/system";
	    	storage = Environment.getExternalStorageDirectory().getAbsolutePath();
	    }
	    else if(phone.contentEquals("stingray")) // moto xoom
	    {
	    	realname = "Motorola Xoom";
	    	support = true;
	    	boot = "/dev/block/platform/sdhci-tegra.3/by-name/boot";
	    	system = "/dev/block/platform/sdhci-tegra.3/by-name/system";
	    	data = "/dev/block/platform/sdhci-tegra.3/by-name/data";
	    	storage = Environment.getExternalStorageDirectory().getAbsolutePath();
	    }
		
		//samsung
	    else if(phone.contentEquals("n7000")) // note ii
	    {
	    	realname = "Samsung Note II";
	    	support = true;
	    	boot = "/dev/block/mmcblk0p5";
	    	system = "/dev/block/mmcblk0p9";
	    	storage = Environment.getExternalStorageDirectory().getAbsolutePath();
	    } 
	    else if(phone.contentEquals("N7000")) // note ii
	    {
	    	realname = "Samsung Note II";
	    	support = true;
	    	boot = "/dev/block/mmcblk0p5";
	    	system = "/dev/block/mmcblk0p9";
	    	storage = Environment.getExternalStorageDirectory().getAbsolutePath();
	    }
	    else if(phone.contentEquals("galaxynote")) // note ii
	    {
	    	realname = "Samsung Note II";
	    	support = true;
	    	boot = "/dev/block/mmcblk0p5";
	    	system = "/dev/block/mmcblk0p9";
	    	storage = Environment.getExternalStorageDirectory().getAbsolutePath();
	    }
	    else if(phone.contentEquals("GT-N7000")) // note ii
	    {
	    	realname = "Samsung Note II";
	    	support = true;
	    	boot = "/dev/block/mmcblk0p5";
	    	system = "/dev/block/mmcblk0p9";
	    	storage = Environment.getExternalStorageDirectory().getAbsolutePath();
	    }
	    else if(phone.contentEquals("n7100")) // note ii intl
	    {
	    	realname = "International Samsung Note II";
	    	support = true;
	    	boot = "/dev/block/mmcblk0p8";
	    	system = "/dev/block/mmcblk0p13";
	    	storage = Environment.getExternalStorageDirectory().getAbsolutePath();
	    } 
	    else if(phone.contentEquals("t03g")) // note ii intl
	    {
	    	realname = "International Samsung Note II";
	    	support = true;
	    	boot = "/dev/block/mmcblk0p8";
	    	system = "/dev/block/mmcblk0p13";
	    	storage = Environment.getExternalStorageDirectory().getAbsolutePath();
	    } 
	    else if(phone.contentEquals("GT-N7100")) // note ii intl
	    {
	    	realname = "International Samsung Note II";
	    	support = true;
	    	boot = "/dev/block/mmcblk0p8";
	    	system = "/dev/block/mmcblk0p13";
	    	storage = Environment.getExternalStorageDirectory().getAbsolutePath();
	    } 
	    else if(phone.contentEquals("l900")) // sprint note ii
	    {
	    	realname = "Sprint Samsung Note II";
	    	support = true;
	    	boot = "/dev/block/mmcblk0p8";
	    	system = "/dev/block/mmcblk0p13";
	    	storage = Environment.getExternalStorageDirectory().getAbsolutePath();
	    } 
	    else if(phone.contentEquals("t0ltespr")) // sprint note ii
	    {
	    	realname = "Sprint Samsung Note II";
	    	support = true;
	    	boot = "/dev/block/mmcblk0p8";
	    	system = "/dev/block/mmcblk0p13";
	    	storage = Environment.getExternalStorageDirectory().getAbsolutePath();
	    } 
	    else if(phone.contentEquals("SPH-L900")) // sprint note ii
	    {
	    	realname = "Sprint Samsung Note II";
	    	support = true;
	    	boot = "/dev/block/mmcblk0p8";
	    	system = "/dev/block/mmcblk0p13";
	    	storage = Environment.getExternalStorageDirectory().getAbsolutePath();
	    } 
	    else if(phone.contentEquals("i9305")) // samsung galaxy siii gsm lte
	    {
	    	realname = "Samsung GS3 GSM LTE";
	    	support = true;
	    	boot = "/dev/block/mmcblk0p8";
	    	system = "/dev/block/mmcblk0p13";
	    	storage = Environment.getExternalStorageDirectory().getAbsolutePath();
	    } 
	    else if(phone.contentEquals("m3")) // samsung galaxy siii gsm lte
	    {
	    	realname = "Samsung GS3 GSM LTE";
	    	support = true;
	    	boot = "/dev/block/mmcblk0p8";
	    	system = "/dev/block/mmcblk0p13";
	    	storage = Environment.getExternalStorageDirectory().getAbsolutePath();
	    } 
	    else if(phone.contentEquals("m3xx")) // samsung galaxy siii gsm lte
	    {
	    	realname = "Samsung GS3 GSM LTE";
	    	support = true;
	    	boot = "/dev/block/mmcblk0p8";
	    	system = "/dev/block/mmcblk0p13";
	    	storage = Environment.getExternalStorageDirectory().getAbsolutePath();
	    } 
	    else if(phone.contentEquals("GT-I9305")) // samsung galaxy siii gsm lte
	    {
	    	realname = "Samsung GS3 GSM LTE";
	    	support = true;
	    	boot = "/dev/block/mmcblk0p8";
	    	system = "/dev/block/mmcblk0p13";
	    	storage = Environment.getExternalStorageDirectory().getAbsolutePath();
	    } 
	    else if(phone.contentEquals("i9300")) // samsung galaxy siii intl
	    {
	    	realname = "Samsung GS3 International";
	    	support = true;
	    	boot = "/dev/block/mmcblk0p8";
	    	system = "/dev/block/mmcblk0p13";
	    	storage = Environment.getExternalStorageDirectory().getAbsolutePath();
	    } 
	    else if(phone.contentEquals("m0")) // samsung galaxy siii intl
	    {
	    	realname = "Samsung GS3 International";
	    	support = true;
	    	boot = "/dev/block/mmcblk0p8";
	    	system = "/dev/block/mmcblk0p13";
	    	storage = Environment.getExternalStorageDirectory().getAbsolutePath();
	    } 
	    else if(phone.contentEquals("GT-I9300")) // samsung galaxy siii intl
	    {
	    	realname = "Samsung GS3 International";
	    	support = true;
	    	boot = "/dev/block/mmcblk0p8";
	    	system = "/dev/block/mmcblk0p13";
	    	storage = Environment.getExternalStorageDirectory().getAbsolutePath();
	    } 
	    else if(phone.contentEquals("i9103")) // samsung galaxy r
	    {
	    	realname = "Samsung Galaxy R";
	    	support = true;
	    	boot = "/dev/block/mmcblk0p9";
	    	system = "/dev/block/mmcblk0p2";
	    	storage = Environment.getExternalStorageDirectory().getAbsolutePath();
	    } 
	    else if(phone.contentEquals("galaxyr")) // samsung galaxy r
	    {
	    	realname = "Samsung Galaxy R";
	    	support = true;
	    	boot = "/dev/block/mmcblk0p9";
	    	system = "/dev/block/mmcblk0p2";
	    	storage = Environment.getExternalStorageDirectory().getAbsolutePath();
	    } else if(phone.contentEquals("GT-I903")) // samsung galaxy r
	    {
	    	realname = "Samsung Galaxy R";
	    	support = true;
	    	boot = "/dev/block/mmcblk0p9";
	    	system = "/dev/block/mmcblk0p2";
	    	storage = Environment.getExternalStorageDirectory().getAbsolutePath();
	    } 
	    else if(phone.contentEquals("GTI9103")) // samsung galaxy r
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
	    else if(phone.contentEquals("mint")) // sony xperia t
	    {
	    	realname = "Sony Xperia T";
	    	support = true;
	    	boot = "/dev/block/mmcblk0p4";
	    	system = "/dev/block/mmcblk0p12";
	    	storage = Environment.getExternalStorageDirectory().getAbsolutePath();
	    } 
	    else if(phone.contentEquals("LT30p")) // sony xperia t
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
	
	//return strings device values on a simple string array. 
	public  String[] getInfo(){
	
		String[] arr = new String[7];
		arr[0] = phone;
		arr[1] = os;
		arr[2] = boot;
		arr[3] = system;
		arr[4] = data;
		arr[5] = storage;
		arr[6] = realname;
		
		Log.v("devinfo", "Returning Info array");
		
		return arr;
		
	}
	
	//return boolean device values on a simple boolean array
	public boolean[] getSupport(){
		
		boolean[] supp = new boolean[2];
		supp[0] = support;
		supp[1] = sndinit;
		
		Log.v("devinfo", "Returning Support array");
		
		return supp;
		
	}
}
