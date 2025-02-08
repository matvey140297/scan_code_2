package grst.model.analytics;


import java.util.Locale;
import java.util.UUID;

import lombok.Value;

/**
 * Entity for: исследуемая сущность
 */
@Value
public class AnalyticsEntity {

    // #
    UUID id;

    // описание
    String descriptionRu;

    // описание
    String descriptionEn;

    // описание
    String descriptionKz;

    // наименование таблицы
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
