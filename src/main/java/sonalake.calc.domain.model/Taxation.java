package sonalake.calc.domain.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 * User: slawomir
 * Date: 5/1/17
 * Time: 10:27 AM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "taxation")
@NoArgsConstructor
@Data
public class Taxation implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(name="value" )
    BigDecimal value;

    @Column(name="constant_costs" )
    BigDecimal constantCosts;

    public Taxation(BigDecimal value, BigDecimal costs) {
        this.value = value;
        this.constantCosts = costs;
    }
}
