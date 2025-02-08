package grst.model.agent;


import java.util.Locale;
import java.util.UUID;

import lombok.Value;

/**
 * Entity for: agent: агент (нерезидент)
 */
@Value
public class AgentNonresidentExplain {

    // #
    UUID id;

    // адрес
    String address;

    // ассоциированная страна
    UUID agentNonresidentExplainToCountry;

    // страна
    String countryNameRu;

    // страна
    String countryNameEn;

    // страна
    String countryNameKz;

    // email
    String email;

    // мобильный телефон
    String mobilePhone;

    // наименование
    String name;

    // регион
    String region;

    // тип лица
    String type;

    // рабочий телефон
    String workPhone;


    // Localized property
    public String getCountryName(Locale locale) {
        var l = locale.getLanguage();
        if ("ru".equals(l)) return countryNameRu;
        if ("en".equals(l)) return countryNameEn;
        if ("kz".equals(l)) return countryNameKz;
        return null;
    }
}
