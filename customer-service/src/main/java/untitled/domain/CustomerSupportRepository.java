package untitled.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import untitled.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "customerSupports",
    path = "customerSupports"
)
public interface CustomerSupportRepository
    extends PagingAndSortingRepository<CustomerSupport, Long> {}
