package grst.model.dic;


import java.util.Locale;
import java.util.UUID;

import lombok.Value;

/**
 * Entity for: страны
 */
@Value
public class Country {

    // #
    UUID id;

    // двухсимвольный код ISO 3166-1 alpha 2
    String iso31661Alpha2;

    // двухсимвольный код ISO 3166-1 alpha 3
    String iso31661Alpha3;

    // цифровой код ISO 3166-1 num
    int iso31661Num;

    // наименование анг
    String nameEn;

    // наименование каз
    String nameKz;

    // наименование рус
    String nameRu;

    // короткое наименование анг
    String shortNameEn;

    // короткое наименование каз
    String shortNameKz;

    // короткое наименование рус
    String shortNameRu;


    // Localized property
    public String getName(Locale locale) {
        var l = locale.getLanguage();
        if ("ru".equals(l)) return nameRu;
        if ("en".equals(l)) return nameEn;
        if ("kz".equals(l)) return nameKz;
        return null;
    }

    // Localized property
    public String getShortName(Locale locale) {
        var l = locale.getLanguage();
        if ("ru".equals(l)) return shortNameRu;
        if ("en".equals(l)) return shortNameEn;
        if ("kz".equals(l)) return shortNameKz;
        return null;
    }
}
