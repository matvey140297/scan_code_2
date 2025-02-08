package grst.model.dic;

import grst.model.AdtKatoCode;
import lombok.Value;

import java.util.Locale;
import java.util.UUID;

@Value
public class District {

    UUID katoId;

    AdtKatoCode code;

    String regionRu;

    String regionEn;

    String regionKz;

    String districtRu;

    String districtEn;

    String districtKz;

    String ruralRu;

    String ruralEn;

    String ruralKz;

    String settlementRu;

    String settlementEn;

    String settlementKz;

    public String getRegionName(Locale locale) {
        var l = locale.getLanguage();
        if ("ru".equals(l)) return regionRu;
        if ("en".equals(l)) return regionEn;
        if ("kz".equals(l)) return regionKz;
        return null;
    }

    public String getDistrictName(Locale locale) {
        var l = locale.getLanguage();
        if ("ru".equals(l)) return districtRu;
        if ("en".equals(l)) return districtEn;
        if ("kz".equals(l)) return districtKz;
        return null;
    }

    public String getRuralName(Locale locale) {
        var l = locale.getLanguage();
        if ("ru".equals(l)) return ruralRu;
        if ("en".equals(l)) return ruralEn;
        if ("kz".equals(l)) return ruralKz;
        return null;
    }

    public String getSettlementName(Locale locale) {
        var l = locale.getLanguage();
        if ("ru".equals(l)) return settlementRu;
        if ("en".equals(l)) return settlementEn;
        if ("kz".equals(l)) return settlementKz;
        return null;
    }
}
