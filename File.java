package grst.model.file;


import java.util.UUID;

import lombok.Value;

/**
 * Entity for: прикрепляемый файл (только метаданные)
 */
@Value
public class File {

    // системный идентификатор
    UUID id;

    // mime тип
    String mime;

    // имя файла
    String name;


}
