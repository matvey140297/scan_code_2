package grst.model.analytics;


import java.util.Locale;
import java.util.UUID;

import lombok.Value;

/**
 * Entity for: отчет / свойство (сущность для представления)
 */
@Value
public class AnalyticsReportRelationView {

    // #
    UUID id;

    // описание сущности
    String entityDescriptionRu;

    // описание сущности
    String entityDescriptionEn;

    // описание сущности
    String entityDescriptionKz;

    // описание отношения
    String relationDescriptionRu;

    // описание отношения
    String relationDescriptionEn;

    // описание отношения
    String relationDescriptionKz;


    // Localized property
    public String getEntityDescription(Locale locale) {
        var l = locale.getLanguage();
        if ("ru".equals(l)) return entityDescriptionRu;
        if ("en".equals(l)) return entityDescriptionEn;
        if ("kz".equals(l)) return entityDescriptionKz;
        return null;
    }

    // Localized property
    public String getRelationDescription(Locale locale) {
        var l = locale.getLanguage();
        if ("ru".equals(l)) return relationDescriptionRu;
        if ("en".equals(l)) return relationDescriptionEn;
        if ("kz".equals(l)) return relationDescriptionKz;
        return null;
    }
}
