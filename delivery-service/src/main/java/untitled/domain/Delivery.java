package untitled.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import untitled.DeliveryServiceApplication;
import untitled.domain.DeliveryArranged;
import untitled.domain.FoodPickedUp;

@Entity
@Table(name = "Delivery_table")
@Data
//<<< DDD / Aggregate Root
public class Delivery {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long deliveryId;

    private Long orderId;

    private Address deliveryAddress;

    @PostPersist
    public void onPostPersist() {
        DeliveryArranged deliveryArranged = new DeliveryArranged(this);
        deliveryArranged.publishAfterCommit();

        FoodPickedUp foodPickedUp = new FoodPickedUp(this);
        foodPickedUp.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {
        // 비즈니스 로직 추가
        if (this.deliveryId == null || this.deliveryId == 0) {
            throw new IllegalStateException(
                "DeliveryId must not be null or zero"
            );
        }
        if (this.orderId == null || this.orderId == 0) {
            throw new IllegalStateException("OrderId must not be null or zero");
        }
        if (this.deliveryAddress == null) {
            throw new IllegalStateException("DeliveryAddress must not be null");
        }
    }

    public static DeliveryRepository repository() {
        DeliveryRepository deliveryRepository = DeliveryServiceApplication.applicationContext.getBean(
            DeliveryRepository.class
        );
        return deliveryRepository;
    }
}
//>>> DDD / Aggregate Root
