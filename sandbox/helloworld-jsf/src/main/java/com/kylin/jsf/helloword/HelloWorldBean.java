package com.kylin.jsf.helloword;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 * <p>
 * {@link HelloWorldBean} is the JSF backing bean for the application, holding the input data to be
 * re-displayed.
 * </p>
 * 
 */
@Named
@SessionScoped
public class HelloWorldBean implements Serializable {

    private static final long serialVersionUID = -6239437588285327644L;

    private String name;
    
    private String reverse;

    @PostConstruct
    public void postContruct() {
        name = "Kylin Soong";
        reverse = "123456789";
    }

    public String getName() {
        return "Hello " + name;
    }

    public void setName(String name) {
        this.name = name;
    }

	public String getReverse() {
		return new StringBuffer(reverse).reverse().toString();
	}

	public void setReverse(String reverse) {
		this.reverse = reverse;
	}
}
