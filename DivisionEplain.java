package grst.model.dic;

import grst.model.AdtKatoCode;
import lombok.Value;

/**
 * Entity for: division: иерархия подразделений в развернутом виде
 */
@Value
public class DivisionEplain {

    // наименование
    String l1;

    // TE блок
    AdtKatoCode locationTe;


}
