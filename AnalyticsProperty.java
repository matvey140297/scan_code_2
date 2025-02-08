package grst.model.analytics;


import java.util.Locale;
import java.util.UUID;

import lombok.Value;

/**
 * Entity for: исследуемая сущность / свойство
 */
@Value
public class AnalyticsProperty {

    // #
    UUID id;

    // сущность
    UUID analyticsPropertyToEntity;

    // описание
    String descriptionRu;

    // описание
    String descriptionEn;

    // описание
    String descriptionKz;

    // наименование столбца
    String name;


    // Localized property
    public String getDescription(Locale locale) {
        var l = locale.getLanguage();
        if ("ru".equals(l)) return descriptionRu;
        if ("en".equals(l)) return descriptionEn;
        if ("kz".equals(l)) return descriptionKz;
        return null;
    }
}
