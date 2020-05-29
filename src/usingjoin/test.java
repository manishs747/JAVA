package usingjoin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class test {
	private static final String OR = " OR ";

	public static void main(String[] args) {
		
		 // Creating a list of strings 
       /* List<String> aList = Arrays.asList("Geeks", "Geeks", 
                    "GeeksQuiz", "GeeksforGeeks", "GFG"); 
  
        Set<String> hSet = new HashSet<String>(aList); 
        hSet.add("geek");
        System.out.println(hSet);*/
		
		String s = "homeoffice\\m0k0251";
        System.out.println(getNodeId(s,"a20082440b46"));
        
				

	}
	
	 private static String getNodeId(String userId ,String appId){
	        String nodeId = "";
	        String[] userIdList = userId.split("\\\\");
	        if(userIdList.length < 2){
	            return appId;
	        }
	        StringBuilder sb = new StringBuilder();
	        String separator = "^";
	        sb.append(userIdList[0]).append(separator).append(userIdList[1]).append(separator).append(appId);
	        return sb.toString();
	    }
	
	
	 private static String  getGroupFilterQuery(List<String> groupList){
	        if (null == groupList){
	            groupList = new ArrayList<>();
	        }
	        if(groupList.isEmpty()){
	            groupList.add("");
	        }
	        StringBuilder sb = new StringBuilder();
	        sb.append("(");
	        for (String groupId:groupList) {
	            sb.append("*").append(groupId).append("*").append(OR);
	        }
	        sb.setLength(sb.length()-OR.length());
	        sb.append(")");
	        return sb.toString();
	    }
	 

}
