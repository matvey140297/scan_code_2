package grst.model.analytics;


import java.util.Locale;
import java.util.UUID;

import lombok.Value;

/**
 * Entity for: диаграмма / свойство (сущность для представления)
 */
@Value
public class AnalyticsDiagramPropertyView {

    // #
    UUID id;

    // описание сущности
    String entityDescriptionRu;

    // описание сущности
    String entityDescriptionEn;

    // описание сущности
    String entityDescriptionKz;

    // описание отношения
    String propertyDescriptionRu;

    // описание отношения
    String propertyDescriptionEn;

    // описание отношения
    String propertyDescriptionKz;


    // Localized property
    public String getEntityDescription(Locale locale) {
        var l = locale.getLanguage();
        if ("ru".equals(l)) return entityDescriptionRu;
        if ("en".equals(l)) return entityDescriptionEn;
        if ("kz".equals(l)) return entityDescriptionKz;
        return null;
    }

    // Localized property
    public String getPropertyDescription(Locale locale) {
        var l = locale.getLanguage();
        if ("ru".equals(l)) return propertyDescriptionRu;
        if ("en".equals(l)) return propertyDescriptionEn;
        if ("kz".equals(l)) return propertyDescriptionKz;
        return null;
    }
}
