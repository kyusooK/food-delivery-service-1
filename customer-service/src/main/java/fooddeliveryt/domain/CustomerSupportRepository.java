package fooddeliveryt.domain;

import fooddeliveryt.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "customerSupports",
    path = "customerSupports"
)
public interface CustomerSupportRepository
    extends PagingAndSortingRepository<CustomerSupport, Long> {}
