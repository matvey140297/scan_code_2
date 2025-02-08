package grst.model.arrest;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import lombok.Value;

/**
 * Entity for: arrest: аресты
 */
@Value
public class Arrest {

    // системный идентификатор
    UUID id;

    // дата подписания документа
    LocalDate approvalDate;

    // дата ареста
    LocalDate arrestDate;

    // ассоциированный инициатор ареста
    UUID arrestToAgent;

    // агрегированное имя файла
    UUID arrestToFile;

    // ассоциированное транспортное средство
    UUID arrestToMachinery;

    // комментарий
    String comment;

    // наименование документа
    String documentName;

    // номер документа
    String documentNumber;

    // исходящее письмо
    String outgoingMail;

    // дата снятия ареста
    LocalDate removeArrestDate;

    // отметка времени
    LocalDateTime timeStamp;


}
