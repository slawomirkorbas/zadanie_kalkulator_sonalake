package sonalake.calc.domain.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: slawomir
 * Date: 5/1/17
 * Time: 10:22 AM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "country")
@NoArgsConstructor
@Data
public class Country implements Serializable {

    @Id
    String code;

    @Column(name="name")
    String name;

    @OneToOne(cascade=CascadeType.ALL)
    Currency currency;

    @OneToOne(cascade=CascadeType.ALL)
    Taxation taxation;

    public Country( String code, String name) {
         this.code = code;
         this.name = name;
    }

}
