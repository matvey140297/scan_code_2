package grst.model.dic;

import grst.model.AdtInfoType;

import java.util.Locale;

import lombok.Value;

/**
 * Entity for: сообщения об ошибках
 */
@Value
public class Info {

    // #
    long id;

    // тип
    AdtInfoType type;

    // наименование анг
    String valueEn;

    // наименование каз
    String valueKz;

    // наименование рус
    String valueRu;


    // Localized property
    public String getValue(Locale locale) {
        var l = locale.getLanguage();
        if ("ru".equals(l)) return valueRu;
        if ("en".equals(l)) return valueEn;
        if ("kz".equals(l)) return valueKz;
        return null;
    }
}
