package grst.model.analytics;


import java.util.Locale;
import java.util.UUID;

import lombok.Value;

/**
 * Entity for: тип диаграммы
 */
@Value
public class AnalyticsDiagramType {

    // #
    UUID id;

    String axe1;

    String axe2;

    String axe3;

    // описание
    String descriptionRu;

    // описание
    String descriptionEn;

    // описание
    String descriptionKz;

    boolean flagCircle;

    boolean flagFill;

    boolean flagStack;

    // системное наименование
    String name;

    boolean showLabels;

    boolean showTotal;


    // Localized property
    public String getDescription(Locale locale) {
        var l = locale.getLanguage();
        if ("ru".equals(l)) return descriptionRu;
        if ("en".equals(l)) return descriptionEn;
        if ("kz".equals(l)) return descriptionKz;
        return null;
    }
}
