package com.odinue.edu;

import java.io.File;

public class FileTravese {
	public static abstract class FileHandler {
		public abstract int Handler(File f);
	}
	FileHandler handler=null;
	
	public FileTravese(FileHandler handler){
		this.handler = handler;
	}
	
	public int t(File f){
		
		if(f.isFile()){
			if(handler == null) System.out.println(f.getPath());
			else return handler.Handler(f);
		}
		
		File[] fs = f.listFiles();
		int sum=0;
		for(int i = 0; i < fs.length; i++){
			sum += t(fs[i]);
		}
		return sum;
	}
}
