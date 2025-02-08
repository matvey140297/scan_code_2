package grst.model.dic;

import grst.model.AdtAgentInternalType;

import java.util.Locale;
import java.util.UUID;

import lombok.Value;

/**
 * Entity for: тип агента
 */
@Value
public class AgentType {

    // #
    UUID id;

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

    // тип
    AdtAgentInternalType type;


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
