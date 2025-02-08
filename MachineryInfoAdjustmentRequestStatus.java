package grst.model.adjustment.enums;

import java.util.stream.Stream;

/**
 * Статусы заявок на корректировку данных о машине
 * <b>NOTE</b>
 * <p>
 * Вверху списка должны отображаться заявки со статусом «Поступивший»,
 * «Принято в работу» Остальные заявки с другими статусами («Отказано», «Исполнено») должны отображаться с сортировкой
 * по дате и времени поступления – заявки с более поздней датой и временем поступления должны отображаться вверху
 * </p>
 */
public enum MachineryInfoAdjustmentRequestStatus {

    /**
     * Поступивший
     */
    RECEIVED,
    /**
     * Принято в работу
     */
    ACCEPTED_FOR_WORK,
    /**
     * Отказано
     */
    DENIED,
    /**
     * Исполнено
     */
    FULFILLED;

    public boolean in(MachineryInfoAdjustmentRequestStatus... statuses) {
        return Stream.of(statuses).anyMatch(s -> s == this);
    }

}
