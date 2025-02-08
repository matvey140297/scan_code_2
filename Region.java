package grst.model.dic;

import grst.model.AdtKatoCode;
import lombok.Value;

import java.util.Locale;
import java.util.UUID;

/**
 * Entity for: region: области
 */
@Value
public class Region {

    // #
    UUID id;

    // като код
    AdtKatoCode code;

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
