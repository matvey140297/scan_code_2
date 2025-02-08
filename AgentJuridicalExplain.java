package grst.model.agent;

import grst.model.AdtBin;

import java.util.Locale;
import java.util.UUID;

import lombok.Value;

/**
 * Entity for: agent: агент (юр лицо)
 */
@Value
public class AgentJuridicalExplain {

    // #
    UUID id;

    // ассоциированный тип промышленности
    UUID agentJuridicalExplainToEnterpriseType;

    // БИН
    AdtBin bin;

    // наименование
    String name;

    // тип промышленности
    String typeNameRu;

    // тип промышленности
    String typeNameEn;

    // тип промышленности
    String typeNameKz;


    // Localized property
    public String getTypeName(Locale locale) {
        var l = locale.getLanguage();
        if ("ru".equals(l)) return typeNameRu;
        if ("en".equals(l)) return typeNameEn;
        if ("kz".equals(l)) return typeNameKz;
        return null;
    }
}
