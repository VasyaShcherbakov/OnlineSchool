package OnLIneScool.entyty;

@Cacheable
@org.hibernate.annotations.Cache(
        usage = CacheConcurrencyStrategy.READ_WRITE)
@Table(name = "filters")

public class Filter {

}
