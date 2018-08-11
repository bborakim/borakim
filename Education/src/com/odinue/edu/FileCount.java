package com.odinue.edu;

import java.io.File;



class FileTraverse1{
	int t(File f){
		if(f.isFile()){
			System.out.println(f.getPath());
			return 1;
		}
		
		File[] fs=f.listFiles();
		int sum = 0;
		for(int i =0; i < fs.length; i++){
			sum += t(fs[i]);
		}
		return sum;
	}
}

public class FileCount{

	public static void main(String[] args){
		
		FileTraverse1 fs = new FileTraverse1();
		System.out.println(fs.t(new File("/Users/kimbora/javaApi/api/")));
	}
}