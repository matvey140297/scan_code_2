package grst.model.analytics;


import java.util.UUID;

import lombok.Value;

/**
 * Entity for: диаграмма
 */
@Value
public class AnalyticsDiagram {

    // #
    UUID id;

    // тип диаграммы
    UUID analyticsDiagramToDiagramType;

    // сущность
    UUID analyticsDiagramToEntity;

    // группировка А
    UUID analyticsDiagramToGroupA;

    // группировка Б
    UUID analyticsDiagramToGroupB;

    // значение
    UUID analyticsDiagramToValue;

    // описание
    String description;

    // значение
    String functionGroupA;

    // значение
    String functionGroupB;

    // значение
    String functionValue;

    // наименование
    String name;

    // кешируемый и сгенерированный SQL
    String sql;


}
