package grst.model.kato;

import grst.model.AdtKatoCode;

import java.util.Locale;
import java.util.UUID;

import lombok.Value;

/**
 * Entity for: коды КАТО
 */
@Value
public class KatoExplain {

    // #
    UUID id;

    // AB
    int ab;

    // CD
    int cd;

    // код КАТО
    AdtKatoCode code;

    // описание
    String descriptionRu;

    // описание
    String descriptionEn;

    // описание
    String descriptionKz;

    // наименование иерархии 2
    String districtRu;

    // наименование иерархии 2
    String districtEn;

    // наименование иерархии 2
    String districtKz;

    // EF
    int ef;

    // HIJ
    int hij;

    // наименование иерархии 1
    String regionRu;

    // наименование иерархии 1
    String regionEn;

    // наименование иерархии 1
    String regionKz;

    // наименование иерархии 3
    String ruralDistrictRu;

    // наименование иерархии 3
    String ruralDistrictEn;

    // наименование иерархии 3
    String ruralDistrictKz;

    // наименование иерархии 4
    String settlementRu;

    // наименование иерархии 4
    String settlementEn;

    // наименование иерархии 4
    String settlementKz;


    // Localized property
    public String getDescription(Locale locale) {
        var l = locale.getLanguage();
        if ("ru".equals(l)) return descriptionRu;
        if ("en".equals(l)) return descriptionEn;
        if ("kz".equals(l)) return descriptionKz;
        return null;
    }

    // Localized property
    public String getDistrict(Locale locale) {
        var l = locale.getLanguage();
        if ("ru".equals(l)) return districtRu;
        if ("en".equals(l)) return districtEn;
        if ("kz".equals(l)) return districtKz;
        return null;
    }

    // Localized property
    public String getRegion(Locale locale) {
        var l = locale.getLanguage();
        if ("ru".equals(l)) return regionRu;
        if ("en".equals(l)) return regionEn;
        if ("kz".equals(l)) return regionKz;
        return null;
    }

    // Localized property
    public String getRuralDistrict(Locale locale) {
        var l = locale.getLanguage();
        if ("ru".equals(l)) return ruralDistrictRu;
        if ("en".equals(l)) return ruralDistrictEn;
        if ("kz".equals(l)) return ruralDistrictKz;
        return null;
    }

    // Localized property
    public String getSettlement(Locale locale) {
        var l = locale.getLanguage();
        if ("ru".equals(l)) return settlementRu;
        if ("en".equals(l)) return settlementEn;
        if ("kz".equals(l)) return settlementKz;
        return null;
    }
}
