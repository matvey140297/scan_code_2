package grst.model.analytics;


import java.util.UUID;

import lombok.Value;

/**
 * Entity for: диаграмма / джойн
 */
@Value
public class AnalyticsDiagramRelation {

    // #
    UUID id;

    // диаграмма
    UUID analyticsDiagramRelationToDiagram;

    // отношение
    UUID analyticsDiagramRelationToRelation;


}
