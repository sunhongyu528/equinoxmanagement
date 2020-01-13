package com.changhongit.equinoxmanagement.request;

import com.fasterxml.jackson.annotation.JsonIgnore;

public interface IAnnotation {
	@JsonIgnore
	@SuppressWarnings("rawtypes")
	public abstract Class[] getTypes();
}
