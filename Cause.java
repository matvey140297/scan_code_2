package grst.model.dic;

import grst.model.AdtCauseType;

import java.util.Locale;
import java.util.UUID;

import lombok.Value;

/**
 * Entity for: cause: причина действия (Легализация, Перерегистрация и т.д.)
 */
@Value
public class Cause {

    // #
    UUID id;

    // наименование анг
    String nameEn;

    // наименование каз
    String nameKz;

    // наименование рус
    String nameRu;

    // тип
    AdtCauseType type;


    // Localized property
    public String getName(Locale locale) {
        var l = locale.getLanguage();
        if ("ru".equals(l)) return nameRu;
        if ("en".equals(l)) return nameEn;
        if ("kz".equals(l)) return nameKz;
        return null;
    }
}
