//DeviceInfo 2 v2
//Open Source and Free for use for any commercial or personal project.
package com.deviceinfo; //You must edit this to your package name.

import android.os.Build;
import android.os.Environment;

public class DeviceInfo {
	//Variables
	String phone = Build.DEVICE;
	String os = Build.VERSION.RELEASE;
	String data, boot, system, storage, realname, osh, format = null;
	boolean support, sndinit, oshsupport, databackup = false;
	
	//This method is used to identify the device
	public void Identify(){
		//Devices used for testing on rom 
		//factory 2 by beta testers and developer.
		if(phone.contentEquals("olympus")) //Atrix 4G
	    	
	    {
	    	realname = "Motorola Atrix 4G";
	    	
	    	boot = "/dev/block/mmcblk0p11";
	    	system = "/dev/block/mmcblk0p12";
	    	data = "/dev/block/mmcblk0p07";
	    	osh = "/dev/block/mmcblk0p13";
	    	format = "ext3";
	    	
	    	support = true;
			storage = Environment.getExternalStorageDirectory().getAbsolutePath();
		} 
	    else if(phone.contentEquals("maguro")) // Galaxy nexus
	    {
	    	realname = "GSM Galaxy Nexus";
	    	
	    	boot = "/dev/block/platform/omap/omap_hsmmc.0/by-name/boot";
	    	system = "/dev/block/platform/omap/omap_hsmmc.0/by-name/system";
	    	data = "/dev/block/platform/omap/omap_hsmmc.0/by-name/userdata";
	    	format = "ext4";
	    	
	    	support = true;	    	
	    	storage = Environment.getExternalStorageDirectory().getAbsolutePath();
	    } 
	    else if(phone.contentEquals("grouper")) // Nexus 7
	    {
	    	realname = "Asus Nexus 7";
	    	
	    	boot = "/dev/block/platform/sdhci-tegra.3/by-name/LNX";;
	    	system = "/dev/block/platform/sdhci-tegra.3/by-name/APP";
	    	data = "/dev/block/platform/sdhci-tegra.3/by-name/UDA";
	    	format = "ext4";
	    	
	    	support = true; 	
	    	storage = Environment.getExternalStorageDirectory().getAbsolutePath();
	    }
		//How to add a device
		//Simply cut and paste this and only add the variables required.
		//
	    else if (phone.contentEquals("example_device_change_me")) //Example device! Edit this to codename
	    {
	    	realname = "Example Device";
	    	
	    	boot = "boot partition goes here";
	    	system = "system partition goes here";
	    	data = "data partition goes here";
	    	format = "ie: ext4, ext3";
	    	
	    	support = false; //switch this to 'true' to add support for the device in App 	    	
	    	storage = Environment.getExternalStorageDirectory().getAbsolutePath(); //only change this if your device requires it.
	    }
		//If you don't require all variables dont use them 
		//
		//Devices are divided by maker and device type.
		//
		//Nexus
		//
		//Motorola
		//phones
	    else if (phone.contentEquals("edison")) // Atrix 2
	    {
	    	realname = "Motorola Atrix 2";
	    	
	    	system = "/dev/block/mmcblk1p21";
	    	format = "ext3";
	    	
	    	support = true; 	    	
	    	storage = Environment.getExternalStorageDirectory().getAbsolutePath(); 
	    }
	    else if (phone.contentEquals("dinara")) // Atrix HD
	    {
	    	realname = "Motorola Atrix HD";
	    	
	    	boot = "/dev/block/mmcblk0p31";
	    	system = "/dev/block/mmcblk0p36";
	    	data = "/dev/block/mmcblk0p38";
	    	format = "ext4";
	    	
	    	support = true;  	    	
	    	storage = Environment.getExternalStorageDirectory().getAbsolutePath(); 
	    }
	    else if (phone.contentEquals("spyder")) // RAZR
	    {
	    	realname = "Motorola RAZR";
	    	
	    	boot = "/dev/block/mmcblk1p14";
	    	system = "/dev/block/mmcblk1p20";
	    	data = "/dev/block/mmcblk1p24";
	    	format = "ext4";
	    	
	    	support = true; 	    	
	    	storage = Environment.getExternalStorageDirectory().getAbsolutePath(); 
	    }
	    else if (phone.contentEquals("smi")) // RAZR i
	    {
	    	realname = "Motorola RAZR i";
	    	
	    	boot = "/dev/block/mmcblk0p5";
	    	system = "/dev/block/mmcblk0p16";
	    	data = "/dev/block/mmcblk0p17";
	    	format = "ext4";
	    	
	    	support = true;  	    	
	    	storage = Environment.getExternalStorageDirectory().getAbsolutePath(); 
	    }
	    else if (phone.contentEquals("vanquish")) // RAZR HD
	    {
	    	realname = "Motorola RAZR HD";
	    	
	    	boot = "/dev/block/mmcblk0p31";
	    	system = "/dev/block/mmcblk0p36";
	    	data = "/dev/block/mmcblk0p38";
	    	format = "ext4";
	    	
	    	support = true;  	    	
	    	storage = Environment.getExternalStorageDirectory().getAbsolutePath(); 
	    }
	    else if (phone.contentEquals("scorpion_mini")) // RAZR M
	    {
	    	realname = "Motorola RAZR M";
	    	
	    	boot = "/dev/block/mmcblk0p31";
	    	system = "/dev/block/mmcblk0p36";
	    	data = "/dev/block/mmcblk0p38";
	    	format = "ext4";
	    	
	    	support = true; 	    	
	    	storage = Environment.getExternalStorageDirectory().getAbsolutePath();
	    }
	    else if (phone.contentEquals("droid2")) // Droid 2
	    {
	    	realname = "Motorola Droid 2";
	    	
	    	system = "/dev/block/mmcblk1p21";
	    	format = "ext3";
	    	
	    	support = true;  	    	
	    	storage = Environment.getExternalStorageDirectory().getAbsolutePath();
	    }
	    else if (phone.contentEquals("cdma_droid2we")) // Droid 2 Global
	    {
	    	realname = "Motorola Droid 2 Global";
	    	
	    	system = "/dev/block/mmcblk1p21";
	    	format = "ext3";
	    	
	    	support = true;     	
	    	storage = Environment.getExternalStorageDirectory().getAbsolutePath();
	    }
	    else if (phone.contentEquals("cdma_solana")) // Droid 3
	    {
	    	realname = "Motorola Droid 3";
	    	
	    	system = "/dev/block/mmcblk1p21";
	    	format = "ext3";
	    	
	    	support = true;  	    	
	    	storage = Environment.getExternalStorageDirectory().getAbsolutePath(); 
	    }
	    else if (phone.contentEquals("maserati")) // Droid 4
	    {
	    	realname = "Motorola Droid 4";
	    	
	    	boot = "/dev/block/mmcblk1p14";
	    	system = "/dev/block/mmcblk1p20";
	    	data = "/dev/block/mmcblk1p24";
	    	format = "ext4";
	    	
	    	support = true;	    	
	    	storage = Environment.getExternalStorageDirectory().getAbsolutePath(); 
	    }
	    else if (phone.contentEquals("shadow")) // DROID X
	    {
	    	realname = "Motorola DROID X";
	    	
	    	system = "/dev/block/mmcblk1p21";
	    	data = "/dev/block/mmcblk1p24";
	    	format = "ext3";
	    	
	    	support = true;  	    	
	    	storage = Environment.getExternalStorageDirectory().getAbsolutePath(); 
	    }
	    else if (phone.contentEquals("targa")) // DROID Bionic
	    {
	    	realname = "Motorola DROID Bionic";
	    	
	    	boot = "/dev/block/mmcblk1p15";
	    	system = "/dev/block/mmcblk1p21";
	    	data = "/dev/block/mmcblk1p25";
	    	format = "ext4";
	    	
	    	support = true;  	    	
	    	storage = Environment.getExternalStorageDirectory().getAbsolutePath(); 
	    }
	    else if (phone.contentEquals("sunfire")) // Photon 4G
	    {
	    	realname = "Motorola Photon 4G";
	    	
	    	boot = "/dev/block/mmcblk0p11";
	    	system = "/dev/block/mmcblk0p12";
	    	data = "/dev/block/mmcblk0p07";
	    	osh = "/dev/block/mmcblk0p13";
	    	format = "ext4";
	    	
	    	support = true; 	    	
	    	storage = Environment.getExternalStorageDirectory().getAbsolutePath(); 
	    }
	    else if (phone.contentEquals("triumph") || phone.contentEquals("WX435") || phone.contentEquals("fb0")) // Triumph
	    {
	    	realname = "Motorola Triumph";
	    	
	    	boot = "/dev/block/mmcblk0p5";
	    	system = "/dev/block/mmcblk0p7";
	    	format = "ext3";
	    	
	    	support = true;  	    	
	    	storage = Environment.getExternalStorageDirectory().getAbsolutePath();
	    }
	    else if (phone.contentEquals("umts_jordan") || phone.contentEquals("jordan")) // Defy
	    {
	    	realname = "Motorola Defy";
	    	
	    	system = "/dev/block/mmcblk1p21";
	    	format = "ext3";
	    	
	    	support = true; 	    	
	    	storage = Environment.getExternalStorageDirectory().getAbsolutePath(); 
	    }
	    else if (phone.contentEquals("jordan_plus")) // Defy+
	    {
	    	realname = "Motorola Defy+";
	    	
	    	system = "/dev/block/mmcblk1p21";
	    	format = "ext3";
	    	
	    	support = true; 	    	
	    	storage = Environment.getExternalStorageDirectory().getAbsolutePath();
	    }
		//tablets
	    else if (phone.contentEquals("wingray") || phone.contentEquals("stingray")) // Xoom
	    {
	    	realname = "Motorola Xoom";
	    	
	    	boot = "/dev/block/platform/sdhci-tegra.3/by-name/boot";
	    	system = "/dev/block/platform/sdhci-tegra.3/by-name/system";
	    	data = "/dev/block/platform/sdhci-tegra.3/by-name/data";
	    	format = "ext3";
	    	
	    	support = true;  	    	
	    	storage = Environment.getExternalStorageDirectory().getAbsolutePath(); 
	    }		
		//LG
		//
		//Sony
		//
		//Samsung
		//
		//OPPO
		//
	    else
	    	{
	    	realname = "Not Available";
	    	support = false;
	    	storage = Environment.getExternalStorageDirectory().getAbsolutePath();
	    	}
	}
	
	//Returns values about the device. IE: boot partition, device name, device storage.
	public  String[] getInfo(){
	
		String[] inf = new String[8];
		inf[0] = realname;
		inf[1] = phone;
		inf[2] = os;
		inf[3] = boot;
		inf[4] = system;
		inf[5] = data;
		inf[6] = osh;
		inf[7] = storage;
	
		return inf;
		
	}
	//Returns values about the format use for storage. IE: ext3, ext4 
	public  String[] getFormat(){
	
		String[] form = new String[1];
		form[0] = format;
		
		return form;
		
	}
	
	//Return values about support. IE: the app functions with the device, the device may be a 2nd init device,
	// the device has an osh/webtop partition
	public boolean[] getSupport(){
		
		if(boot == null){
			sndinit = true;
		}
		if(data == null){
			databackup = false;
		} else {
			databackup = true;
		}
		if(osh == null){
			oshsupport = false;
		} else {
			oshsupport = true;
		}
		
		boolean[] supp = new boolean[4];
		supp[0] = support;
		supp[1] = sndinit;
		supp[2] = oshsupport;
		supp[3] = databackup;
				
		return supp;
		
	}
}
