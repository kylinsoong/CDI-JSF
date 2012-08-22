package com.kylin.cdi.injection;

import com.kylin.cdi.injection.qualifier.Chinese;

@Chinese
public class ChineseTranslateService implements TranslateService {

	public String hello() {
		return "您好";
	}

}
