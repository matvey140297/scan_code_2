package grst.model.dic;


import java.util.Locale;
import java.util.UUID;

import lombok.Value;

/**
 * Entity for: street-type: типы улиц (проспект и т.д.)
 */
@Value
public class StreetType {

    // #
    UUID id;

    // наименование анг
    String nameEn;

    // наименование каз
    String nameKz;

    // наименование рус
    String nameRu;


    // Localized property
    public String getName(Locale locale) {
        var l = locale.getLanguage();
        if ("ru".equals(l)) return nameRu;
        if ("en".equals(l)) return nameEn;
        if ("kz".equals(l)) return nameKz;
        return null;
    }
}
