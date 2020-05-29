package files;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class ReadXmlExp {

	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			DocumentBuilderFactory  factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse("http://services.explorecalifornia.org/rss/tours.php");
			NodeList list = doc.getElementsByTagName("title");
			//nodelist is array of oblect and we can iterate through object(section diff by tag)
			System.out.println("There are " + list.getLength() + " item");
			for (int i = 0; i < list.getLength(); i++) {
				Element item = (Element)list.item(i);//extracted the particuler node
				
				System.out.println(item.getFirstChild().getNodeValue());//to extract the value of text betwen
				//<title>some text</text>   we o/p some text
				System.out.println(item.getFirstChild().getNodeValue());
				/*<staff id="1001">  for this("1001") -->  item.getAttribute("id"));
		         <firstname>yong</firstname>  for yong ->item.getElementsByTagName("nickname").item(0).getTextContent());
				 * 
				 * 
				 */
			}
			
			
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
