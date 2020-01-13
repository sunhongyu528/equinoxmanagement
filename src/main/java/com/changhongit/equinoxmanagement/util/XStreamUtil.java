package com.changhongit.equinoxmanagement.util;

import com.changhongit.equinoxmanagement.request.IAnnotation;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.XmlFriendlyNameCoder;

public class XStreamUtil {

	private static XStream xStream;

	static {
		xStream = new XStream(new DomDriver("UTF-8", new XmlFriendlyNameCoder("-_", "_")));
		XStream.setupDefaultSecurity(xStream);
	}

	// xml转java对象
	public static Object xmlToBean(String xml, @SuppressWarnings("rawtypes") Class[] types) {
		xStream.autodetectAnnotations(true);
		xStream.allowTypes(types);
		xStream.processAnnotations(types);
		Object object = xStream.fromXML(xml);
		return object;
	}

	public static String beanToXml(Object obj, @SuppressWarnings("rawtypes") Class[] types) {
		xStream.processAnnotations(types);
		return "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" + xStream.toXML(obj);
	}

	public static String beanToXml2(IAnnotation obj) {
		System.out.println(obj.getTypes());
		xStream.processAnnotations(obj.getTypes());

		String docmentString = "<?xml version='1.0' encoding='UTF-8'?>\n" 
							 + "	<MCU_XML_API>\r\n"
							 + "		<Request>\r\n" 
							 + "				" + xStream.toXML(obj) 
							 + "		</Request>\r\n"
							 + "	</MCU_XML_API>";
		return docmentString;
	}

	// java对象转xml
	public static String beanToXml(Object obj, @SuppressWarnings("rawtypes") Class[] types, String requestId,
			String requestName) {
		xStream.processAnnotations(types);

		String docmentString = "<?xml version='1.0' encoding='UTF-8'?>\n" 
							 + "	<MCU_XML_API>\r\n"
							 + "		<Request>\r\n" 
							 + "			<" + requestName + "> \r\n" 
							 + "				<RequestID>" + requestId+ "</RequestID>\r\n" 
							 + "				" + xStream.toXML(obj) 
							 + "			</" + requestName + ">\r\n"
							 + "		</Request>\r\n" + "	</MCU_XML_API>";
		return docmentString;
	}
}
