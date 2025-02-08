package grst.model.dic;


import java.util.Locale;
import java.util.UUID;

import lombok.Value;

/**
 * Entity for: unit: словарь единицы измерения (л.с., квт. и т.д.)
 */
@Value
public class Unit {

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
