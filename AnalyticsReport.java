package grst.model.analytics;


import java.util.UUID;

import lombok.Value;

/**
 * Entity for: отчет
 */
@Value
public class AnalyticsReport {

    // #
    UUID id;

    // сущность
    UUID analyticsReportToEntity;

    // описание
    String description;

    // наименование
    String name;

    // кешируемый и сгенерированный SQL
    String sql;


}
