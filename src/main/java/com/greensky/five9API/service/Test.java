package com.greensky.five9API.service;

import java.math.BigInteger;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.greensky.framework.types.FrameworkError;
import com.greensky.framework.types.ObjectFactory;
import com.greensky.framework.types.ServiceResponse;

public class Test {
	public static void main(String[] args) {
		
		FrameworkError fwe = new FrameworkError();
		fwe.setError("DB Error");
		fwe.setMessage("Constraint violation exception has occured.");
		fwe.setProperty("firstName");
		fwe.setValue("John");
		
		ServiceResponse response = new ObjectFactory().createServiceResponse();
		response.setRoundTripIdentifier("1");
		response.setServiceResponseCode(new BigInteger("200"));
		
		Map<String, Map<String, FrameworkError>> angularErrors = new LinkedHashMap<String, Map<String, FrameworkError>>();
		response.setAngularErrors(angularErrors);
		
		Map<String, FrameworkError> fwErrors1 = new LinkedHashMap<String, FrameworkError>();
		angularErrors.put("angularError-001", fwErrors1 );
		
		
		fwErrors1.put("field.userName", fwe);
		fwErrors1.put("field.phoneNumber", fwe);
		
		Map<String, FrameworkError> fwErrors2 = new LinkedHashMap<String, FrameworkError>();
		angularErrors.put("angularError-002", fwErrors2);
		
		fwErrors2.put("field.zip", fwe);
		fwErrors2.put("field.county", fwe);
		
		try {
			JAXBContext jc = JAXBContext.newInstance(ServiceResponse.class);
			Marshaller marshaller = jc.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(response, System.out);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		
	}
}
