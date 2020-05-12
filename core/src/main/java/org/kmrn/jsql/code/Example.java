package org.kmrn.jsql.code;

import org.kmrn.jsql.code.annotation.processor.BuilderProperty;

public class Example {
	private String name;

	public String getName() {
		return name;
	}
	@BuilderProperty
	public void setName(String name) {
		this.name = name;
	}
}
