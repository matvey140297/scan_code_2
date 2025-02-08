package grst.model.dic;

import grst.model.AdtKatoCode;

import java.util.Locale;
import java.util.UUID;

import lombok.Value;

/**
 * Entity for: division: иерархия подразделений todo PID
 */
@Value
public class Division {

    // #
    UUID id;

    // уровень
    int level;

    // TE блок
    AdtKatoCode locationTe;

    // наименование анг
    String nameEn;

    // наименование каз
    String nameKz;

    // наименование рус
    String nameRu;

    // родитель
    UUID pid;


    // Localized property
    public String getName(Locale locale) {
        var l = locale.getLanguage();
        if ("ru".equals(l)) return nameRu;
        if ("en".equals(l)) return nameEn;
        if ("kz".equals(l)) return nameKz;
        return null;
    }
}
