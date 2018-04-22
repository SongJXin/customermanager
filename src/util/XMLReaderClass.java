/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;



import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author 健鑫
 */
public class XMLReaderClass {
    /**
     * 读取XML内容
     * 
     * @param filesString 文件路径
     * @param nodeString 节点名称
     * @return  节点的值
     */
    public static String Reader(String filesString,String nodeString) {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();  
        try  
        {  
            DocumentBuilder db = dbf.newDocumentBuilder();  
            Document doc=db.parse(filesString);
            NodeList SQLList = doc.getElementsByTagName("JDBC");  
            for (int i = 0; i < SQLList.getLength(); i++)  
            {  
                Node SQLconnection = SQLList.item(i);  
                for (Node node = SQLconnection.getFirstChild(); node != null; node = node.getNextSibling())  
                {  
                    if (node.getNodeType() == Node.ELEMENT_NODE)  
                    {  
                        String name = node.getNodeName();
                        String value;
                        if(node.getFirstChild()==null)
                        {
                            value="";
                        }else {
                            value = node.getFirstChild().getNodeValue();
                        }
                        if(name.equals(nodeString)){
                            return value;
                        }
                    }  
                }  
            }  
        }  
        catch (IOException | ParserConfigurationException | DOMException | SAXException e)  
        {  
            e.printStackTrace();  
        }  
    return null;
    }
}
