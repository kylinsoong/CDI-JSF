package com.kylin.cdi.injection;

import com.kylin.cdi.injection.qualifier.Spanish;

/**
 * A simple implementation for the Spanish language.
 *
 * The {@link Spanish} qualifier tells CDI this is a special instance of
 * the {@link TranslateService}.
 *
 */
@Spanish
public class SpanishTranslateService implements TranslateService {

   public String hello() {
     return "Hola";
   }

}
