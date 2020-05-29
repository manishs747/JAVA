package files;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
//import org.jdom.Document;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Readxml {
	
	
	public static void main(String[] args) {
		File fXmlFile = new File("staff.xml");
		
		 jDomParser(fXmlFile);
		//domParser(fXmlFile);
		
	}

	public static void jDomParser(File fXmlFile) {
		try {
			SAXBuilder saxBuilder = new SAXBuilder();
			org.jdom.Document document = saxBuilder.build(fXmlFile);
	        System.out.println("Root element :" 
	                + document.getRootElement().getName());

	        org.jdom.Element classElement = (org.jdom.Element) document.getRootElement();

	        List<org.jdom.Element> nList = classElement.getChildren();
	        System.out.println("----------------------------");
	        
	        
	        for (org.jdom.Element staff : nList) {
	        	
	        	System.out.println(staff.getName());
	        	System.out.println("Staff id : " + staff.getAttribute("id").getValue());
				System.out.println("First Name : " + staff.getChildText("firstname"));
				System.out.println("Last Name : " + staff.getChildText("lastname"));
				System.out.println("Nick Name : " + staff.getChildText("nickname"));
				System.out.println("Salary : " + staff.getChildText("salary"));
				
	        	
	        	
				
			}
	             
	         
			
			
		} catch (JDOMException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void domParser(File fXmlFile) {
		try {
			
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	
			Document doc = dBuilder.parse(fXmlFile);
			
			doc.getDocumentElement().normalize();

			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			
			NodeList nList = doc.getElementsByTagName("staff");
			
			System.out.println("----------------------------");
			
			for (int i = 0; i < nList.getLength(); i++) {

				Node nNode = nList.item(i);
				
				System.out.println("\nCurrent Element :" + nNode.getNodeName());
				
						
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {

					
					Element eElement = (Element) nNode;
					System.out.println("Staff id : " + eElement.getAttribute("id"));
					System.out.println("First Name : " + eElement.getElementsByTagName("firstname").item(0).getTextContent());
					System.out.println("Last Name : " + eElement.getElementsByTagName("lastname").item(0).getTextContent());
					System.out.println("Nick Name : " + eElement.getElementsByTagName("nickname").item(0).getTextContent());
					System.out.println("Salary : " + eElement.getElementsByTagName("salary").item(0).getTextContent());
					
					
					
					//System.out.println(eElement.getFirstChild().getNodeValue());
					

				}
				
				
				
			}	
			
			
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
