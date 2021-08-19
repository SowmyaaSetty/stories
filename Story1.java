package com.stories;
import java.util.HashMap;

public class Story1 {
	
		public static void main(String[] args) {
			String str="If we write a program and compile it, then As we can run the program to get output.";  
			
			System.out.println(Colour(split(str)));
			 
		}
		public static String[] split(String str) {
			String[] words=str.split("\\s+");
			
			return words;  
		}
		public static String Colour(String[] str) {
			 StringBuilder builder = new StringBuilder();
			 for(String sentense:str){  
				 String check=Checker(sentense);
					if( check!= null)  {
						
						
						builder.append(check);
						if(sentense.endsWith(",")||sentense.endsWith(".")) {
							builder.append(sentense.substring(0, sentense.length()-1));
							builder.append(check);
							builder.append(sentense.charAt(sentense.length()-1));
						}else {
						builder.append(sentense);
						builder.append(check);
						}
						builder.append(" ");
						
						
					}else {
						builder.append(sentense);
						if(!(sentense.contains(",")||sentense.contains("."))) {
							builder.append(" ");
						}
					}
					
					}
			 String singleString = builder.toString();
			
			return singleString;
			
		}
		public static String Checker(String str) {
			 HashMap<String, String> hm = new HashMap<String, String>();
			 hm.put("as", "[blue]");
		        hm.put("if", "[blue]");
		        hm.put("and", "[blue]");
		        hm.put("then", "[blue]");
		        hm.put("when", "[blue]");
		        
			String s2[]= {"as","if","and","then","when" };
			if(str.endsWith(",")||str.endsWith(".")) {
				str=str.substring(0, str.length()-1);
				
			}
			return hm.get(str.toLowerCase());
			
			
		}

	}		


