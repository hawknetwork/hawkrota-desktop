package org.hawknetwork.hawkrota.domain;

import java.io.Serializable;

import org.hawknetwork.common.base.impl.BaseKeyResolvingDomainClass;

public class HeadedInfo extends BaseKeyResolvingDomainClass implements Serializable {
	private static final long serialVersionUID = 5553700605036760464L;
	private String header;
	private String info;
	public String getHeader() {
		return header;
	}
	public void setHeader(String header) {
		this.header = header;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
}
