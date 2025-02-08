package grst.model.analytics;


import java.util.UUID;

import lombok.Value;

/**
 * Entity for: отчет / сортировка
 */
@Value
public class AnalyticsReportSort {

    // #
    UUID id;

    // свойство
    UUID analyticsReportSortToProperty;

    // отчет
    UUID analyticsReportSortToReport;

    // порядок
    boolean descending;


}
