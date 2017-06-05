package com.greensky.five9API.pojo.type_adapters;

import java.util.Map;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import com.greensky.framework.types.AngularErrorsMapType;
import com.greensky.framework.types.FrameworkError;
import com.greensky.framework.types.FrameworkErrorsMapType;
import com.greensky.framework.types.FrameworkErrorsMapType.Entry;

public class AngularErrorsTypeAdapter extends XmlAdapter<AngularErrorsMapType, Map<String, Map<String, FrameworkError>>> {

/*	@Override
	public AngularErrorsMap unmarshal(AngularErrorsMapType v) throws Exception {
		if (v == null) {
			return null;
		}
		List<com.greensky.framework.types.AngularErrorsMapType.Entry> entries = v.getEntry();
		AngularErrorsMap map = new AngularErrorsMap();
		for (com.greensky.framework.types.AngularErrorsMapType.Entry e : entries) {
			map.put(e.getKey(), e.getValue());
		}
		return map;
	}

	@Override
	public AngularErrorsMapType marshal(AngularErrorsMap v) throws Exception {
		if (v == null || v.isEmpty()) {
			return null;
		}
		Set<java.util.Map.Entry<String, FrameworkErrorsMap>> entrySet = v.entrySet();
		AngularErrorsMapType type = new AngularErrorsMapType();
		for (java.util.Map.Entry<String, FrameworkErrorsMap> e : entrySet) {
			Entry xsdEntry = new Entry();
			xsdEntry.setKey(e.getKey());
			xsdEntry.setValue(e.getValue());
			type.getEntry().add(xsdEntry);
		}
		return type;
	}*/

	@Override
	public AngularErrorsMapType marshal(Map<String, Map<String, FrameworkError>> v) throws Exception {
		if (v == null || v.isEmpty()) {
			return null;
		}
		AngularErrorsMapType outer = new AngularErrorsMapType();
		for(java.util.Map.Entry<String, Map<String, FrameworkError>> e: v.entrySet()) {
			String key = e.getKey();
			Map<String, FrameworkError> value = e.getValue();
			
			com.greensky.framework.types.AngularErrorsMapType.Entry et1 = new com.greensky.framework.types.AngularErrorsMapType.Entry();
			et1.setKey(key);
			FrameworkErrorsMapType fwErrTMap = new FrameworkErrorsMapType();
			et1.setValue(fwErrTMap );
			outer.getEntry().add(et1);
			
			for(java.util.Map.Entry<String, FrameworkError> e2: value.entrySet()) {
				String key2 = e2.getKey();
				FrameworkError value2 = e2.getValue();
				Entry et2 = new Entry();
				et2.setKey(key2);
				et2.setValue(value2);
				fwErrTMap.getEntry().add(et2);
			}
		}
		return outer;
	}

	@Override
	public Map<String, Map<String, FrameworkError>> unmarshal(AngularErrorsMapType v) throws Exception {
		return null;
	}

}
