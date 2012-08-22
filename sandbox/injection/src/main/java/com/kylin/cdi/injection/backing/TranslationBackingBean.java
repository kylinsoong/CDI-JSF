package com.kylin.cdi.injection.backing;

import javax.inject.Inject;
import javax.inject.Named;


import com.kylin.cdi.injection.TranslateService;
import com.kylin.cdi.injection.qualifier.Chinese;
import com.kylin.cdi.injection.qualifier.English;
import com.kylin.cdi.injection.qualifier.Spanish;

/**
 * Simple JSF backing bean, demonstrating CDI injection and qualifiers.
 *
 * Also note, this bean has a name different than the default name.
 *
 */
@Named("translation")
public class TranslationBackingBean {

    /*
        Both of these injections is of the same base type: TranslationService, however,
        CDI is using the qualifiers to help narrow which of the two implementations
        should be injected.
     */

    @Inject @Spanish
    private TranslateService spanishTranslateService;

    @Inject @English
    private TranslateService englishTranslateService;
    
    @Inject @Chinese
    private TranslateService chineseTranslateService;

    public String getSpanishHello() {
        return spanishTranslateService.hello();
    }

    public String getEnglishHello() {
        return englishTranslateService.hello();
    }
    
    public String getChineseHello() {
        return chineseTranslateService.hello();
    }
}
