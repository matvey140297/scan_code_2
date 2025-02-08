package grst.model.agent;

import grst.model.AdtBin;
import grst.model.AdtKatoCode;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import lombok.Value;

/**
 * Entity for: agent: агент (юр лицо, физ лицо, нерезидент)
 */
@Value
public class Agent {

    // #
    UUID id;

    // адрес
    String address;

    // ассоциированный тип агента
    UUID agentToAgentType;

    // ассоциированная страна
    UUID agentToCountry;

    // кем выдан
    UUID agentToDocumentIssuer;

    // вид документа
    UUID agentToDocumentKind;

    // ассоциированный тип промышленности
    UUID agentToEnterpriseType;

    // ассоциированный ОПФ
    UUID agentToOpf;

    // ассоциированный тип адреса
    UUID agentToStreetType;

    // квартира
    String apartment;

    // дата рождения
    LocalDate birthDate;

    // предприниматель
    boolean businessman;

    // номер свид. гос. регистр.
    String certificateNumber;

    // расчетный счет
    String checkingAccount;

    // дата регистрации
    LocalDate documentIssueDate;

    // номер свид. гос. регистр.
    Integer documentNumber;

    // email
    String email;

    // имя
    String firstName;

    // глава
    String head;

    // должность главы
    String headPosition;

    // дом
    String house;

    // ИИН/БИН
    AdtBin ibin;

    // кем выдан
    String isIssuedByDocument;

    // фамилия
    String lastName;

    // идентификатор КАТО
    AdtKatoCode locationTe;

    // мобильный телефон
    String mobilePhone;

    // наименование
    String name;

    // код ОКПО
    String okpo;

    // отчество
    String patronymic;

    // регион
    String region;

    // дата регистрации
    LocalDate registerDate;

    // улица
    String street;

    // отметка времени
    LocalDateTime timeStamp;

    // рабочий телефон
    String workPhone;


}
