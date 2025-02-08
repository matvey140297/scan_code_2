package grst.model.dic;


import java.util.Locale;
import java.util.UUID;

import lombok.Value;

/**
 * Entity for: opf: организационно правовая форма
 */
@Value
public class Opf {

    // #
    UUID id;

    // наименование анг
    String nameEn;

    // наименование каз
    String nameKz;

    // наименование рус
    String nameRu;

    // тип владельца (todo переделать в перечисление)
    int ownerType;


    // Localized property
    public String getName(Locale locale) {
        var l = locale.getLanguage();
        if ("ru".equals(l)) return nameRu;
        if ("en".equals(l)) return nameEn;
        if ("kz".equals(l)) return nameKz;
        return null;
    }
}
