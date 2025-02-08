package grst.model.analytics;


import java.util.UUID;

import lombok.Value;

/**
 * Entity for: приборная доска
 */
@Value
public class AnalyticsDashboard {

    // #
    UUID id;

    // описание
    String description;

    // наименование
    String name;


}
