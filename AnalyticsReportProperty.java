package grst.model.analytics;


import java.time.LocalDateTime;
import java.util.UUID;

import lombok.Value;

/**
 * Entity for: отчет / свойство
 */
@Value
public class AnalyticsReportProperty {

    // #
    UUID id;

    // свойство
    UUID analyticsReportPropertyToProperty;

    // отчет
    UUID analyticsReportPropertyToReport;

    // время создания
    LocalDateTime ts;


}
