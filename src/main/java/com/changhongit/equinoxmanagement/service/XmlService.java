package com.changhongit.equinoxmanagement.service;

import org.apache.commons.httpclient.Credentials;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.UsernamePasswordCredentials;
import org.apache.commons.httpclient.auth.AuthScope;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.StringRequestEntity;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Node;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.changhongit.equinoxmanagement.config.EquinoxProperties;
import com.changhongit.equinoxmanagement.request.BaseRequest;
import com.changhongit.equinoxmanagement.response.BaseResponse;
import com.changhongit.equinoxmanagement.util.XStreamUtil;

@Component
public class XmlService {
	@Autowired
	EquinoxProperties equinoxProperties;

	HttpClient httpClient;

	private void createConnection() {
		// String tokenStr = request.getHeader(equinoxProperties.getTokenHeader());
		// Token token = UserTokenMap.getToken(tokenStr);
		// Credentials creds = new
		// UsernamePasswordCredentials(token.getLoginId(),token.getPassword());
		httpClient = new HttpClient();
		Credentials creds = new UsernamePasswordCredentials("admin", "Avaya123$");
		httpClient.getState().setCredentials(AuthScope.ANY, creds);
	}

	public BaseResponse sendRequest(BaseRequest request, BaseResponse response) {
		BaseResponse returnResponse = null;
		try {
			createConnection();

			String xmlRequest = XStreamUtil.beanToXml2(request);

			System.out.println("xml request:" + xmlRequest);
			// 向Equinox iView发送请求body
			@SuppressWarnings("deprecation")
			StringRequestEntity requestEntity = new StringRequestEntity(xmlRequest);

			PostMethod postMethod = new PostMethod(equinoxProperties.getServerUrl());
			postMethod.setRequestEntity(requestEntity);

			httpClient.executeMethod(postMethod);
			String xmlResponse = new String(postMethod.getResponseBody());

			// 打印和接收Equinox iView返回的消息
			System.out.println("xml response:" + xmlResponse);

			postMethod.releaseConnection();
			Document doc = DocumentHelper.parseText(xmlResponse);
			Node node = doc.selectSingleNode("MCU_XML_API/Response/" + response.getClass().getSimpleName());
			System.out.println("xml node:" + node.asXML());
			returnResponse = (BaseResponse) XStreamUtil.xmlToBean(node.asXML(), response.getTypes());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return returnResponse;
	}

}
