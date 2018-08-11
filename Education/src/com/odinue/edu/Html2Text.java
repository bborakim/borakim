package com.odinue.edu;

import java.io.File;

import com.odinue.edu.util.FileTraverse;




public class Html2Text implements FileTraverse.FileHandler{

	public static void main(String[] args){
		
		FileTraverse ft = new FileTraverse(new Html2Text());
		System.out.println(ft.t(new File("/Users/kimbora/javaApi/api/")));
		
	}
	
	@Override
	public int Handle(File f) {
		
		if(f.getName().toUpperCase().endsWith(".HTML")){
			
			System.out.println("====HTML:" + f.getPath());
			return 1;
		}
		
		return 0;
	}
}
