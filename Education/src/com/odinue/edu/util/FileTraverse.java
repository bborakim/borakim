package com.odinue.edu.util;

import java.io.File;

public class FileTraverse {
	
	public static interface FileHandler {
		int Handle(File f);
	}
	
	FileHandler handler=null;
	public FileTraverse(FileHandler handler){
		this.handler = handler;
	}
		
	public int t(File f){
		
		if(f.isFile()){
			if(handler == null) System.out.println("null:" + f.getPath());
			else return handler.Handle(f);
		}
		
		File[] fs = f.listFiles();
		int sum = 0;
		for(int i=0; i < fs.length; i++){
			sum  += t(fs[i]);
		}
		return sum;
	}

}
