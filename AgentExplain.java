package grst.model.agent;

import grst.model.AdtBin;

import java.util.Locale;
import java.util.UUID;

import lombok.Value;

/**
 * Entity for: agent: агент (юр лицо, физ лицо, нерезидент)
 */
@Value
public class AgentExplain {

    // #
    UUID id;

    // адрес
    String address;

    // ассоциированный тип агента
    UUID agentExplainToAgentType;

    // ассоциированная страна
    UUID agentExplainToCountry;

    // тип
    String agentTypeNameRu;

    // тип
    String agentTypeNameEn;

    // тип
    String agentTypeNameKz;

    // наименование страны
    String countryNameRu;

    // наименование страны
    String countryNameEn;

    // наименование страны
    String countryNameKz;

    // email
    String email;

    // фамилия имя отчество
    String fio;

    // ИИН/БИН
    AdtBin ibin;

    // мобильный телефон
    String mobilePhone;

    // наименование
    String name;

    // тип лица для нерезидента
    String nonresidentType;

    // регион
    String region;

    // рабочий телефон
    String workPhone;


    // Localized property
    public String getAgentTypeName(Locale locale) {
        var l = locale.getLanguage();
        if ("ru".equals(l)) return agentTypeNameRu;
        if ("en".equals(l)) return agentTypeNameEn;
        if ("kz".equals(l)) return agentTypeNameKz;
        return null;
    }

    // Localized property
    public String getCountryName(Locale locale) {
        var l = locale.getLanguage();
        if ("ru".equals(l)) return countryNameRu;
        if ("en".equals(l)) return countryNameEn;
        if ("kz".equals(l)) return countryNameKz;
        return null;
    }
}
