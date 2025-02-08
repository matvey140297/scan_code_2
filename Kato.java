package grst.model.kato;

import grst.model.AdtKatoCode;

import java.util.Locale;
import java.util.UUID;

import lombok.Value;

/**
 * Entity for: справочник КАТО
 */
@Value
public class Kato {

    // #
    UUID id;

    // AB
    int ab;

    // CD
    int cd;

    // код КАТО
    AdtKatoCode code;

    // EF
    int ef;

    // HIJ
    int hij;

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
