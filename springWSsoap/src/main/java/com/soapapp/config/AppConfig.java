package com.soapapp.config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.server.EndpointInterceptor;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;



@Configuration
@EnableWs
@ComponentScan("com.soapapp") 
@Import(DBConfig.class)
public class AppConfig extends WsConfigurerAdapter {

	@Override
    public void addInterceptors(List<EndpointInterceptor> interceptors) {
        
		CustomValidationInterceptor validatingInterceptor = new CustomValidationInterceptor();
	        validatingInterceptor.setValidateRequest(true);
	        validatingInterceptor.setValidateResponse(true);
	        validatingInterceptor.setXsdSchema(studentsSchema());
        interceptors.add(validatingInterceptor);
    }

	 
	@Bean(name = "animals")
	public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema studentsSchema) {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("AnimalsPort");
		wsdl11Definition.setLocationUri("/soapws");
		wsdl11Definition.setTargetNamespace("http://soapapp.com/ws");
		wsdl11Definition.setSchema(studentsSchema);
		return wsdl11Definition;
	}
	@Bean
	public XsdSchema studentsSchema() {
		return new SimpleXsdSchema(new ClassPathResource("animals.xsd"));
	}
}
