package grst.model.dic;

import lombok.Value;

import java.util.Locale;
import java.util.UUID;

@Value
public class ActCause {

    UUID id;
    String nameRu;
    String nameEn;
    String nameKz;

    public String getName(Locale locale) {
        var l = locale.getLanguage();
        if ("ru".equals(l)) return nameKz;
        if ("en".equals(l)) return nameKz;
        if ("kz".equals(l)) return nameKz;
        return null;
    }
}
