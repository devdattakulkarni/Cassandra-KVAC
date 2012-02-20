package org.apache.cassandra.auth;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLHelper {

    public static Node getChildNodeByName(Node node, String childName) {
        NodeList children = node.getChildNodes();
        for (int j = 0; j < children.getLength(); j++) {
            Node child = children.item(j);
            if (child.getNodeName().equals(childName)) {
                return child;
            }
        }
        return null;
    }
}
