package untitled.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import untitled.CustomerServiceApplication;
import untitled.domain.CustomerSupportProvided;

@Entity
@Table(name = "CustomerSupport_table")
@Data
//<<< DDD / Aggregate Root
public class CustomerSupport {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long supportId;

    private Long orderId;

    private String supportMessage;

    @PostPersist
    public void onPostPersist() {
        CustomerSupportProvided customerSupportProvided = new CustomerSupportProvided(
            this
        );
        customerSupportProvided.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static CustomerSupportRepository repository() {
        CustomerSupportRepository customerSupportRepository = CustomerServiceApplication.applicationContext.getBean(
            CustomerSupportRepository.class
        );
        return customerSupportRepository;
    }
}
//>>> DDD / Aggregate Root
