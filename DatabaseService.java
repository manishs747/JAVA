
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.bson.types.ObjectId;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import java.io.FileWriter;
import java.io.IOException;
import com.google.gson.Gson;
import com.mongodb.util.JSON;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.google.gson.Gson;
public class DatabaseService {
	/* String name;
	 String address;
	 public DatabaseService(String n,String a)
		{
			name = n;
			address = a;
		} */
	 public DatabaseService()//Default constructor
	 {}
	public static void main(String[] args) {
		System.out.println("here");
		Map<String, String> map1 = new HashMap<String, String>();
		Map<String, String> map2 = new HashMap<String, String>();
		Map<String, String> map3 = new HashMap<String, String>();
		
		map1.put("name", "rocky");
		map1.put("IPADDRESS","1.2.3.4");
		map1.put("address", "raj");
		map2.put("name", "subash");
		map2.put("address", "jp");
		map2.put("scanid","one");
		map3.put("name", "balaji");
		map3.put("address", "jayanagar");
		map1.put("address", "raj");
		
		
		DatabaseService s = new DatabaseService();
		s.addRecord(map1);
		s.addRecord(map2);
		s.addRecord(map3);
		
		//s.updateKey("name","manish", "address", "age");

		//s.deleteRecord("512c8e8273a00a17c200b141");
		s.deleteRecord("512f49198b1fbd397361156d");
		//s.updateRecord("512c8ed773a0eb09dab3a194", "age","15");
		
		ArrayList<DBObject> sample = new ArrayList<DBObject>();
		sample = s.findAllRecords(3,2);	
		
		//s.updateKey("name","manish", "address", "age");
	}
	
	
	public DBCollection getMongoDBCollection() {
		
		Mongo mongo = null;
		try {
			mongo = new Mongo("localhost", 27017);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		// get database from MongoDB,
		// if database doesn't exists, mongoDB will create it automatically
		DB db = mongo.getDB("yourdb");

		// Get collection from MongoDB, database named "yourDB"
		// if collection doesn't exists, mongoDB will create it automatically
		DBCollection collection = db.getCollection("yourCollection");

	    return collection;

	}

	
	public void printMap(Map mp) {
	    Iterator it = mp.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry pairs = (Map.Entry)it.next();
	        System.out.println(pairs.getKey() + " = " + pairs.getValue());
	        it.remove(); // avoids a ConcurrentModificationException
	    }
	}
	
//************************** ADD Record********************************************************************************************//
	public boolean addRecord(Map<String, String> m) {
		DBCollection collection = getMongoDBCollection();
		BasicDBObject document = new BasicDBObject();
			
		  for (Map.Entry<String, String> entry : m.entrySet())
		  {
		      String key   = entry.getKey(); 
		      String value = entry.getValue();
		      if (key != null && !key.equalsIgnoreCase("") && value != null && !value.equalsIgnoreCase("")) {		    	   
		    	  document.put(key, value);		
		    	 
		      }
		      else
		    	  return false;
		  }
		  collection.insert(document);
		  System.out.println(document);
		return true;
		
	}
//**************************Delete Record********************************************************************************************//
	public boolean deleteRecord(String oid) {
		BasicDBObject document = new BasicDBObject("_id", new ObjectId(oid));
		DBObject object = getMongoDBCollection().findOne(document);
		System.out.println(object);
		DBCollection c = getMongoDBCollection();
		c.remove(object);
		
		return true;
	}
	// start, number
//**************************Find All Record********************************************************************************************//
	
	public JSONArray findAllRecords(int start,int number) {
		DBCursor cursor = getMongoDBCollection().find().skip(start).limit(number);
		ArrayList<DBObject> dbObjects =new ArrayList<DBObject>();
		JSONArray list = new JSONArray();      //json Arraylist
		while(cursor.hasNext()) {
			DBObject obj = cursor.next();
			Set<String> s = obj.keySet();
			JSONObject objj=new JSONObject();
			
			for (String ss:s) {
				objj.put(ss,obj.get(ss).toString());
			}
			list.add(objj);   //list is an json array	
			}
		
        System.out.println(list);
		/*for (Object object : list) {
			System.out.println(object);
		}*/
		
		return list;
	}
//**************************Update  Record********************************************************************************************//
	public boolean updateRecord(String oid, String key, String value) {
		BasicDBObject query = new BasicDBObject("_id", new ObjectId(oid));
		BasicDBObject Document = new BasicDBObject().append("$set",new BasicDBObject().append(key,value));
	
		DBCollection c = getMongoDBCollection();
		c.update(query,Document);
		//System.out.println(Document);
		return true;
	}



//**************************Update  record key********************************************************************************************//

public boolean updateKey(String  matchingkey,String matchingvalue, String oldKey, String newKey){
	System.out.println("hello");
	//DBCursor cursor = getMongoDBCollection().find();
	BasicDBObject query = new BasicDBObject(matchingkey, matchingvalue);
	BasicDBObject Document = new BasicDBObject().append("$rename",new BasicDBObject().append(oldKey,newKey));
    System.out.println(query);
    System.out.println(Document);

	getMongoDBCollection().update(query, Document, false, true);
	
	
	
	return true;
}


}


