package com.kylin.cdi.injection;

import com.kylin.cdi.injection.qualifier.English;

/**
 * A simple implementation for the English language.
 *
 * The {@link English} qualifier tells CDI this is a special instance of
 * the {@link TranslateService}.
 *
 */

@English
public class EnglishTranslateService implements TranslateService {

   public String hello() {
     return "Hello";
   }

}
