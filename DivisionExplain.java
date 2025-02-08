package grst.model.dic;

import grst.model.AdtKatoCode;

import java.util.UUID;

import lombok.Value;

/**
 * Entity for: division: иерархия подразделений в развернутом виде
 */
@Value
public class DivisionExplain {

    // #
    UUID id;

    // наименование
    String l1;

    // наименование
    String l2;

    // наименование
    String l3;

    // наименование
    String l4;

    // TE блок
    AdtKatoCode locationTe;


}
