package grst.model.dic;

import grst.model.AdtCurrencyCode;

import java.util.UUID;

import lombok.Value;

/**
 * Entity for: currency: коды валют по стандарту ISO 4217 (KZT например)
 */
@Value
public class Currency {

    // #
    UUID id;

    // наименование
    AdtCurrencyCode name;


}
