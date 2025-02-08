package grst.model.analytics;


import java.util.UUID;

import lombok.Value;

/**
 * Entity for: диаграмма / условие
 */
@Value
public class AnalyticsDiagramCondition {

    // #
    UUID id;

    // диаграмма
    UUID analyticsDiagramConditionToDiagram;

    // свойство
    UUID analyticsDiagramConditionToProperty;

    // функция
    String function;

    // значение
    String value;


}
