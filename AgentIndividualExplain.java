package grst.model.agent;

import grst.model.AdtBin;

import java.time.LocalDate;
import java.util.UUID;

import lombok.Value;

/**
 * Entity for: agent: агент (физ лицо)
 */
@Value
public class AgentIndividualExplain {

    // #
    UUID id;

    // дата рождения
    LocalDate birthDate;

    // фамилия имя отчество
    String fio;

    // ИИН
    AdtBin iin;

    // наименование
    String name;


}
