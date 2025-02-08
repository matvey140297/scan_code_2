package grst.model.dic;


import java.util.Locale;
import java.util.UUID;

import lombok.Value;

/**
 * Entity for: шаблоны документов
 */
@Value
public class Template {

    // #
    UUID id;

    // наименование
    String name;

    // шаблон
    String templateEn;

    // шаблон
    String templateKz;

    // шаблон
    String templateRu;


    // Localized property
    public String getTemplate(Locale locale) {
        var l = locale.getLanguage();
        if ("ru".equals(l)) return templateRu;
        if ("en".equals(l)) return templateEn;
        if ("kz".equals(l)) return templateKz;
        return null;
    }
}
