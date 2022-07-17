package hanhan1.Service;

import hanhan1.Dao.UserDao;
import hanhan1.Entity.User;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilderFactory;

public class TestReadXmlByDomService {

    private static UserDao dao = null;

    static {
        try{
            Document dom = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("src/main/resources/hanhan1TestReadXmlServiceBeans.xml");
            NodeList propertyList = dom.getElementsByTagName("property");
            for (int i = 0; i < propertyList.getLength(); i++) { // 遍历所有配置信息

                // 查找本java文件的配置信息
                if (!propertyList.item(i).getAttributes().getNamedItem("class").getTextContent().equals(TestReadXmlByDomService.class.toString().split(" ")[1])) continue;

                // 提取子节点信息
                String varName = null; // 需要赋值的变量名
                String varClassName = null; // 变量需要绑定的类名
                NodeList itemList = propertyList.item(i).getChildNodes();
                for (int j = 1; j < itemList.getLength(); j += 2) { // 从一组配置中查找出需要赋值的变量和赋值用的类名
                    if (itemList.item(j).getNodeName().equals("variable")) varName = itemList.item(j).getTextContent();
                    if (itemList.item(j).getNodeName().equals("bind")) {
                        String bind = itemList.item(j).getTextContent();
                        NodeList classNameList = dom.getElementsByTagName("className");
                        for (int k = 0; k < classNameList.getLength(); k++) {
                            if (!classNameList.item(k).getAttributes().getNamedItem("id").getTextContent().equals(bind)) continue;
                            varClassName = classNameList.item(k).getAttributes().getNamedItem("class").getTextContent();
                        }
                    }
                }
//                System.out.println("varName = " + varName + ", varClassName = " + varClassName);

                // 对变量赋值
                if (varName.equals("dao")) dao = (UserDao) Class.forName(varClassName).newInstance();

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void register(User usr) {
        dao.saveUser(usr);
    }

//    public void register(User usr) {
//        try{
//            String className = GetMessage("className");
//            Class cls = Class.forName(className);
//            UserDao dao = (UserDao)cls.newInstance();
//            dao.saveUser(usr);
////            System.out.println(this.GetMessage("className"));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    private static String GetMessage(String name) throws Exception {
//        Document dom = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("src/main/resources/hanhan1TestReadXmlServiceBeans.xml");
//        NodeList classNameList = dom.getElementsByTagName(name);
//        return classNameList.item(0).getAttributes().getNamedItem("class").getTextContent();
//    }

}
