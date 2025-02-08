package grst.model.agent;

import grst.model.AdtBin;
import lombok.Value;

import java.util.UUID;

@Value
public class AgentBailiffExplain {
    // #
    UUID id;

    // фамилия имя отчество
    String fio;

    // ИИН
    AdtBin iin;

    // наименование
    String name;
}
