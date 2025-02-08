package grst.model.adjustment;

import grst.model.adjustment.enums.MachineryInfoAdjustmentRequestStatus;
import grst.model.adjustment.enums.MachineryInfoAdjustmentType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "grst_machinery_info_adjustment_request")
public class AdjustmentEntity {
    @Id
    private Long id;

    /**
     * отметка времени
     */
    @Column(name = "time_stamp")
    LocalDateTime timeStamp;

    /**
     * причина отказа
     */
    @Column(name = "reject_reason")
    String rejectReason;

    /**
     * тип заявки на корректировку
     */
    @Column
    @Enumerated(value = EnumType.STRING)
    MachineryInfoAdjustmentType type;

    /**
     * статус заявки
     */
    @Column
    @Enumerated(value = EnumType.STRING)
    MachineryInfoAdjustmentRequestStatus status;

    /**
     * ид запроса со стороны егов
     */
    @Column
    String messageId;

    /**
     * ид который якобы используется в асинхронном запросе
     */
    @Column
    String correlationId;

    /**
     * исполнитель;
     */
    @Column(name = "executor_id")
    UUID executorId;

    /**
     * BIN
     */
    @Column
    String ibin;

    /**
     *
     */
    @Column(name = "gov_number")
    String govNumber;

    /**
     * Номер технического паспорта
     */
    @Column(name = "tech_passport_number")
    String techPassport;

    /**
     * Серия технического паспорта
     */
    @Column(name = "tech_passport_series")
    String techPassportSeries;

    /**
     *
     */
    @Column(name = "graduation_year")
    String graduationYear;

    /**
     *
     */
    @Column(name = "vin")
    String vin;

    /**
     *
     */
    @Column(name = "engine_number")
    String engineNumber;

    /**
     *
     */
    @Column(name = "model_data")
    String modelData;
}
