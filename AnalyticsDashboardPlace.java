package grst.model.analytics;


import java.util.UUID;

import lombok.Value;

/**
 * Entity for: приборная доска / одно место на приборной доске
 */
@Value
public class AnalyticsDashboardPlace {

    // #
    UUID id;

    // доска
    UUID analyticsDashboardPlaceToDashboard;

    // диаграмма
    UUID analyticsDashboardPlaceToDiagram;

    // высота
    int height;

    // место
    int place;

    // ширина
    int width;


}
