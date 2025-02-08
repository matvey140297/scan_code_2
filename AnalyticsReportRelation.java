package grst.model.analytics;


import java.util.UUID;

import lombok.Value;

/**
 * Entity for: отчет / джойн
 */
@Value
public class AnalyticsReportRelation {

    // #
    UUID id;

    // отношение
    UUID analyticsReportRelationToRelation;

    // отчет
    UUID analyticsReportRelationToReport;


}
