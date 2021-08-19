package com.stories;
import java.util.HashMap;

public class Story1 {
	
		public static void main(String[] args) {
			String s1="If we write a program and compile if, then As we can run the program to get output.";  
			
			System.out.println(ColourAdder(split(s1)));
			 
		}
		public static String[] split(String s1) {
			String[] words=s1.split("\\s+");
			
			return words;  
		}
		public static String ColourAdder(String[] s1) {
			 StringBuilder builder = new StringBuilder();
			 for(String w:s1){  
				 String c1=Checker(w);
					if( c1!= null)  {
						
						
						builder.append(c1);
						if(w.endsWith(",")||w.endsWith(".")) {
							builder.append(w.substring(0, w.length()-1));
							builder.append(c1);
							builder.append(w.charAt(w.length()-1));
						}else {
						builder.append(w);
						builder.append(c1);
						}
						builder.append(" ");
						
						
					}else {
						builder.append(w);
						if(!(w.contains(",")||w.contains("."))) {
							builder.append(" ");
						}
					}
					
					}
			 String singleString = builder.toString();
			
			return singleString;
			
		}
		public static String Checker(String s1) {
			 HashMap<String, String> hm = new HashMap<String, String>();
			 hm.put("as", "[blue]");
		        hm.put("if", "[blue]");
		        hm.put("and", "[blue]");
		        hm.put("then", "[blue]");
		        hm.put("when", "[blue]");
		        
			String s2[]= {"as","if","and","then","when" };
			if(s1.endsWith(",")||s1.endsWith(".")) {
				s1=s1.substring(0, s1.length()-1);
				
			}
			return hm.get(s1.toLowerCase());
			
			
		}

	}	


