package grst.model.dic;


import java.util.UUID;

import lombok.Value;

/**
 * Entity for: document-issuer: кем выдан документ (у.л.)
 */
@Value
public class DocumentIssuer {

    // #
    UUID id;

    // наименование
    String name;


}
