package grst.model.analytics;


import java.util.Locale;
import java.util.UUID;

import lombok.Value;

/**
 * Entity for: отношения между сущностями
 */
@Value
public class AnalyticsRelation {

    // #
    UUID id;

    // сущность слева
    UUID analyticsRelationLeftEntity;

    // сущность справа
    UUID analyticsRelationRightEntity;

    // описание
    String descriptionRu;

    // описание
    String descriptionEn;

    // описание
    String descriptionKz;

    // наименование столбца слева
    String leftName;

    // наименование столбца справа
    String rightName;


    // Localized property
    public String getDescription(Locale locale) {
        var l = locale.getLanguage();
        if ("ru".equals(l)) return descriptionRu;
        if ("en".equals(l)) return descriptionEn;
        if ("kz".equals(l)) return descriptionKz;
        return null;
    }
}
